package com.example.activity1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myButton = findViewById<Button>(R.id.Login)
        myButton.setOnClickListener {
            val intent = Intent(this@MainActivity, Home::class.java)
            startActivity(intent)
        }

            val myTextView = findViewById<TextView>(R.id.SignUptxt)
            myTextView.setOnClickListener {
                val intent = Intent(this@MainActivity, SignUp::class.java)
                startActivity(intent)
            }

        }
    }
