package com.example.sarthak

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlin.coroutines.coroutineContext

class MyAdapter(context : Context?) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
    var mylist : MutableList<MyItemModel> = ArrayList()


    fun setList(list: List<MyItemModel>){
        mylist.addAll(list)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView: View =
            LayoutInflater.from(parent.context).inflate(R.layout.row, parent, false)

        return MyViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return mylist.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.name.text = mylist.get(position).name
        holder.des.text = mylist.get(position).des
    }

    class MyViewHolder(itemview: View) : RecyclerView.ViewHolder(itemview) {

        var name: TextView = itemview.findViewById(R.id.name)
        var des: TextView = itemview.findViewById(R.id.des)


    }
}