package com.example.MyApplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import com.example.MyApplication.databinding.ActivityMainBinding
import com.example.FunnyCarSeller.TestActivity1

class MainActivity : AppCompatActivity() {
    lateinit var bindingClass: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        bindingClass.b1.setOnClickListener {
            bindingClass.im1.visibility = ImageView.VISIBLE
            bindingClass.im1.setImageResource(R.drawable.b1)
            bindingClass.tv1.visibility = View.VISIBLE
            bindingClass.tv2.visibility = View.VISIBLE
            bindingClass.tv2.text = "7499839823"
            bindingClass.tv3.visibility = View.VISIBLE
            bindingClass.tv4.visibility = View.VISIBLE
            bindingClass.tv4.text = "ЕК 777 Х 77"
        }

        bindingClass.b2.setOnClickListener {
            bindingClass.im1.visibility = ImageView.VISIBLE
            bindingClass.im1.setImageResource(R.drawable.b2)
            bindingClass.tv1.visibility = View.VISIBLE
            bindingClass.tv2.visibility = View.VISIBLE
            bindingClass.tv2.text = "43793234829"
            bindingClass.tv3.visibility = View.VISIBLE
            bindingClass.tv4.visibility = View.VISIBLE
            bindingClass.tv4.text = "ЕК 001 Х 77"
        }

        bindingClass.b3.setOnClickListener {
            bindingClass.im1.visibility = ImageView.VISIBLE
            bindingClass.im1.setImageResource(R.drawable.b3)
            bindingClass.tv1.visibility = View.VISIBLE
            bindingClass.tv2.visibility = View.VISIBLE
            bindingClass.tv2.text = "43793234829"
            bindingClass.tv3.visibility = View.VISIBLE
            bindingClass.tv4.visibility = View.VISIBLE
            bindingClass.tv4.text = "ЕК 034 Х 77"
        }

        bindingClass.b6.setOnClickListener {
            bindingClass.im1.visibility = ImageView.VISIBLE
            bindingClass.im1.setImageResource(R.drawable.b4)
            bindingClass.tv1.visibility = View.VISIBLE
            bindingClass.tv2.visibility = View.VISIBLE
            bindingClass.tv2.text = "344573458793"
            bindingClass.tv3.visibility = View.VISIBLE
            bindingClass.tv4.visibility = View.VISIBLE
            bindingClass.tv4.text = "ЕК 003 Х 77"
        }

        bindingClass.b4.setOnClickListener {
            bindingClass.im1.visibility = ImageView.VISIBLE
            bindingClass.im1.setImageResource(R.drawable.b5)
            bindingClass.tv1.visibility = View.VISIBLE
            bindingClass.tv2.visibility = View.VISIBLE
            bindingClass.tv2.text = "23456094657"
            bindingClass.tv3.visibility = View.VISIBLE
            bindingClass.tv4.visibility = View.VISIBLE
            bindingClass.tv4.text = "ЕК 005 Х 77"
        }

        bindingClass.b5.setOnClickListener {
            bindingClass.im1.visibility = ImageView.VISIBLE
            bindingClass.im1.setImageResource(R.drawable.b6)
            bindingClass.tv1.visibility = View.VISIBLE
            bindingClass.tv2.visibility = View.VISIBLE
            bindingClass.tv2.text = "56456310654"
            bindingClass.tv3.visibility = View.VISIBLE
            bindingClass.tv4.visibility = View.VISIBLE
            bindingClass.tv4.text = "ЕК 006 Х 77"
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode == 100){

        }
    }

    fun onClickTest1 (view: View) {
        val i = Intent(this, TestActivity1::class.java)
        i.putExtra("key","Не бита, не крашена, покупали бабушке, бабушка не ездила")
        startActivityForResult(i, 100)
    }

    fun onClickFinish (view: View){
        finish()
    }
}