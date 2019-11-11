package com.example.arslapp

import android.content.Context
import android.support.v7.view.menu.ActionMenuItemView
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.list_item.view.*

class HobiesAdapter(val context: Context,val hobies:List<Hobby>):RecyclerView.Adapter<HobiesAdapter.myviewHolder>()
{
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): myviewHolder {
        val view= LayoutInflater.from(context).inflate(R.layout.list_item,p0,false)
        return myviewHolder(view)
    }

    override fun getItemCount(): Int {
        return hobies.size
    }

    override fun onBindViewHolder(p0: myviewHolder, p1: Int) {
        val Hobby=hobies[p1]
        p0.setData(Hobby,p1)
    }

    inner class myviewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
        fun setData(Hobby:Hobby?,p1: Int){
            itemView.txvTitle.text=Hobby!!.title
        }
    }

}