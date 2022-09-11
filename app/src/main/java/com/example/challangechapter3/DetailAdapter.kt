package com.example.challangechapter3

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_detail.view.*

class DetailAdapter (private val listDetail: ArrayList<String>): RecyclerView.Adapter<DetailAdapter.ViewHolder>() {

    lateinit var listener : OnItemClickListener
    interface OnItemClickListener{
        fun onClick(kata : String)
    }

    fun setOnItemClickListener(listener : OnItemClickListener){
        this.listener = listener
    }

    inner class ViewHolder(view : View) : RecyclerView.ViewHolder(view) {
        var txtDetail = view.txtdetail
        init {
            view.txtdetail.setOnClickListener{
                listener.onClick(listDetail[absoluteAdapterPosition])
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_detail,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.txtDetail.text = listDetail[position]
    }

    override fun getItemCount(): Int {
        return listDetail.size
    }
}