package com.example.testserviceapp

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log

class MyService : Service() {

    val TAG = "MyService"

    override fun onBind(intent: Intent?): IBinder? {
        Log.d(TAG, "onBind")
        return null
    }

    override fun onCreate() {
        super.onCreate()
        Log.d(TAG, "onCreate")
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        return super.onStartCommand(intent, flags, startId)
        Log.d(TAG, "onStartCommand")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy")
    }


}