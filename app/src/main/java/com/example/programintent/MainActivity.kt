package com.example.programintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nim:EditText = findViewById(R.id.txtnim)
        val nama:EditText = findViewById(R.id.txtnama)
        val nilai:EditText = findViewById(R.id.txtnilai)


        btnProses.setOnClickListener(){
            intent = Intent(this, intent2::class.java)
            intent.putExtra("nim_mhs",nim.getText().toString() )
            intent.putExtra("nama_mhs",nama.getText().toString() )
            intent.putExtra("nilai_mhs",nilai.getText().toString() )
            startActivity(intent)
        }
    }
}