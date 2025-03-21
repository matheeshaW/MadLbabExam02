package com.example.labexam02

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val goHome : Button = findViewById(R.id.buttonLogin)
        val editEmail : EditText = findViewById(R.id.editEmail)
        val sharedPreferences = getSharedPreferences("UserPrefs", MODE_PRIVATE)



        goHome.setOnClickListener{
            val email =editEmail.text.toString()

            // Save user-entered email or keep "Guest" if empty
            sharedPreferences.edit().putString("USER_EMAIL", if (email.isNotEmpty()) email else "Guest@email.com").apply()
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }

    }
}