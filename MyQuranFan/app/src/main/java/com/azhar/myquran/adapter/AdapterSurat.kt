package com.azhar.myquran.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.azhar.myquran.R
import com.azhar.myquran.model.Surat
import kotlinx.android.synthetic.main.layout_list_surat.view.*

class AdapterSurat(private val context: Context, private val list: List<Surat>, private val listener: (Surat) -> Unit)
    : RecyclerView.Adapter<AdapterSurat.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
            AdapterSurat.ViewHolder(LayoutInflater.from(context).inflate(R.layout.layout_list_surat, parent, false))

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(list[position], listener)
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bindItem(surat: Surat, listener: (Surat) -> kotlin.Unit) {
            itemView.tv_surat.text = surat.nama
            itemView.tv_nomor.text = surat.nomor
            itemView.tv_arti.text = surat.arti
            itemView.setOnClickListener {
                listener(surat)
            }
        }
    }
}