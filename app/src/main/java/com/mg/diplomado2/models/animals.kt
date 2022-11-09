package com.mg.diplomado2.models

import com.mg.diplomado2.R


data class animals(var type: String, var name: String, var photo: Int, var age: Int, var sex: String, var sick: Boolean){
    companion object {
        val data
            get() = listOf(
                animals(
                    "Perro",
                    "Juan",
                    R.drawable.ic_launcher_background,
                    5,
                    "Female",
                    true
                ),
                animals(
                    "Gato",
                    "Pelusa",
                    R.drawable.ic_launcher_background,
                    9,
                    "Female",
                    true
                )
            )
    }
}




