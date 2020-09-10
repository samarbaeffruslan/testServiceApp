package com.example.testserviceapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var startServiceButton: Button
    lateinit var stopServiceButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startServiceButton = findViewById(R.id.startService)
        stopServiceButton = findViewById(R.id.stopService)

        startServiceButton.setOnClickListener {
            startService(Intent(this, MyService::class.java))
        }

        stopServiceButton.setOnClickListener {
            stopService(Intent(this, MyService::class.java))
        }
    }
}