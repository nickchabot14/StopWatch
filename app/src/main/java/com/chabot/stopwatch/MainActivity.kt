package com.chabot.stopwatch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import android.util.Log
import android.view.ActionMode
import android.widget.Button
import android.widget.Chronometer

lateinit var stopWatch : Chronometer
lateinit var start : Button
lateinit var reset : Button
var watchOn : Boolean = false
var time = 0L
class MainActivity : AppCompatActivity() {
    companion object{
        val TAG = "MainActivity"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        wirewidgets()
        //æääāåãáà
        start.setOnClickListener {
            //startChronometer()
            start.text = "Stop"
            if(watchOn){
                stopWatch.stop()
                time = SystemClock.elapsedRealtime() - stopWatch.base
                start.text="Resume"
            }
            else{
                stopWatch.start()
                start.text = "stop"
                stopWatch.base = SystemClock.elapsedRealtime() - time
            }
            watchOn = !watchOn
        }

        reset.setOnClickListener {
            if(watchOn) {
                start.callOnClick()

            }
            time = 0L
            stopWatch.base = SystemClock.elapsedRealtime()
            watchOn = !watchOn
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "OnStart: ")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "OnResume: ")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "OnPause: ")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "OnStop: ")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "OnRestart: ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "OnDestroy: ")
    }

    private fun startChronometer() {

    }



    private fun wirewidgets(){
        stopWatch = findViewById(R.id.chronometer_main_stopwatch)
        start = findViewById(R.id.button)
        reset = findViewById(R.id.button2)
    }
}