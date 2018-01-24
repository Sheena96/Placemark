package org.wit.placemark.main

/**
 * Created by sheenakelly on 22/01/2018.
 */

import android.app.Application
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.info
//import org.wit.placemark.models.PlacemarkMemStore
import org.wit.placemark.models.PlacemarkModel

class MainApp : Application(), AnkoLogger {

    val placemarks = ArrayList<PlacemarkModel>()
    /*val placemarkStore = PlacemarkMemStore()

    override fun onCreate() {
        super.onCreate()
        info("Placemark started")
    }*/

}