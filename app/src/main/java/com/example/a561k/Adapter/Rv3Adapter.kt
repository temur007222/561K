package com.example.a561k.Adapter

import android.content.Context
import android.graphics.Paint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.a561k.Models.Rv3AdapterItem
import com.example.a561k.R

class Rv3Adapter(var context: Context, var items: ArrayList<Rv3AdapterItem>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
     val view = LayoutInflater.from(parent.context).inflate(R.layout.item_rv3, parent, false)
        return ItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
       val rv3AdapterItem = items[position]

        if (holder is ItemViewHolder){
            Glide.with(context).load(rv3AdapterItem.image).into(holder.imageView)
            holder.title.text = rv3AdapterItem.title
            holder.price.text = rv3AdapterItem.price
            holder.price1.text = rv3AdapterItem.price1

            holder.discount.paintFlags = holder.discount.paintFlags or Paint.STRIKE_THRU_TEXT_FLAG

          //  if (rv3AdapterItem.discount.isNotEmpty()){ holder.discount.text = rv3AdapterItem.discount}
           // else{

          //  }
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

   class ItemViewHolder(view: View): RecyclerView.ViewHolder(view){
       val imageView: ImageView = view.findViewById(R.id.image2)
       val title: TextView = view.findViewById(R.id.title)
       val price: TextView = view.findViewById(R.id.price)
       val price1: TextView = view.findViewById(R.id.price1)
       val discount: TextView = view.findViewById(R.id.discount)

   }
}