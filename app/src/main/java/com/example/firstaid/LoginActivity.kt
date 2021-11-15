package com.example.firstaid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        btn_kirish.setOnClickListener {
            when {
                edit_login.text.isEmpty() -> {
                    Toast.makeText(this,"Foydalanuvchi nomini kiriting",Toast.LENGTH_SHORT).show()
                }
                edit_login_pass.text.isEmpty() -> {
                    Toast.makeText(this,"Parolingizni kiriting",Toast.LENGTH_SHORT).show()
                }
                else -> {
                    val intent = Intent(this,LastActivity::class.java)
                    startActivity(intent)
                }
            }
        }
        tv_forget_pass.setOnClickListener {
            Toast.makeText(this,"Did you forget your password ?",Toast.LENGTH_SHORT)
        }


    }
}