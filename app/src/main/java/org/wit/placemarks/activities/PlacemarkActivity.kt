package org.wit.placemarks.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_placemark.*
import org.jetbrains.anko.*
import org.wit.placemark.R
import org.wit.placemark.models.PlacemarkModel

class PlacemarkActivity : AppCompatActivity(), AnkoLogger
{
    // Creating an array list of Placemarks, and logging them
    val placemarks = ArrayList<PlacemarkModel>()

    var placemark = PlacemarkModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_placemark)

        btnAdd.setOnClickListener() {
            placemark.title = placemarkTitle.text.toString()
            placemark.description = description.text.toString()
            placemarks.add(placemark.copy())
            for (i in placemarks){
                info(i);
            }
            if (placemark.title.isNotEmpty()) {
                info("add Button Pressed: $placemark")
            }
            else {
                toast ("Please Enter a title")
            }
            if (placemark.description.isNotEmpty()) {
                info("add Button Pressed: $description")
            }
            else {
                toast ("Please Enter a description")
            }
            /*toast("Hi there!")
            toast(R.string.message)
            longToast("Wow, such duration")*/

            /*snackbar(view, "Hi there!")
            snackbar(view, R.string.message)
            longSnackbar(view, "Wow, such duration")
            snackbar(view, "Action, reaction", "Click me!") { doStuff() }*/

            /*alert("Hi, I'm Roy", "Have you tried turning it off and on again?") {
                yesButton { toast("Oh…") }
                noButton {}
            }.show()*/

            /*val countries = listOf("Russia", "USA", "Japan", "Australia")
            selector("Where are you from?", countries, { dialogInterface, i ->
                toast("So you're living in ${countries[i]}, right?")
            })*/

           /* val dialog = progressDialog(message = "Please wait a bit…", title = "Fetching data")*/

        }

    }
}
