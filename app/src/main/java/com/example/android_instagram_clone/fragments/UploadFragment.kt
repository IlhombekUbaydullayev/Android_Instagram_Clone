package com.example.android_instagram_clone.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.android_instagram_clone.R

class UploadFragment : BaseFragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_upload,container,false)
        initViews(view)
        return view
    }

    private fun initViews(view: View) {

    }
}