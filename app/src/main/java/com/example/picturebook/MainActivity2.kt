package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    lateinit var  btnNum2: Button
    lateinit var btnBack1:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        castView()
        onClick()
    }

    fun castView(){
        btnNum2=findViewById(R.id.btnNum2)
        btnBack1=findViewById(R.id.btnBack1)
    }
    fun onClick() {
        btnNum2.setOnClickListener {
            val intent = Intent(baseContext, MainActivity3::class.java)
            startActivity(intent)
        }
        btnBack1.setOnClickListener {
            val intent = Intent(baseContext, MainActivity::class.java)
            startActivity(intent)

        }
    }
}