package com.example.a561k.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.a561k.Models.Rv4AdapterItem
import com.example.a561k.Models.RvAdapterItem
import com.example.a561k.R

class Rv4Adapter(var context: Context, var items: ArrayList<Rv4AdapterItem>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.item_rv4, parent, false)
        return ItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val rv4AdapterItem = items[position]

        if (holder is ItemViewHolder){
            Glide.with(context).load(rv4AdapterItem.image1).into(holder.image)
            holder.text.text = rv4AdapterItem.text
        }
    }

    class ItemViewHolder(view: View): RecyclerView.ViewHolder(view){
        var text: TextView = view.findViewById(R.id.text3)
        var image: ImageView = view.findViewById(R.id.image3)
    }

}