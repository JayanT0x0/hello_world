package com.example.hello_world

import android.os.Bundle
import android.os.PersistableBundle
import androidx.annotation.ContentView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}