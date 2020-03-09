package com.example.a4daysassignment.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.a4daysassignment.R
import com.example.a4daysassignment.model.Post
import kotlinx.android.synthetic.main.post_layout.view.*

class PostAdapter(var postList: ArrayList<Post>): RecyclerView.Adapter<PostAdapter.PostViewHolder>() {
    inner class PostViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        fun bindPost(post: Post) {
            itemView.user_name.text = post.username
            itemView.user_icon.setImageResource(post.avatar)
            itemView.post.setImageResource(post.post)
            var like = post.like.toString()
            if (post.like > 1000) {
                like = (post.like/1000).toString()+"K"
            }
            itemView.like.text = like
            itemView.comment.text = post.comment.toString()
            itemView.share.text = post.share.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.post_layout, parent, false)
        return PostViewHolder(view)
    }

    override fun getItemCount(): Int {
        return postList.size
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        holder.bindPost(postList[position])
    }
}