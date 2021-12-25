package com.example.androidlab3

import android.os.Bundle
import com.example.androidlab3.databinding.Activity3Binding

class Activity3: BaseActivity() {

    private lateinit var binding: Activity3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = Activity3Binding.inflate(layoutInflater)
        binding.bnToFirst.setOnClickListener {
            setResult(RESULT_OK)
            finish()
        }
        binding.bnToSecond.setOnClickListener {
            finish()
        }
        setContentView(binding.root)
    }
}