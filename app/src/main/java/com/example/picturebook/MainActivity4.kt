
package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity4 : AppCompatActivity() {
lateinit var btnNum4:Button
lateinit var btnBack3:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        castView()
        onClick()
    }
        fun castView() {
            btnNum4 = findViewById(R.id.btnNum4)
            btnBack3 = findViewById(R.id.btnBack3)
        }

        fun onClick() {
            btnNum4.setOnClickListener {
                val intent = Intent(baseContext, MainActivity5::class.java)
                startActivity(intent)
            }
            btnBack3.setOnClickListener {
                val intent = Intent(baseContext, MainActivity3::class.java)
                startActivity(intent)

            }
        }

    }



















































//package com.example.picturebook
//
//import android.content.Intent
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import android.widget.Button
//
//class MainActivity4 : AppCompatActivity() {
//   lateinit var btnBack4:Button
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main4)
//        fun castView(){
//
//            btnBack4=findViewById(R.id.btnBack4)
//        }
//        fun onClick() {
//
//            btnBack4.setOnClickListener {
//                val intent = Intent(baseContext, MainActivity5::class.java)
//                startActivity(intent)
//
//            }
//        }}}

