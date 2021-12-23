package com.thalpi.hesapmakinesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var toplamButton : Button
    private lateinit var  cikarmaButton: Button
    private lateinit var bölmeButton: Button
    private lateinit var carpimButton: Button
    private lateinit var sonucTextView: TextView
    private lateinit var ilkSayi : EditText
    private lateinit var ikinciSayi : EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        toplamButton = findViewById(R.id.toplamButton)
        cikarmaButton = findViewById(R.id.cikarmaButton)
        bölmeButton = findViewById(R.id.bölmeButton)
        carpimButton = findViewById(R.id.carpimButton)
        sonucTextView = findViewById(R.id.sonucText)
        ilkSayi = findViewById(R.id.ilkSayi)
        ikinciSayi = findViewById(R.id.ikinciSayi)

        toplamButton.setOnClickListener{
            val sayi1 : Int = Integer.parseInt(ilkSayi.text.toString())
            val sayi2 : Int = Integer.parseInt(ikinciSayi.text.toString())
            val toplam = sayi1 + sayi2
            sonucTextView.text = toplam.toString()
        }

        cikarmaButton.setOnClickListener{
            val sayi1 : Int = Integer.parseInt(ilkSayi.text.toString())
            val sayi2 : Int = Integer.parseInt(ikinciSayi.text.toString())
            val cikarma = sayi1 - sayi2
            sonucTextView.text = cikarma.toString()
        }

        bölmeButton.setOnClickListener{
            val sayi1 : Int = Integer.parseInt(ilkSayi.text.toString())
            val sayi2 : Int = Integer.parseInt(ikinciSayi.text.toString())
            val bolme = sayi1/sayi2
            sonucTextView.text = bolme.toString()
        }

        carpimButton.setOnClickListener{
            val sayi1 : Int = Integer.parseInt(ilkSayi.text.toString())
            val sayi2 : Int = Integer.parseInt(ikinciSayi.text.toString())
            val carpim = sayi1*sayi2
            sonucTextView.text = carpim.toString()
        }




    }
}