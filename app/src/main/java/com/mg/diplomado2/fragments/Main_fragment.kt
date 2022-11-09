package com.mg.diplomado2.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mg.diplomado2.R
import com.mg.diplomado2.adapters.adapterAnimals
import com.mg.diplomado2.models.animals


class main_fragment : Fragment(R.layout.main_fragment) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerAnimals: RecyclerView = view.findViewById(R.id.recyclerAnimals)
        val recyclerAdapter = adapterAnimals(animals.data)
        recyclerAnimals.layoutManager = LinearLayoutManager(context)
        recyclerAnimals.adapter = recyclerAdapter
    }

}

