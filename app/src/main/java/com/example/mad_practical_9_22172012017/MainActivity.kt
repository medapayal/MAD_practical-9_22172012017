package com.example.mad_practical_9_22172012017

import android.graphics.drawable.Animatable
import android.graphics.drawable.AnimationDrawable
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.view.animation.Animation
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    lateinit var alarminimation:AnimationDrawable
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val img: ImageView = findViewById(R.id.alarmimage)
        img.setBackgroundResource(R.drawable.alarm_animation_list)
        alarminimation = img.background as AnimationDrawable
    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
       if(hasFocus)
       {
           alarminimation.start()

       }
        else
       {
           alarminimation.stop()
       }
    }


    }
