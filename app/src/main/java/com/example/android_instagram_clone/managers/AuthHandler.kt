package com.example.android_instagram_clone.managers

import java.lang.Exception

interface AuthHandler {
    fun onSuccess(uid: String)
    fun onError(exception: Exception?)
}