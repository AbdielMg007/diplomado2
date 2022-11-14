package com.mg.diplomado2.models

import com.mg.diplomado2.R


data class animals(var type: String, var name: String, var photo: Int, var age: Int, var sex: String, var sick: Boolean){
    companion object {
        val data
            get() = listOf(
                animals(
                    "Perro",
                    "Pelusa",
                    R.drawable.perro,
                    6,
                    "Female",
                    false
                ),
                animals(
                    "Gato",
                    "Wero",
                    R.drawable.gato,
                    1,
                    "Male",
                    true
                ),
                animals(
                    "Perico",
                    "Che-Che",
                    R.drawable.perico,
                    2,
                    "Male",
                    false
                ),
                animals(
                    "Canario",
                    "Juan",
                    R.drawable.canario,
                    1,
                    "Male",
                    false
                ),
                animals(
                    "Pez",
                    "Bolillo",
                    R.drawable.pez,
                    1,
                    "Female",
                    true
                ),
                animals(
                    "Hamster",
                    "Tommy",
                    R.drawable.hamster,
                    2,
                    "Male",
                    true
                ),
                animals(
                    "Pavorreal",
                    "Kevin",
                    R.drawable.pavorreal,
                    2,
                    "Male",
                    false
                ),
                animals(
                    "Borrego",
                    "Borregato",
                    R.drawable.borrego,
                    2,
                    "Male",
                    false
                )
            )
    }
}




