package com.example.luckynumber

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class LuckyNumberView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lucky_number_view)
        val nameTextView: TextView = findViewById(R.id.name_textview)
        val luckyNumberView: TextView = findViewById(R.id.luckynumber_textview)
        val bundle: Bundle? = intent.extras
        val number = bundle?.get("number")
        val name = bundle?.get("name")
        nameTextView.setText("Woo Hoo! "+ name.toString())
        luckyNumberView.setText(number.toString())
        val shareButton: Button = findViewById(R.id.share_button)
        shareButton.setOnClickListener(){
            val intent1 = Intent(Intent.ACTION_SEND)
            intent1.setType("text/plain")
            intent1.putExtra(Intent.EXTRA_SUBJECT, "Prathamesh")
            intent1.putExtra(Intent.EXTRA_TEXT, "Hii! my name is")
            startActivity(intent1)
        }
    }

}