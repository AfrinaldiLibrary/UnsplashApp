package com.afrinaldi.foodaplication.network.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.afrinaldi.foodaplication.databinding.SlideItemBinding
import com.afrinaldi.foodaplication.network.model.SliderModel
import com.bumptech.glide.Glide

class SliderAdapter (private val items: ArrayList<SliderModel>): RecyclerView.Adapter<SliderAdapter.ViewHolder>(){

    fun addData(item: List<SliderModel>) {
        items.clear()
        items.addAll(item)
        notifyDataSetChanged()
    }

    inner class ViewHolder(itemView: SlideItemBinding) : RecyclerView.ViewHolder(itemView.root){
        private val binding = itemView
        fun bind(data: SliderModel){
            with(binding){
                Glide.with(itemView)
                    .load(data.imageSlide)
                    .into(ivSlideImage)
                tvSlideTitle.text = data.title
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(SlideItemBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int = items.size
}