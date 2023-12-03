package com.example.meeting_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast

class AboutActivity : AppCompatActivity() {
    private val LOG_TAG = "MainActivity_About"
    private var startTime : Long = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        Log.i(LOG_TAG, "onCreate")

        startTime = System.currentTimeMillis();
    }

    override fun onStart(){
        super.onStart()
        val currentTime = System.currentTimeMillis()
        Log.i(LOG_TAG, "onStart, Time elapsed: ${currentTime - startTime} ms")
    }

    override fun onResume() {
        super.onResume()
        val currentTime = System.currentTimeMillis()
        Log.i(LOG_TAG, "onResume, Time elapsed: ${currentTime - startTime} ms")
    }

    override fun onRestart() {
        super.onRestart()
        val currentTime = System.currentTimeMillis()
        Log.i(LOG_TAG, "onRestart")
    }

    override fun onStop() {
        super.onStop()
        val currentTime = System.currentTimeMillis()
        Log.i(LOG_TAG, "onStop, Time elapsed: ${currentTime - startTime} ms\"")
    }

    override fun onPause() {
        super.onPause()
        val currentTime = System.currentTimeMillis()
        Log.i(LOG_TAG, "onPause, Time elapsed: ${currentTime - startTime} ms\"")
    }

    override fun onDestroy() {
        super.onDestroy()
        val currentTime = System.currentTimeMillis()
        Log.i(LOG_TAG, "onDestroy, Time elapsed: ${currentTime - startTime} ms\"")
    }

    fun buttonClickTest(view: View)
    {
        val currentTime = System.currentTimeMillis()
        val toast = Toast.makeText(
            applicationContext,
            "Clicked: buttonClickTest, Time elapsed: ${currentTime - startTime} ms",
            Toast.LENGTH_SHORT
        )
        toast.show()
        finish()
    }
}