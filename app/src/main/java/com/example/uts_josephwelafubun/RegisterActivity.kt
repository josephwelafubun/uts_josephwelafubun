package com.example.uts_josephwelafubun

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        textMasuk.setOnClickListener {
            val intent = Intent ( this, MainActivity::class.java)
            startActivity(intent)
        }

        buttonDaftar.setOnClickListener {
            val intent = Intent ( this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}