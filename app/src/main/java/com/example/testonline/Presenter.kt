package com.example.testonline

class Presenter {

    var menulist = ArrayList<Model>()

    val nama = arrayOf(
        "Batre 20 persen",
        "Batre 30 persen",
        "Batre 50 persen",
        "Batre 60 persen",
        "Batre 70 persen",
        "Batre 80 persen",
        "Batre charging 20 persen",
        "Batre charging 30 persen",
        "Batre charging 50 persen",
        "Batre charging 60 persen"
    )

    val gambar = intArrayOf(
        R.drawable.ic_battery_20,
        R.drawable.ic_battery_30,
        R.drawable.ic_battery_50,
        R.drawable.ic_battery_60,
        R.drawable.ic_battery_80,
        R.drawable.ic_battery_90,
        R.drawable.ic_battery_charging_20,
        R.drawable.ic_battery_charging_30,
        R.drawable.ic_battery_charging_50_black_24dp,
        R.drawable.ic_battery_charging_60_black_24dp
    )

    val detail = arrayOf(
        "Ini batre 20 persen",
        "Ini batre 30 persen",
        "Ini batre 50 persen",
        "Ini batre 60 persen",
        "Ini batre 70 persen",
        "Ini batre 80 persen",
        "Ini batre charging 20 persen",
        "Ini batre charging 30 persen",
        "Ini batre charging 50 persen",
        "Ini batre charging 60 persen"
    )

    fun generateAllItems(){
        for (i in nama.indices){
            val model = Model()
            model.nama = nama[i]
            model.gambar = gambar[i]
            model.detail = detail[i]
            menulist.add(model)
        }
    }
}