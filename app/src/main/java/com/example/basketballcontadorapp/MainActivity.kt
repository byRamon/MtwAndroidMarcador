package com.example.basketballcontadorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    public fun A3p(view:View){
        lblMarcadorA.text = (3 + lblMarcadorA.text.toString().toInt()).toString()
    }
    public fun B3p(view:View){
        lblMarcadorB.text = (3 + lblMarcadorB.text.toString().toInt()).toString()
    }
    public fun A2p(view:View){
        lblMarcadorA.text = (2 + lblMarcadorA.text.toString().toInt()).toString()
    }
    public fun B2p(view:View){
        lblMarcadorB.text = (2 + lblMarcadorB.text.toString().toInt()).toString()
    }
    public fun A1p(view:View){
        lblMarcadorA.text = (1 + lblMarcadorA.text.toString().toInt()).toString()
    }
    public fun B1p(view:View){
        lblMarcadorB.text = (1 + lblMarcadorB.text.toString().toInt()).toString()
    }
    public fun clear(view:View){
        val lblA : TextView = lblMarcadorA
        lblA.text = "0"
        val lblB : TextView = lblMarcadorB
        lblB.text = "0"
    }
}
