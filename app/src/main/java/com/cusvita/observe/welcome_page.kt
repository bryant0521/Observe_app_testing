package com.cusvita.observe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class welcome_page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome_page)
    val button : Button = findViewById(R.id.button)
        button.setOnClickListener {
            val intent = Intent(this, log_in_page::class.java)
            startActivity(intent)
        }
    val getStartedImageButton : ImageButton = findViewById(R.id.get_started_button)
        getStartedImageButton.setOnClickListener {
            val intent = Intent(this, sign_up_page::class.java)
            startActivity(intent)
        }
    }
}