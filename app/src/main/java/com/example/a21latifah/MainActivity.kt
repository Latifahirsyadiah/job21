package com.example.a21latifah

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    val list = ArrayList<Kelas>()
    val listKelas = arrayOf(
        "HENI WIJIANTI",
        "IBNU RIFAN",
        "JIHAN SALWA FITRIANI",
        "IKHOTIMATUS SA'ADAH",
        "LADA'ARDHI S.L",
        "LATIFAH IRSYADIAH",
        "MAULIDA INTAN NUR AINI",
        "MIFTAKHUL JANNAH",
        "MUH ASA SUSILO F.S",
        "MUH HAIKAL ",
        "MUH RIFQIL KHANIF"
    )
    lateinit var kelasView: RecyclerView
    lateinit var kelasAdapter: KelasAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        kelasView = findViewById(R.id.kelasView)
        kelasView.layoutManager = LinearLayoutManager(this)

        for (i in listKelas.indices) {
            list.add(Kelas(listKelas[i]))
        }

        kelasAdapter = KelasAdapter(list)
        kelasAdapter.notifyDataSetChanged()
        kelasView.adapter = kelasAdapter
    }
}