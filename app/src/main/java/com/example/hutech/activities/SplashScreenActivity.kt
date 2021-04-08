package com.example.hutech.activities

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import com.example.hutech.R

class SplashScreenActivity : BaseActivity() {
    private val SPLASH_TIME_OUT:Long=3000 // 3 sec
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        Handler().postDelayed({
            // This method will be executed once the timer is over
            // Start your app main activity

            startActivity(Intent(this, HomeActivity::class.java))
            // close this activity
            finish()
        }, SPLASH_TIME_OUT)

    }
}