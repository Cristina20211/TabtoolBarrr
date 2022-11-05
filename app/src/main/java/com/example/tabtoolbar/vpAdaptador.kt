package com.example.tabtoolbar

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter


class vpAdaptador(fa: FragmentActivity): FragmentStateAdapter(fa) {

  //misma llave anterior
    companion object {
        private const val ARG_OBJECT = "object"
    }
//cantidad de valores q debuelve = 3 numero de vistas o fragment que va a tener
    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        //crear vista de fragment creamos una contante

        val fragmento = VistaFragmento()
        fragmento.arguments = Bundle().apply {
            putInt(ARG_OBJECT,position+1)
        }
        return  fragmento
    }
}