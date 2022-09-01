package com.afrinaldi.foodaplication.network.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.afrinaldi.foodaplication.databinding.RelatedItemBinding
import com.afrinaldi.foodaplication.network.model.RelatedModel
import com.bumptech.glide.Glide

class RelatedAdapter(private val items: ArrayList<RelatedModel>) : RecyclerView.Adapter<RelatedAdapter.ViewHolder>() {
    fun addData(item: List<RelatedModel>) {
        items.clear()
        items.addAll(item)
        notifyDataSetChanged()
    }

    inner class ViewHolder(itemView: RelatedItemBinding) : RecyclerView.ViewHolder(itemView.root){
        private val binding = itemView
        fun bind(data: RelatedModel){
            with(binding){
                Glide.with(itemView)
                    .load(data.imageRelated)
                    .into(ivRelatedImage)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(RelatedItemBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int = items.size
}