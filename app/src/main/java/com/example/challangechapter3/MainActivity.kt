package com.example.challangechapter3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.item_abjad.*

class MainActivity : AppCompatActivity(){


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        supportFragmentManager.beginTransaction()
//            .replace(R.id.fcAbjed,FragmentAbjad())
//            .commit()
//
//        bottomNav.setOnNavigationItemSelectedListener {
//            when (it.itemId){
//                R.id.menuHome -> {
//                    supportFragmentManager.beginTransaction()
//                        .replace(R.id.fcAbjed,FragmentAbjad())
//                        .commit()
//                    return@setOnNavigationItemSelectedListener true
//                }
//                R.id.Account -> {
//                    supportFragmentManager.beginTransaction()
//                        .replace(R.id.fcAbjed,FragmentProfile())
//                        .commit()
//                    return@setOnNavigationItemSelectedListener true
//                }
//            }
//            false
//        }

    }

//    override fun passDataComp(abjad: String) {
//        val bundel = Bundle()
//        bundel.putString("hurufA",abjad)
//
//        val pindahFragmen = this.supportFragmentManager.beginTransaction()
//        val fragmentB = FragmentDetailA()
//        fragmentB.arguments = bundel
//
//        pindahFragmen.replace(R.id.fcAbjed,fragmentB)
//        pindahFragmen.commit()
//    }
}