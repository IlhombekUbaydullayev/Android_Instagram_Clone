package com.example.android_instagram_clone.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.android_instagram_clone.R
import com.example.android_instagram_clone.fragments.FavoriteFragment
import com.example.android_instagram_clone.fragments.HomeFragment
import com.example.android_instagram_clone.fragments.ProfileFragment
import com.example.android_instagram_clone.fragments.SearchFragment
import com.example.android_instagram_clone.model.Post
import com.example.android_instagram_clone.model.User
import com.example.android_instagram_clone.utils.Utils
import com.google.android.material.imageview.ShapeableImageView

class ProfileAdapter(var fragment: ProfileFragment, var items : ArrayList<Post>) : BaseAdapter() {
    override fun getItemCount(): Int {
        return items.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_post_profile,parent,false)
        return PostViewHolders(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val post: Post = items[position]

        if (holder is PostViewHolders) {
           var iv_post = holder.iv_post
            setViewHeight(iv_post)
            Glide.with(fragment).load(post.image).into(iv_post)
        }
    }
    class PostViewHolders(var view: View) : RecyclerView.ViewHolder(view) {
        var iv_post: ShapeableImageView
        var tv_caption: TextView
        init {
            iv_post = view.findViewById(R.id.iv_post)
            tv_caption = view.findViewById(R.id.iv_caption)
        }
    }

    /**
     * Set ShapeableImageView height as a half of screen width
     * **/

    private fun setViewHeight(view: View) {
        val params: ViewGroup.LayoutParams = view.layoutParams
        params.height = Utils.screenSize(fragment.requireActivity().application).width / 2
        view.layoutParams = params
    }

}