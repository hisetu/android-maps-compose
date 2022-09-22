package com.google.maps.android.compose

import android.app.Application
import android.util.Log
import com.google.android.gms.maps.MapsInitializer

class MapApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        MapsInitializer.initialize(applicationContext, MapsInitializer.Renderer.LATEST) {
            when (it) {
                MapsInitializer.Renderer.LATEST ->
                    Log.d("MapsDemo", "The latest version of the renderer is used.")
                MapsInitializer.Renderer.LEGACY ->
                    Log.d("MapsDemo", "The legacy version of the renderer is used.")
            }
        }
    }
}