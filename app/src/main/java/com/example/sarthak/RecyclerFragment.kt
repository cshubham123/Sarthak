package com.example.sarthak

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecyclerFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // return super.onCreateView(inflater, container, savedInstanceState)
        val view: View = inflater.inflate(R.layout.recyclerfragment, container, false)
        val recyclerView: RecyclerView = view.findViewById(R.id.recycler_view)
        val list: MutableList<MyItemModel> = ArrayList()
        for (i in 1..20) {
            list.add(MyItemModel())
        }
        val adapter: MyAdapter = MyAdapter(context)
        adapter.setList(list)

        val layoutManager = LinearLayoutManager(this.context)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = adapter


        return view
    }
}