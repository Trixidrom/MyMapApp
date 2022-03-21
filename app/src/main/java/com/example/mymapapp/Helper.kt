package com.example.mymapapp

import android.content.Context
import android.content.pm.PackageManager

class Helper {
    companion object {
        fun getMapTilerKey(context: Context): String? {
            return "B1gRU31uDUFc49NlyVW3"

//            return context.packageManager.getApplicationInfo(
//                context.packageName,
//                PackageManager.GET_META_DATA
//            ).metaData.getString("com.example.mymapapp.mapTilerKey")
        }

        fun validateKey(mapTilerKey: String?) {
            if (mapTilerKey == null) {
                throw Exception("Failed to read MapTiler key")
            }
            if (mapTilerKey.toLowerCase() == "placeholder") {
                throw Exception("Please enter correct MapTiler key in module-level gradle.build file in defaultConfig section")
            }
        }
    }
}
