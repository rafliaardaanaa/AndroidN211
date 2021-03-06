package com.AhmadRizali.a211androidn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView


class HasilActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hasil)

        val namaTextView = findViewById<TextView>(R.id.namaTextView)
        val phoneTextView = findViewById<TextView>(R.id.phoneTextView)
        val emailTextView = findViewById<TextView>(R.id.emailTextView)
        val dateTextView = findViewById<TextView>(R.id.dateTextView)
        val numberTextView = findViewById<TextView>(R.id.numberTextView)

        namaTextView.setText(intent.getStringExtra("nama_extra"))
        phoneTextView.setText(intent.getStringExtra("phone_extra"))
        emailTextView.setText(intent.getStringExtra("email_extra"))
        dateTextView.setText(intent.getStringExtra("date_extra"))
        numberTextView.setText(intent.getStringExtra("number_extra"))
    }
}