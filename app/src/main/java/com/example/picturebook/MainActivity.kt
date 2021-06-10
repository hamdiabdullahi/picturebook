
package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnNum1:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        castView()
        onClick()

    }
    fun castView(){
        btnNum1=findViewById(R.id.btnNum1)

    }
    fun onClick() {
        btnNum1.setOnClickListener {
            var intent = Intent(baseContext, MainActivity2::class.java)
            startActivity(intent)
        }

    }}
