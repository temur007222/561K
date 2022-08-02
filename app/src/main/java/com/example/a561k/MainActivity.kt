package com.example.a561k

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.a561k.Adapter.*
import com.example.a561k.Models.*

class MainActivity : AppCompatActivity() {
 private lateinit var  recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
        initViews1()
        initViews2()
        initViews3()
        initViews4()
    }

    private fun initViews(){
      recyclerView = findViewById(R.id.rv)
          recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        refreshAdapter(getAllChats())
    }

    private fun refreshAdapter(item: ArrayList<RvAdapterItem>){
        val adapter = RvAdapter(this, item)
        recyclerView.adapter = adapter
    }

    private fun getAllChats(): ArrayList<RvAdapterItem> {
        val item: ArrayList<RvAdapterItem> = ArrayList()

        item.add(RvAdapterItem(R.drawable.mbw, "Oculus"))
        item.add(RvAdapterItem(R.drawable.birds, "Sneakers"))
        item.add(RvAdapterItem(R.drawable.rut, "Boots"))
        item.add(RvAdapterItem(R.drawable.mbw, "Shoes"))
        item.add(RvAdapterItem(R.drawable.gtr, "Books"))
        item.add(RvAdapterItem(R.drawable.birds, "Socks"))

        return item
    }

    private fun initViews1(){
        recyclerView = findViewById(R.id.rv1)
        recyclerView.layoutManager = GridLayoutManager(this, 2)

        refreshAdapter1(getAllChats1())
    }

    private fun refreshAdapter1(items: ArrayList<Rv1AdapterItem>){
        val adapter = Rv1Adapter(this, items)
        recyclerView.adapter = adapter
    }

    private fun getAllChats1(): ArrayList<Rv1AdapterItem> {
        val item: ArrayList<Rv1AdapterItem> = ArrayList()

        item.add(Rv1AdapterItem(R.drawable.mbw))
        item.add(Rv1AdapterItem(R.drawable.birds))
        item.add(Rv1AdapterItem(R.drawable.rut))
        item.add(Rv1AdapterItem(R.drawable.mbw))

        return item
    }

    private fun initViews2(){
        recyclerView = findViewById(R.id.rv2)
        recyclerView.layoutManager = GridLayoutManager(this, 2)

        refreshAdapter2(getAllChats2())
    }

    private fun refreshAdapter2(items: ArrayList<Rv2AdapterItem>){
        val adapter = Rv2Adapter(this, items)
        recyclerView.adapter = adapter
    }

    private fun getAllChats2(): ArrayList<Rv2AdapterItem> {
        val item: ArrayList<Rv2AdapterItem> = ArrayList()

        item.add(Rv2AdapterItem(R.drawable.mbw))
        item.add(Rv2AdapterItem(R.drawable.birds))
        item.add(Rv2AdapterItem(R.drawable.rut))
        item.add(Rv2AdapterItem(R.drawable.mbw))

        return item
    }

    private fun initViews3(){
        recyclerView = findViewById(R.id.rv3)
        recyclerView.layoutManager = GridLayoutManager(this, 1)

        refreshAdapter3(getAllChats3())
    }

    private fun refreshAdapter3(items: ArrayList<Rv3AdapterItem>){
        val adapter = Rv3Adapter(this, items)
        recyclerView.adapter = adapter
    }

    private fun getAllChats3(): ArrayList<Rv3AdapterItem> {
        val item: ArrayList<Rv3AdapterItem> = ArrayList()

        item.add(Rv3AdapterItem(R.drawable.birds, "Chika Chika Boom Boom", "4", "59","$7.99"))
        item.add(Rv3AdapterItem(R.drawable.rut, "Clean Code", "25", "60",""))
        item.add(Rv3AdapterItem(R.drawable.mbw, "Pattern Architecture", "30", "10", "$80.05"))

        return item
    }

    private fun initViews4(){
        recyclerView = findViewById(R.id.rv4)
        recyclerView.layoutManager = GridLayoutManager(this, 2)

        refreshAdapter4(getAllChats4())
    }

    private fun refreshAdapter4(items: ArrayList<Rv4AdapterItem>){
        val adapter = Rv4Adapter(this, items)
        recyclerView.adapter = adapter
    }

    private fun getAllChats4(): ArrayList<Rv4AdapterItem> {
        val item: ArrayList<Rv4AdapterItem> = ArrayList()

        item.add(Rv4AdapterItem(R.drawable.mbw, "Beauty"))
        item.add(Rv4AdapterItem(R.drawable.birds, "Home and Kitchen"))
        item.add(Rv4AdapterItem(R.drawable.rut, "Sports and Outdoors"))
        item.add(Rv4AdapterItem(R.drawable.street, "Electronics"))
        item.add(Rv4AdapterItem(R.drawable.rut, "Outdoor clothing"))
        item.add(Rv4AdapterItem(R.drawable.street, "Pet Supplies"))

        return item
    }
}