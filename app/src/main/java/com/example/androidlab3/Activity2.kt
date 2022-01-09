package com.example.androidlab3

import android.content.Intent
import android.os.Bundle
import com.example.androidlab3.databinding.Activity2Binding


class Activity2 : BaseActivity() {

    private lateinit var binding: Activity2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        binding = Activity2Binding.inflate(layoutInflater)
        binding.bnToFirst.setOnClickListener {
            finish()
        }
        binding.bnToThird.setOnClickListener {
            startActivityForResult(
                Intent(
                    this,
                    Activity3::class.java
                ), 1
            )
        }
        setContentView(binding.root)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 1 && resultCode == RESULT_OK) {
            finish()
        }
    }
}