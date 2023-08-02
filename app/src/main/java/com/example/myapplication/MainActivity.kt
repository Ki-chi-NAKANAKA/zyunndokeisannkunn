package com.example.myapplication

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.Spinner

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //全てのID読み取り
        val MassOfStd: EditText = findViewById(R.id.MassOfStd)
        val PeakOfStd: EditText = findViewById(R.id.PeakOfStd)
        val MwOfCom: EditText = findViewById(R.id.MwOfCom)
        val PeakOfCom: EditText = findViewById(R.id.PeakOfCom)
        val MassOfCom: EditText = findViewById(R.id.MassOfCom)
        val NumberOfSpicificProton: EditText = findViewById(R.id.NumberOfSpicificProton)
        val spinner: Spinner = findViewById(R.id.spinner)

        val spinnerAdapter = ArrayAdapter<String>(this, android.R.layout.simple_spinner_item)
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        Lang.values().forEach {
            spinnerAdapter.add(it.name)
        }
        spinner.adapter = spinnerAdapter
        spinner.onItemSelectedListener = spinnerAdapterListener
    }



    private val spinnerAdapterListener = object : AdapterView.OnItemSelectedListener {
        override fun onItemSelected(
            parent: AdapterView<*>?,
            view: View?,
            position: Int,
            id: Long
        ) {
            // 選択された時に実行したい処理
        }

        override fun onNothingSelected(parent: AdapterView<*>?) {
            // 選択されなかった時に実行したい処理
        }
    }

    enum class Lang{
        DSS,
        DMS
    }
}
