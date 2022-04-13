package com.example.android_instagram_clone.fragments

import android.app.Activity
import android.content.Intent
import androidx.fragment.app.Fragment
import com.example.android_instagram_clone.activity.SignInActivity

open class BaseFragment: Fragment() {

    fun callSigInActivity(activity: Activity) {
        val intent = Intent(context, SignInActivity::class.java)
        startActivity(intent)
        activity.finish()
    }
}