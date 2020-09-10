package com.example.testonline

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var menulist = ArrayList<Model>()
    var presenter = Presenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter.generateAllItems()
        menulist = presenter.menulist

        list.adapter = CustomAdapter(this, menulist)

        list.setOnItemClickListener { parent, view, position, id ->
            val nama = menulist[position].nama
            val gambar = menulist[position].gambar
            val detail = menulist[position].detail

            val intent = Intent(this, Main2Activity::class.java)
            intent.putExtra("nama", nama)
            intent.putExtra("gambar", gambar)
            intent.putExtra("detail", detail)
            startActivity(intent)
        }
    }
}
