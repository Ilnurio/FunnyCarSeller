package com.example.FunnyCarSeller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import com.example.MyApplication.R
import com.example.MyApplication.databinding.ActivitySignInUpBinding

class SignInUpAct : AppCompatActivity() {
    lateinit var bindingClass: ActivitySignInUpBinding
    private var signState = "empty"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivitySignInUpBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        signState = intent.getStringExtra(Constance.SIGN_STATE)!!
        if (signState == Constance.SIGN_IN_STATE) {
            bindingClass.idName.visibility = View.GONE
            bindingClass.idSurName.visibility = View.GONE
            bindingClass.idThirdName.visibility = View.GONE
            bindingClass.bAvatar.visibility = View.INVISIBLE
        }
    }
    fun onClickDone(view: View) {
        if (signState == Constance.SIGN_UP_STATE) {
            val intent = Intent()
            intent.putExtra(Constance.LOGIN, bindingClass.idLogin.text.toString())
            intent.putExtra(Constance.PASSWORD, bindingClass.idPassword.text.toString())
            intent.putExtra(Constance.NAME, bindingClass.idName.text.toString())
            intent.putExtra(Constance.SURNAME, bindingClass.idSurName.text.toString())
            intent.putExtra(Constance.THIRDNAME, bindingClass.idThirdName.text.toString())
            if(bindingClass.imAvatar.isVisible)intent.putExtra(Constance.AVATAR_ID, R.drawable.avatar)
            setResult(RESULT_OK, intent)
            finish()

        } else if(signState == Constance.SIGN_IN_STATE){
            intent.putExtra(Constance.LOGIN, bindingClass.idLogin.text.toString())
            intent.putExtra(Constance.PASSWORD, bindingClass.idPassword.text.toString())
            setResult(RESULT_OK, intent)
            finish()
        }
    }
    fun onClickAvatar(view : View) {
        bindingClass.imAvatar.visibility = View.VISIBLE
    }

}