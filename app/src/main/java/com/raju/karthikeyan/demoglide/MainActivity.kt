package com.raju.karthikeyan.demoglide

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.raju.karthikeyan.glidedemo.ProductListActivity

class MainActivity : AppCompatActivity() {

    private lateinit var btnOpen: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnOpen = findViewById(R.id.btn_open)
        btnOpen.setOnClickListener {
            startActivity(Intent(this, ProductListActivity::class.java))
        }
    }
}