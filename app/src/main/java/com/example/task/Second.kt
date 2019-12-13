package com.example.task

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*
import android.os.Bundle as Bundle1


class Second : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle1?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

            two.setOnClickListener {
                val bc = Intent(this, Third::class.java)
                startActivity(bc)
            }
        three.setOnClickListener{
            finish()
        }
    }

}
