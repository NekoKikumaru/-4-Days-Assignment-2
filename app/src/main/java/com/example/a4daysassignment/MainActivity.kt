package com.example.a4daysassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.a4daysassignment.adapter.PostAdapter
import com.example.a4daysassignment.model.Post
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var postArray = ArrayList<Post>()
        postArray.add(Post("Xiao Zhan", R.drawable.wei_wuxian, R.drawable.black_rabbit, 2000, 98, 69))
        postArray.add(Post("Wang Yibo", R.drawable.lan_wangji, R.drawable.white_rabbit, 1100, 133, 55))
        postArray.add(Post("Wang Zhou Cheng", R.drawable.jiang_cheng, R.drawable.purple_cat, 800, 64, 98))

        var postAdapter = PostAdapter(postArray)
        post_recyclerview.layoutManager = LinearLayoutManager(this)
        post_recyclerview.adapter = postAdapter
    }
}
