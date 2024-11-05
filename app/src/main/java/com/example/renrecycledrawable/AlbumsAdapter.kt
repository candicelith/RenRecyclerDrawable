package com.example.renrecycledrawable

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class AlbumsAdapter(private val albumsList: List<AlbumsItem>) :
    RecyclerView.Adapter<AlbumsAdapter.AlbumsViewHolder>() {

    class AlbumsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlbumsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.item_albums, parent, false)
        return AlbumsViewHolder(view)
    }

    override fun onBindViewHolder(holder: AlbumsViewHolder, position: Int) {
        val albumsItem = albumsList[position]
        holder.imageView.setImageResource(albumsItem.albumsResId)
    }

    override fun getItemCount() = albumsList.size

}