package com.nandaadisaputra.master.buah

import android.content.Context
import android.os.Build
import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import android.view.LayoutInflater
import android.view.View
import com.bumptech.glide.Glide
import org.jetbrains.anko.startActivity
import kotlinx.android.synthetic.main.list_buah.view.*

class RecyclerViewAdapter(private val context: Context, private val items: List<Item>) :
        RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(items[position])
    }

    override fun getItemCount(): Int = items.size
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bindItem(items: Item) {

            itemView.name.text = items.name
            Glide.with(itemView.context).load(items.image).into(itemView.image)

            itemView.setOnClickListener {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {

                    itemView.context.startActivity<DetailBuahActivity>("image" to items.image, "name" to items.name)
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, ViewType: Int) =
            ViewHolder(LayoutInflater.from(context).inflate(R.layout.list_buah, parent, false))
}