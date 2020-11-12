package com.raju.karthikeyan.demoglide

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.raju.karthikeyan.glidedemo.ProductListActivity
import com.raju.karthikeyan.glidedemo.glide.GlideApp

class MainActivity : AppCompatActivity() {

    private lateinit var btnOpen: Button
    lateinit var imageView: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnOpen = findViewById(R.id.btn_open)
        btnOpen.setOnClickListener {
            startActivity(Intent(this, ProductListActivity::class.java))
        }

        imageView = findViewById(com.raju.karthikeyan.glidedemo.R.id.imageView)
        GlideApp.with(this)
            .load("https://picsum.photos/200")
            .into(imageView);
    }
}