package com.example.testonline

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val nama = intent.getStringExtra("nama")
        val gambar = intent.getIntExtra("gambar", 0)
        val detail = intent.getStringExtra("detail")

        nama_text.text = nama
        image.setImageResource(gambar)
        detail_text.text = detail
    }
}
