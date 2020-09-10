package com.example.testonline

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class CustomAdapter(context: Context, list: List<Model>): BaseAdapter() {

    val context: Context
    var list: List<Model>
    val inflater: LayoutInflater

    init {
        this.context = context
        this.list = list
        this.inflater = LayoutInflater.from(context)
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View? {
        val view: View?
        val holder: Holder

        if (convertView == null){
            view = this.inflater.inflate(R.layout.adapter_layout, parent, false)
            holder = Holder(view)
            view.tag = holder
        } else {
            view = convertView
            holder = view.tag as Holder
        }

        holder.name.text = list[position].nama
        holder.gambar.setImageResource(list[position].gambar)

        return view
    }

    override fun getItem(position: Int): Any {
        return list[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return list.size
    }

    class Holder(view: View){
        var name: TextView
        var gambar: ImageView

        init {
            name = view.findViewById(R.id.nama) as TextView
            gambar = view.findViewById(R.id.image) as ImageView
        }
    }
}