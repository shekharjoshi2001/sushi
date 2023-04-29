package com.example.susshi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.susshi.databinding.ActivitySactivityBinding

class SActivity : AppCompatActivity() {
    lateinit var binding: ActivitySactivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sactivity)
        binding= ActivitySactivityBinding.inflate(layoutInflater)
        binding.ca.setOnClickListener{
            val intent= Intent(this,third::class.java)
            startActivity(intent)
        }
        setContentView(binding.root)

    }
}