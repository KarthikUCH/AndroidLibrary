package com.raju.karthikeyan.glidedemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.raju.karthikeyan.glidedemo.glide.GlideApp
import java.net.URL

class ProductListActivity : AppCompatActivity() {
    lateinit var imageView: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_list)
        imageView = findViewById(R.id.imageView)

        GlideApp.with(this)
            .load("https://picsum.photos/200")
            .into(imageView);
    }
}