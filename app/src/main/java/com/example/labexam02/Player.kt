package com.example.labexam02

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Player : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_player)


        val home : ImageView = findViewById(R.id.imageView15)

        home.setOnClickListener({
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        })
        }
    }
