package com.example.meeting_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private val LOG_TAG = "MainActivity"
    private var startTime : Long = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(LOG_TAG, "onCreate")

        startTime = System.currentTimeMillis();

        val textView = findViewById<TextView>(R.id.textView)
        //textView.text = "test"
        textView.text = getString(R.string.title)
    }

    override fun onStart(){
        val currentTime = System.currentTimeMillis()
        super.onStart()
        Log.i(LOG_TAG, "onStart, Time elapsed: ${currentTime - startTime} ms")
    }

    override fun onResume() {
        val currentTime = System.currentTimeMillis()
        super.onResume()
        Log.i(LOG_TAG, "onResume, Time elapsed: ${currentTime - startTime} ms")
    }

    override fun onRestart() {
        val currentTime = System.currentTimeMillis()
        super.onRestart()
        Log.i(LOG_TAG, "onRestart, Time elapsed: ${currentTime - startTime} ms")
    }

    override fun onStop() {
        val currentTime = System.currentTimeMillis()
        super.onStop()
        Log.i(LOG_TAG, "onStop, Time elapsed: ${currentTime - startTime} ms")
    }

    override fun onPause() {
        val currentTime = System.currentTimeMillis()
        super.onPause()
        Log.i(LOG_TAG, "onPause, Time elapsed: ${currentTime - startTime} ms")
    }

    override fun onDestroy() {
        val currentTime = System.currentTimeMillis()
        super.onDestroy()
        Log.i(LOG_TAG, "onDestroy, Time elapsed: ${currentTime - startTime} ms")
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

        val intent = Intent(this, AboutActivity::class.java)
        startActivity(intent)
    }
}