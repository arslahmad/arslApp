package com.example.arslapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            val text:String=editText.text.toString();
            val intent= Intent(this,Main2Activity::class.java)
            intent.putExtra("arslan",text)
            startActivity(intent)
        }
        button2.setOnClickListener {
            val inten=Intent(this,Main3Activity::class.java)
            startActivity(inten)
        }

    }
}
