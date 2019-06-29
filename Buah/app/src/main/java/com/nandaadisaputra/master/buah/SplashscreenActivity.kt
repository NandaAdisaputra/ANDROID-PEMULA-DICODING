package com.nandaadisaputra.master.buah

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import org.jetbrains.anko.startActivity

class SplashscreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)

        Handler().postDelayed({
            finish()
            //anko
            startActivity<MainActivity>()
        }, 3000)

    }
}

