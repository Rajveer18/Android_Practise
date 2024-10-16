package com.example.pizza_pagekt

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        var a =findViewById<Button>(R.id.checkbox)
        var b =findViewById<Button>(R.id.checkbox1)
        var c =findViewById<Button>(R.id.checkbox2)
        var d =findViewById<Button>(R.id.checkbox4)
        var e =findViewById<Button>(R.id.checkbox5)
        var f =findViewById<Button>(R.id.checkbox6)

        
        }
    }
}