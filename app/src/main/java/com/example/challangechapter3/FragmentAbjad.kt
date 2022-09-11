package com.example.challangechapter3

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_abjad.*


class FragmentAbjad : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_abjad, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

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
        var lm = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL,false)

        rvAbjad.layoutManager = lm
        rvAbjad.adapter = adapterhuruf
        adapterhuruf.setOnkliklistener(object : AbjadAdapter.onItemClikListener{
            override fun onClik(abjad: String) {
                var bundle = Bundle()
                Log.d("fragmentAbjad", "onClik: klik")
                Log.d("fragmentAbjad", "onClik: $abjad")
                bundle.putString("abjad",abjad)
                Navigation.findNavController(view).navigate(R.id.action_fragmentAbjad_to_fragmentDetailA,bundle)
            }

        })

        }
    }
