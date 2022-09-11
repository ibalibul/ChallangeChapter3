package com.example.challangechapter3

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_detail_a.*


class FragmentDetailA : Fragment() {

    var displayMessage : String? = ""

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_detail_a, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        displayMessage = arguments?.getString("abjad")

        val listKata = arrayListOf<String>(
            "ayam", "api", "air",
            "Badak", "Bakso", "Bajaj",
            "cicak", "Coklat", "Chery",
            "Dasi", "Dapur", "duku",
            "Elang", "Eropa", "Entog",
            "Flag", "flamingo", "flamboyan",
            "Gajah", "Garpu", "Garis",
            "Harimau", "Hantu", "Hari",
            "Ikan", "Iklan", "Ireng",
            "Jerapah", "Jam", "Jeruk",
            "Kambing","Kerumunan","Kesemek",
            "lama","lantai","lansing",
            "Mother","Monkey","Mall",
            "Nanas","Nasi","Nari",
            "Operasi","Orang","Operator",
            "Pariwisata","Panda","panglima",
            "Rasa","Rapih","Rapiah",
            "Sapi","Sampah","Satu",
            "Tali","Tampan","Tarik",
            "Unta","Umpan","Ulah",
            "Vitamin","Villa","Visa",
            "Warna","Wasington","Waspada",
            "Yaris","Yoga","yoyo",
            "qasar","Qur'an","Quenepa",
            "Zebra","Zaitun","Zat"


        )

        val filterKata = listKata.filter { kata ->
            kata.first().toString().uppercase() == displayMessage
        } as ArrayList<String>

        val adapter = DetailAdapter(filterKata)
//        val adapter = DetailAdapter(listKata)
        rvDetail.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        rvDetail.adapter = adapter

        adapter.setOnItemClickListener(object : DetailAdapter.OnItemClickListener {
            override fun onClick(kata: String) {
                val intent = Intent(Intent.ACTION_VIEW)
                intent.data = Uri.parse("https://www.google.com/search?q=$kata")
                startActivity(intent)
            }
        })
    }
}