package com.gzeinnumer.kadesharedpreferencesktx

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var sessionManager: SessionManager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MyApp.context?.let{
            sessionManager = SessionManager(it)
        }

        sessionManager?.TOKEN = "Token"

        Toast.makeText(applicationContext, "2 : "+sessionManager?.TOKEN, Toast.LENGTH_SHORT).show()
    }
}
