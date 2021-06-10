
package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity3 : AppCompatActivity() {
    lateinit var  btnNum3:Button
    lateinit var btnBack2:Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        castView()
        onClick()

    }
    fun castView(){
        btnNum3=findViewById(R.id.btnNum3)
        btnBack2=findViewById(R.id.btnBack2)
    }
    fun onClick() {
        btnNum3.setOnClickListener {
            val intent = Intent(baseContext, MainActivity4::class.java)
            startActivity(intent)
        }
        btnBack2.setOnClickListener {
            val intent = Intent(baseContext,MainActivity2::class.java)
            startActivity(intent)

        }
    }}

