package com.example.challangechapter3

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_abjad.view.*
import java.util.ArrayList

class AbjadAdapter (val listAbjad : ArrayList<ListAbjad> ) : RecyclerView.Adapter<AbjadAdapter.ViewHolder>() {

    var onClik : ((ListAbjad) -> Unit)? = null

//    ambil id dari layout
    class ViewHolder (view : View) : RecyclerView.ViewHolder(view){
        var namaAbjad = view.findViewById<TextView>(R.id.txtHuruf)
        var card = view.findViewById<CardView>(R.id.cardView)


    }

//    Buat Objek ViewHolder - untuk Register View - Inflate Layout
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_abjad,parent,false)
        return ViewHolder(view)

    }

//    Untuk Set Data ke Layout
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.namaAbjad.text = listAbjad[position].huruf
        holder.card.setOnClickListener{
            onClik?.invoke(listAbjad[position])
        }
    }

//    Ada beberapa item yang akan muncul di RecyclerView
    override fun getItemCount(): Int {
       return listAbjad.size
    }
}