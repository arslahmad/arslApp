package com.example.arslapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val bundle:Bundle?=intent.extras
        val msg=bundle!!.getString("arslan")
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show()
        textView.text=msg
        share.setOnClickListener {
            val inten=Intent()
            inten.action=Intent.ACTION_SEND
            val message:String=textView.text.toString()
            inten.putExtra(Intent.EXTRA_TEXT,message)
            inten.type="text/plain"
            startActivity(Intent.createChooser(inten,"select your app:"))
            button3.setOnClickListener {
                val inten=Intent(this,Main3Activity::class.java)
                startActivity(inten)
            }
        }
    }
}
