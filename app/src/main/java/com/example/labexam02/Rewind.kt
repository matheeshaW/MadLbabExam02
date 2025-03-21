package com.example.labexam02

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Rewind : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_rewind)



        val home : ImageView = findViewById(R.id.homebtn)

        home.setOnClickListener({
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        })

        val discover : ImageView = findViewById(R.id.discoverbtn)

        discover.setOnClickListener({
            val intent = Intent(this, Discover::class.java)
            startActivity(intent)
        })


        val rewind : ImageView = findViewById(R.id.rewindbtn)

        rewind.setOnClickListener({
            val intent = Intent(this, Rewind::class.java)
            startActivity(intent)
        })

        val profile : ImageView = findViewById(R.id.profilebtn)

        profile.setOnClickListener({
            val intent = Intent(this, Profile::class.java)
            startActivity(intent)
        })
    }
}