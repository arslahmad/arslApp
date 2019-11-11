package com.example.arslapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.activity_main3.*
import java.util.function.Supplier

class Main3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        val layoutManager=LinearLayoutManager(this)
         layoutManager.orientation=LinearLayoutManager.VERTICAL
        Review.layoutManager=layoutManager
        val adapter=HobiesAdapter(this, Hobby.suplier.hobies)
        Review.adapter=adapter
    }
}
