package com.example.MyApplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import com.example.MyApplication.databinding.ActivityMainFirstBinding
import com.example.FunnyCarSeller.Constance
import com.example.FunnyCarSeller.SignInUpAct

class MainActivityFirst : AppCompatActivity() {
    lateinit var bindingClass: ActivityMainFirstBinding
    private var login: String = "empty"
    private var password: String = "empty"
    private var Name: String = "empty"
    private var SurName: String = "empty"
    private var ThirdName: String = "empty"
    private var Avatar: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainFirstBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == Constance.REQUEST_CODE_SIGN_IN) {
            val l = data?.getStringExtra(Constance.LOGIN)
            val p = data?.getStringExtra(Constance.PASSWORD)
            if(login == l && password ==p){
                bindingClass.imAvatarFirst.visibility = View.VISIBLE
                bindingClass.imAvatarFirst.setImageResource(Avatar)
                val textInfo = "$Name $SurName $ThirdName"
                bindingClass.tvinfo.text = textInfo
                bindingClass.signUpButton.visibility = View.GONE
                bindingClass.signInButton.text = "Выйти"
                bindingClass.bGoToMainActivity.visibility = View.VISIBLE
            } else {
                bindingClass.imAvatarFirst.visibility = View.VISIBLE
                bindingClass.imAvatarFirst.setImageResource(R.drawable.avatarnotfound)
                bindingClass.tvinfo.text = "Такого перекупа не существует"
            }

        } else if (requestCode == Constance.REQUEST_CODE_SIGN_UP) {
                login = data?.getStringExtra(Constance.LOGIN)!!
                password = data?.getStringExtra(Constance.PASSWORD)!!
                Name = data?.getStringExtra(Constance.NAME)!!
                SurName = data?.getStringExtra(Constance.SURNAME)!!
                ThirdName = data?.getStringExtra(Constance.THIRDNAME)!!
                Avatar = data.getIntExtra(Constance.AVATAR_ID,0)!!
                bindingClass.imAvatarFirst.visibility = View.VISIBLE
                bindingClass.imAvatarFirst.setImageResource(Avatar)
                val textInfo = "$Name $SurName $ThirdName"
                bindingClass.tvinfo.text = textInfo
                bindingClass.signUpButton.visibility = View.GONE
                bindingClass.signInButton.text = "Выйти"
                bindingClass.bGoToMainActivity.visibility = View.VISIBLE
        }
    }
        fun onClickSignIn(view: View) {

            if(bindingClass.imAvatarFirst.isVisible && bindingClass.tvinfo.text.toString() != "Такого перекупа не существует"){
                bindingClass.imAvatarFirst.visibility = View.INVISIBLE
                bindingClass.tvinfo.text = ""
                bindingClass.signUpButton.visibility = View.VISIBLE
                bindingClass.signInButton.text = getString(R.string.Войти)
            }

            val intent = Intent(this, SignInUpAct::class.java)
            intent.putExtra(Constance.SIGN_STATE, Constance.SIGN_IN_STATE)
            startActivityForResult(intent, Constance.REQUEST_CODE_SIGN_IN)
        }

        fun OnClickSignUp(view: View) {
            val intent = Intent(this, SignInUpAct::class.java)
            intent.putExtra(Constance.SIGN_STATE, Constance.SIGN_UP_STATE)
            startActivityForResult(intent, Constance.REQUEST_CODE_SIGN_UP)
        }

        fun OnClickGoToMainActivity(view: View){
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
}