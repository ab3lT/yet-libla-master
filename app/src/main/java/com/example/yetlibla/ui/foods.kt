package com.example.yetlibla.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.yetlibla.Adapters.ImageNewAdapter
import com.example.yetlibla.Adapters.ImagesAdapter
import com.example.yetlibla.R
import kotlinx.android.synthetic.main.activity_foods.*

class foods : AppCompatActivity() {
    var restaurant: String?=null
    var position : Int?=null



    private var name = mutableListOf<String>()
    private var pics = mutableListOf<Int>()
    private  var price = mutableListOf<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


  //   name[position!!] = RestuarensName[position!!]
      // Toast.makeText(this,"hey    " + position +restaurant, Toast.LENGTH_SHORT).show()
        setContentView(R.layout.activity_foods)
        var intent = intent
        restaurant = intent.getStringExtra("name")
        position=intent.getIntExtra("position",0)
        val res = findViewById<TextView>(R.id.restuarents)


        if(position == 0 ) {
            mamaschicken()
            res.setText("Mama's chicken restorants")


        }
        if(position == 1) {
            res.setText("Bilo's caffe")
            Bilos()
        }


       if(position == 2) {
           caramel()
           res.setText("caramel")
            }
        /*
        if(RestuarensName == "MAMA'S Chicken") {
            mamaschicken()
        }
        if(RestuarensName == "MAMA'S Chicken") {
            mamaschicken()
        }
        if(RestuarensName == "MAMA'S Chicken") {
            mamaschicken()
        }*/


            listing.layoutManager = LinearLayoutManager(this)
            listing.adapter = ImagesAdapter(name,pics,price)

    }
    private fun addtolist(namelist: String, picslist: Int, s: String){
        name.add(namelist)
        pics.add((picslist))
        price.add(s)
    }
    private fun Bilos(){
        //change the images
        addtolist("Donat",R.drawable.donat3,"65Birr")
        addtolist("Blackfoarst",R.drawable.donat,"80birr")
        addtolist("Cake",R.drawable.cake,"25birr")
    }
    private fun mamaschicken(){
        addtolist("Beyayinet",R.drawable.beya,"45birr")
        addtolist("Shiro",R.drawable.shiro,"50birrr")
        addtolist("pasta",R.drawable.pasta,"40birr")

    }
    private fun caramel(){

        addtolist("Pasta",R.drawable.caramel1,"35birr")
        addtolist("Shiro",R.drawable.caramel2,"45birr")
        addtolist("beyayinet",R.drawable.caramel3,"55birr")

    }
}