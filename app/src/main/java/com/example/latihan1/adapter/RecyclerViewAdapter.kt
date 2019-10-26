package com.example.latihan1.adapter

import android.content.ClipData
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.latihan1.R
import com.example.latihan1.model.item


class RecyclerViewAdapter (
    private val  context: Context,
    private val items: List<item>
) : RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>(){

    inner class ViewHolder(view: View):RecyclerView.ViewHolder(view) {
        val name = view.findViewById<TextView>(R.id.tv_nama_gambar)
        val image = view.findViewById<ImageView>(R.id.iv_gambar)
    }


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    )= ViewHolder(
        LayoutInflater.from(context).inflate(
            R.layout.list_item, parent,
            false
        )
    )

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: RecyclerViewAdapter.ViewHolder, position: Int) {
        Glide.with(context).load(items.get(position).image).into(holder.image)
        holder.name.text = items.get(position).name
    }
}