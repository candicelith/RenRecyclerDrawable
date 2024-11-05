package com.example.renrecycledrawable

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        var recyclerView = findViewById<RecyclerView>(R.id.rv_albums)
        recyclerView.layoutManager = GridLayoutManager(this, 2)

        val albumsList = listOf(
            AlbumsItem(R.drawable.am),
            AlbumsItem(R.drawable.bt),
            AlbumsItem(R.drawable.kjy),
            AlbumsItem(R.drawable._5xxxv),
            AlbumsItem(R.drawable.marina),
            AlbumsItem(R.drawable.ultraviolence),
            AlbumsItem(R.drawable.souvlaki),
            AlbumsItem(R.drawable.wiped_out)
        )

        recyclerView.adapter = AlbumsAdapter(albumsList)
    }
}