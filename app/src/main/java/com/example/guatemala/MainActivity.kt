package com.example.guatemala

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.content.Intent
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView


class MainActivity : AppCompatActivity(), TextWatcher {


    var contador = 0
    private var star: ImageButton? = null
    private var peten: Button? = null
    private var izabal: Button? = null
    private var antigua: Button? = null
    private var name: EditText? = null
    private var newname: TextView? = null
    private var new: String? = null
    private var guatemala: TextView? = null
    private var tex: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        star = findViewById(R.id.star_button) as ImageButton

        peten = findViewById(R.id.peten) as Button
        izabal = findViewById(R.id.izabal) as Button
        antigua = findViewById(R.id.antigua) as Button
        name = findViewById(R.id.set_name) as EditText
        newname = findViewById(R.id.show_name) as TextView

        guatemala = findViewById(R.id.guatemala) as TextView
        tex = findViewById(R.id.name) as TextView


    }
    fun set(v: View?){
        contador++
        new = name?.text.toString()
        newname?.text  = new
        if(contador%2 != 0){
            newname?.setVisibility(View.VISIBLE)
            name?.setVisibility(View.INVISIBLE)
            guatemala?.setVisibility(View.INVISIBLE)
            tex?.setVisibility(View.INVISIBLE)
        }else{

            newname?.setVisibility(View.INVISIBLE)
            name?.setVisibility(View.VISIBLE)
            guatemala?.setVisibility(View.VISIBLE)
            tex?.setVisibility(View.VISIBLE)
        }

    }

    fun goPeten(v: View?){

        val intent = Intent(this, PetenActivity::class.java)
       startService(intent)

    }



    //Ignore
    override fun afterTextChanged(s: Editable?) {

    }

    override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

    }

    override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

    }



    }


