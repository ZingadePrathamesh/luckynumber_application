package com.example.luckynumber

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val editText: EditText = findViewById(R.id.name_edittext)
        val generateButton: Button = findViewById(R.id.generate_button)
        generateButton.setOnClickListener(){
            val intent = Intent(this, LuckyNumberView::class.java)
            intent.putExtra("name", editText.text.toString())
            intent.putExtra("number", generateLuckyNumber().toString())
            startActivity(intent)
        }

    }
    fun generateLuckyNumber(): Int {
        val random = (1..100).random() // generates a random number between 1 and 100
        return random
    }
}