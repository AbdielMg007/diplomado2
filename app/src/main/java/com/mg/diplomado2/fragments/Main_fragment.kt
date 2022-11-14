package com.mg.diplomado2.fragments

import android.os.Bundle
import android.text.TextUtils.replace
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintSet
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mg.diplomado2.R
import com.mg.diplomado2.adapters.adapterAnimals
import com.mg.diplomado2.adapters.animalClick
import com.mg.diplomado2.models.animals


class main_fragment : Fragment(R.layout.main_fragment), animalClick {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val recyclerAnimals: RecyclerView = view.findViewById(R.id.recyclerAnimals)
        val recyclerAdapter = adapterAnimals(animals.data, this)
        recyclerAnimals.layoutManager = LinearLayoutManager(context)
        recyclerAnimals.adapter = recyclerAdapter
    }

    override fun animalsClickListener(animals: animals) {
        requireActivity().supportFragmentManager.beginTransaction()
            .replace(R.id.main_fragment, second_fragment.newInstance(animals))
            .addToBackStack("mainFragment")
            .commit()
    }

}


