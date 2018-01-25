package org.wit.placemarks.activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_placemark.*
import org.jetbrains.anko.*
import org.wit.placemark.R
import org.wit.placemark.main.MainApp
import org.wit.placemark.models.PlacemarkModel

class PlacemarkActivity : AppCompatActivity(), AnkoLogger {

    var placemark = PlacemarkModel()
    lateinit var app: MainApp

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_placemark)
        app = application as MainApp

        btnAdd.setOnClickListener() {
            placemark.title = placemarkTitle.text.toString()
            placemark.description = description.text.toString()
            if (placemark.title.isNotEmpty()) {
                app.placemarkStore.create(placemark.copy())
                info("add Button Pressed: $placemark")
                //app.placemarkStore.findAll().forEach{ info("add Button Pressed: ${it}") }
                setResult(AppCompatActivity.RESULT_OK)
                finish()
            } else {
                toast("Please Enter a title")
            }
        }

        btnCancel.setOnClickListener() {
            info("Canel Button Pressed ")
            Intent(this, PlacemarkListActivity::class.java)
            setResult(AppCompatActivity.RESULT_CANCELED)
            finish()
        }
    }
}
