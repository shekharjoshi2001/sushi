package com.example.susshi

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.susshi.databinding.ActivityMainBinding


class second : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)


    }
}