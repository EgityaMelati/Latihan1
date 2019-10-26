package com.example.latihan1.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.latihan1.R
import com.example.latihan1.adapter.RecyclerViewAdapter
import com.example.latihan1.model.item


class FragmentSatu: Fragment() {
    private var items: MutableList<item> = mutableListOf()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view:View = inflater.inflate(R.layout.fragment1, container, false)
        initView(view)
        return  view

    }
    private fun initData(){
        val name = resources.getStringArray(R.array.rt_mobile)
        val image = resources.obtainTypedArray(R.array.rt_mobile)

        items.clear()
        for (i in name.indices){
            items.add(
                item(name[i],
                    image.getResourceId(i, 0)
                )
            )
        }

        image.recycle()
    }

    fun initView(view: View){
        initData()
        val rv = view.findViewById<RecyclerView>(R.id.rv_list_item)
        rv.layoutManager = LinearLayoutManager(activity)
        rv.adapter = activity?.let { RecyclerViewAdapter(it, items) }
    }

}
