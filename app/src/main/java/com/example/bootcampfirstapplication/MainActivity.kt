package com.example.bootcampfirstapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnToTugas1 =findViewById<Button>(R.id.buttonTugas1);
        btnToTugas1.setOnClickListener {
            val intent = Intent(this, Tugas1::class.java)
            startActivity(intent)
        }
    }
}