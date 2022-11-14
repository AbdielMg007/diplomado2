package com.mg.diplomado2.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.mg.diplomado2.R
import com.mg.diplomado2.models.animals

class adapterAnimals(private var animal: List<animals>, private val animalClick: animalClick) : RecyclerView.Adapter<adapterAnimals.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): adapterAnimals.ViewHolder {
        return adapterAnimals.ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.animals_card, parent, false)
        )
    }

    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        var iName: TextView = view.findViewById(R.id.itemName)
        var iType: TextView = view.findViewById(R.id.itemType)
        var iImage: ImageView = view.findViewById(R.id.itemImage)

    }

    override fun onBindViewHolder(holder: adapterAnimals.ViewHolder, i: Int) {
        val animalShow = animal[i]

        holder.iName.text = animalShow.name
        holder.iType.text = animalShow.type
        animalShow.photo.let { holder.iImage.setImageResource(it) }
        holder.itemView.setOnClickListener {
            animalClick.animalsClickListener(animalShow)
        }

    }

    override fun getItemCount(): Int = animal.size

}