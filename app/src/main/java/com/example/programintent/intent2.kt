package com.example.programintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_intent2.*
class intent2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent2)

        val nim:TextView = findViewById(R.id.tVnim)
        val nama:TextView = findViewById(R.id.tVnama)
        val nilai:TextView = findViewById(R.id.tVnilai)
        val nilai_akhir:TextView = findViewById(R.id.tVketerangan)

        nim.setText(intent.getStringExtra("nim_mhs"))
        nama.setText(intent.getStringExtra("nama_mhs"))
        nilai.setText(intent.getStringExtra("nilai_mhs"))

        var total_nilai:Int=0
        var ket:String=""
        total_nilai=(intent.getStringExtra("nilai_mhs").toInt())

        if (total_nilai >= 85 && total_nilai <=100 ){
            ket="A"
        }else if (total_nilai >= 65 && total_nilai <85){
            ket="B"
        }else if (total_nilai >= 50 && total_nilai <65){
            ket="C"
        }else if (total_nilai >= 30 && total_nilai <50){
            ket="D"
        }else if (total_nilai >= 15 && total_nilai <30){
            ket="C"
        }else if (total_nilai>= 0 && total_nilai <15){
            ket="E"
        }

        nilai_akhir.setText(ket)
        intent = Intent(this, MainActivity::class.java)
        startActivity(intent) }
    }

