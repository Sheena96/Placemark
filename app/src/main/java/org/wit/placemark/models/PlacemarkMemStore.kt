package org.wit.placemark.models

import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.info

/**
 * Created by sheenakelly on 24/01/2018.
 */
class PlacemarkMemStore : PlacemarkStore, AnkoLogger {

    val placemarks = ArrayList<PlacemarkModel>()

    override fun findAll(): List<PlacemarkModel> {
        return placemarks
    }

    override fun create(placemark: PlacemarkModel) {
        placemarks.add(placemark)
        logPlacemarks()

    }

    fun logPlacemarks() {
        findAll().forEach{ info("add Button Pressed: ${it}") }
    }

}