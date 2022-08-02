package com.example.a561k

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.a561k.Adapter.Rv1Adapter
import com.example.a561k.Adapter.Rv2Adapter
import com.example.a561k.Adapter.RvAdapter
import com.example.a561k.Models.Rv1AdapterItem
import com.example.a561k.Models.Rv2AdapterItem
import com.example.a561k.Models.RvAdapterItem

class MainActivity : AppCompatActivity() {
 private lateinit var  recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
        initViews1()
        initViews2()
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
}