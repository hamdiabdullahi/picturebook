package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity5 : AppCompatActivity() {
    lateinit var btnBack4: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)
        castView()
        onClick()
    }

    fun castView() {
        btnBack4= findViewById(R.id.btnBack4)
    }

    fun onClick() {
  btnBack4.setOnClickListener{
      val next=Intent(baseContext,MainActivity4::class.java)
      startActivity(next)
  }
    }
}

