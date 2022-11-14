package com.mg.diplomado2.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.RadioGroup
import android.widget.TextView
import androidx.core.os.bundleOf
import com.mg.diplomado2.R
import com.mg.diplomado2.models.animals

class second_fragment : Fragment(R.layout.fragment_second) {

    private var type: String? = "type"
    private var nombre: String? = "Name"
    private var foto: String? = "Photo"
    private var edad: String? = "age"
    private var sexo: String? = "Sex"
    private var enfermo: String? = "Sick"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        type = requireArguments().getString(TYPE)
        nombre = requireArguments().getString(NAME)
        foto = requireArguments().getString(PHOTO)
        edad = requireArguments().getString(AGE)
        sexo = requireArguments().getString(SEX)
        enfermo = requireArguments().getString(SICK)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val tvType = view.findViewById<TextView>(R.id.tvType)
        val tvName = view.findViewById<TextView>(R.id.tvName)
        val iPhoto = view.findViewById<ImageView>(R.id.iPhoto)
        val tvAge = view.findViewById<TextView>(R.id.tvAge)
        val animalHasDisease = view.findViewById<CheckBox>(R.id.cbDisease)
        val animalGender = view.findViewById<RadioGroup>(R.id.rgGender)

        iPhoto.setImageResource(foto!!.toInt())
        tvName.text = nombre
        tvType.text = "Especie: $type"
        tvAge.text = "Edad: $edad"

        animalHasDisease.isChecked = enfermo.toString().toBoolean()
        if (sexo == "Male") {
            animalGender.check(R.id.rbMale)
        } else {
            animalGender.check(R.id.rbFemale)
        }
    }

    companion object{
        private const val TYPE = "Type"
        private const val NAME = "Name"
        private const val PHOTO = "Photo"
        private const val AGE = "Age"
        private const val SEX = "Sex"
        private const val SICK = "Sick"

        fun newInstance(animals: animals) = second_fragment().apply {
            arguments = bundleOf(TYPE to animals.type, NAME to animals.name, PHOTO to animals.photo.toString(), AGE to animals.age.toString(), SEX to animals.sex, SICK to animals.sick.toString())
        }

    }

}