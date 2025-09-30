package com.example

import android.content.Context
import android.widget.ImageView
import com.bumptech.glide.Glide

class GlideLoader(private val context: Context) : ImageLoader {
    override fun load(url: String, imageView: ImageView) {
        Glide.with(context)
            .load(url)
            .into(imageView)
    }
}