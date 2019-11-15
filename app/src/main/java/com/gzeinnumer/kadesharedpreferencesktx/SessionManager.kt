package com.gzeinnumer.kadesharedpreferencesktx

import android.content.Context
import android.content.SharedPreferences
import androidx.core.content.edit

class SessionManager(contex: Context){
    val PREF_NAME = "SIMPAN"
    val KEY_TOKEN = "TOKEN"
    val prefs: SharedPreferences = contex.getSharedPreferences(PREF_NAME,0)
    val default:String = ""

    var TOKEN: String
        get() = prefs.getString(KEY_TOKEN,default)!!
        set(value) = prefs.edit{
            putString(KEY_TOKEN , value)
            putString(KEY_TOKEN , value)
        }

}