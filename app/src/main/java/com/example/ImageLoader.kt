package com.example

import android.widget.ImageView

interface ImageLoader {
    fun load(url: String, imageView: ImageView)
}