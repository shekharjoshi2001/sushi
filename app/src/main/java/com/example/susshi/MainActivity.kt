package com.example.susshi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import androidx.activity.result.contract.ActivityResultContracts

import android.view.WindowManager


class splash:AppCompatActivity()
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
      Handler().postDelayed({
          val intent=Intent(this,SActivity::class.java)
          startActivity(intent)
          finish()


      },3000)
    }
}
