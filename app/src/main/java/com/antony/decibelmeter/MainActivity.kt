package com.antony.decibelmeter

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dbMeter:DecibelMeter = findViewById(R.id.gaugeView)

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
