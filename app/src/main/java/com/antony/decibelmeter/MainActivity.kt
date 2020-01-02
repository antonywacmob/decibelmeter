package com.antony.decibelmeter

import android.media.MediaPlayer
import android.media.audiofx.Visualizer
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch
import kotlin.system.measureTimeMillis

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dbMeter: DecibelMeter = findViewById(R.id.gaugeView)
        dbMeter.setTargetValue(20f)

        val player = MediaPlayer.create(this, R.raw.music)
        player.setOnPreparedListener {
//            dbMeter.setVisualiser(Visualizer(it.audioSessionId))
        }
        player.start()

//        val sample: Flow<String> = flow {
//            delay(2000)
//            emit("a")
//            delay(2000)
//            emit("b")
//            delay(2000)
//            emit("c")
//            delay(2000)
//            emit("d")
//            delay(2000)
//            emit("e")
//            delay(2000)
//        }
//
//        lifecycleScope.launch {
//
//            val time = measureTimeMillis {
//                sample.collect {
//                    Toast.makeText(this@MainActivity, it, Toast.LENGTH_SHORT).show()
//                }
//            }
//
//            Toast.makeText(this@MainActivity, time.toString(), Toast.LENGTH_SHORT).show()
//        }


//        lifecycleScope.launch {
//            repeat(1000){
//                dbMeter.setTargetValue(50f)
//                delay(120)
//                dbMeter.setTargetValue(35f)
//                delay(120)
//            }
//        }

    }
}
