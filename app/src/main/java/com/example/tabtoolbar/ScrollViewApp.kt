package com.example.tabtoolbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class ScrollViewApp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scroll_view_app)
    }

    fun seleccionaFruta(Vista:View){

        when(Vista.id){
            R.id.bananas-> Toast.makeText(this, "son bananas",Toast.LENGTH_SHORT).show()
            R.id.ceresa-> Toast.makeText(this, "son ceresas",Toast.LENGTH_SHORT).show()
            R.id.sandia-> Toast.makeText(this, "son sandias",Toast.LENGTH_SHORT).show()
            R.id.mango-> Toast.makeText(this, "son mangos",Toast.LENGTH_SHORT).show()
            R.id.franbuesa-> Toast.makeText(this, "son franbuesas",Toast.LENGTH_SHORT).show()
            R.id.fresa-> Toast.makeText(this, "son fresas",Toast.LENGTH_SHORT).show()

        }

    }




}