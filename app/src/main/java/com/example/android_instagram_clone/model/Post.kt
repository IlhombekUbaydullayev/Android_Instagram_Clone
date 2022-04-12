package com.example.android_instagram_clone.model

import android.media.Image

class Post {
    var caption : String = ""
    var image : String = ""

    constructor(image: String) {
        this.image = image
    }
}