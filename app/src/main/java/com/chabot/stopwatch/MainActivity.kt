package com.chabot.stopwatch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Chronometer

lateinit var stopWatch : Chronometer
lateinit var start : Button
lateinit var reset : Button
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        wirewidgets()
        //æääāåãáà
    }

    private fun wirewidgets(){
        stopWatch = findViewById(R.id.chronometer_main_stopwatch)
        start = findViewById(R.id.button)
        reset = findViewById(R.id.button2)
    }
}