package com.example.asus.seekbarcolorexample

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        seekR.max = 255
        seekG.max = 255
        seekB.max = 255
        var renkR: Int = seekR.progress
        var renkG: Int = seekG.progress
        var renkB: Int = seekB.progress
        btnRenk.setBackgroundColor(Color.rgb(renkR, renkG, renkB))

        seekR.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(p0: SeekBar?, proggres: Int, p2: Boolean) {
                renkR = proggres
                btnRenk.setBackgroundColor(Color.rgb(renkR, renkG, renkB))
                textView.text="R: "+renkR.toString()
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {

            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
                textView.text="R: "+renkR.toString()

            }
        })

        seekG.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(p0: SeekBar?, proggres: Int, p2: Boolean) {
                renkG = proggres
                btnRenk.setBackgroundColor(Color.rgb(renkR, renkG, renkB))
                textView3.text="G: "+renkG.toString()
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {

            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
                textView3.text="G: "+renkG.toString()

            }
        })

        seekB.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(p0: SeekBar?, proggres: Int, p2: Boolean) {
                renkB = proggres
                btnRenk.setBackgroundColor(Color.rgb(renkR, renkG, renkB))
                textView4.text="B: "+renkB.toString()
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {

            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
                textView4.text="B: "+renkB.toString()
            }
        })


    }
}
