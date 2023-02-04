package com.hyonglow.dogglers.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.hyonglow.dogglers.R
import com.hyonglow.dogglers.model.Dog

class DogCardAdapter(val context: Context, val dataList: List<Dog>) :
    RecyclerView.Adapter<DogCardAdapter.ItemViewholder>() {

    class ItemViewholder(view: View) : RecyclerView.ViewHolder(view) {
        val tvName: TextView = view.findViewById(R.id.tvName)
        val tvAge: TextView = view.findViewById(R.id.tvAge)
        val tvHobbies: TextView = view.findViewById(R.id.tvHobbies)
        val imageView: ImageView = view.findViewById(R.id.item_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewholder {
        val adapterLayout =
            LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return ItemViewholder(adapterLayout)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(holder: ItemViewholder, position: Int) {
        val item = dataList[position]
        holder.imageView.setImageResource(item.imageResourceId)
        holder.tvName.text = item.name
        holder.tvAge.text = context.getString(R.string.dog_age, item.age)
        holder.tvHobbies.text = context.getString(R.string.dog_hobbies, item.hobby)
    }

}