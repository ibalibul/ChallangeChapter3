package com.example.challangechapter3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.item_abjad.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listAbjad = arrayListOf(
            ListAbjad("A"),
            ListAbjad("B"),
            ListAbjad("C"),
            ListAbjad("D"),
            ListAbjad("E"),
            ListAbjad("F"),
            ListAbjad("G"),
            ListAbjad("H"),
            ListAbjad("I"),
            ListAbjad("J"),
            ListAbjad("K"),
            ListAbjad("L"),
            ListAbjad("M"),
            ListAbjad("N"),
            ListAbjad("O"),
            ListAbjad("P"),
            ListAbjad("Q"),
            ListAbjad("R"),
            ListAbjad("S"),
            ListAbjad("T"),
            ListAbjad("U"),
            ListAbjad("F"),
            ListAbjad("W"),
            ListAbjad("X"),
            ListAbjad("Y"),
            ListAbjad("Z"),
        )

        var adapterhuruf = AbjadAdapter(listAbjad)

//     Memanggil layout Manager
        var lm = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)

        rvAbjad.layoutManager = lm
        rvAbjad.adapter = adapterhuruf

        adapterhuruf.onClik = {
          val  pindah = Intent(this,FragmentDetailA::class.java)
            startActivity(pindah)

        }



        supportFragmentManager.beginTransaction()
            .replace(R.id.fcAbjed,FragmentAbjad())
            .commit()

        bottomNav.setOnNavigationItemSelectedListener {
            when (it.itemId){
                R.id.menuHome -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fcAbjed,FragmentAbjad())
                        .commit()
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.Account -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fcAbjed,FragmentProfile())
                        .commit()
                    return@setOnNavigationItemSelectedListener true
                }
            }
            false
        }

    }
}