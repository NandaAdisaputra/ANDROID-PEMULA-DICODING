package com.nandaadisaputra.master.buah

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var items: MutableList<Item> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initData()
        list_buah.adapter = RecyclerViewAdapter(this, items)
        list_buah.layoutManager = LinearLayoutManager(this) as RecyclerView.LayoutManager?
    }

    private fun initData() {
        val image = resources.obtainTypedArray(R.array.image_buah)
        val name = resources.getStringArray(R.array.nama_buah)
        items.clear()
        for (i in name.indices) {
            items.add(Item(name[i],
                    image.getResourceId(i, 0)))
        }
        image.recycle()
    }
}
