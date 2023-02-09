package com.example.bootcampfirstapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Tugas1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tugas1)
        val btnToMain = findViewById<ImageView>(R.id.backButton)
        btnToMain.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerViewGame)
        recyclerView.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)

        val gameImages = listOf(
            GameImage(0,R.drawable.gameplay1),
            GameImage(1,R.drawable.gameplay2)
        )

        recyclerView.adapter = gameImageListAdapter(gameImages)
    }
}