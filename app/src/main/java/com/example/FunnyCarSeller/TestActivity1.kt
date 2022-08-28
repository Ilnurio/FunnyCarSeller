package com.example.FunnyCarSeller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.MyApplication.databinding.ActivityTest1Binding

class TestActivity1 : AppCompatActivity() {
    lateinit var bindingClass: ActivityTest1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityTest1Binding.inflate(layoutInflater)
        setContentView(bindingClass.root)
        val message = intent.getStringExtra("key")
        bindingClass.tv11.text = message

        bindingClass.byes.setOnClickListener {
            bindingClass.tv12.visibility = View.VISIBLE
            bindingClass.tv12.text = "Поздравляем, машина куплена!"
        }
        bindingClass.bno.setOnClickListener {
            bindingClass.tv12.visibility = View.VISIBLE
            bindingClass.tv12.text = "А вы умнее, чем кажетесь!"
        }

    }
    fun onClickBack(view: View) {
        finish()
    }
}