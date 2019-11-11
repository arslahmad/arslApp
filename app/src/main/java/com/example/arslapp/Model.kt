package com.example.arslapp

data class Hobby(val title:String){

    object suplier{
        val hobies= listOf<Hobby>(Hobby("google"),Hobby("gmail"), Hobby("yahoo"),Hobby("Hotmail"))
    }
}