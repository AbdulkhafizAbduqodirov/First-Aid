package com.example.firstaid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_sign_up.*

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        button.setOnClickListener {
         when{
             edit_username.text.isEmpty()->{
                 Toast.makeText(this,"Foydalanuvchi nomini kiriting",Toast.LENGTH_SHORT).show()
             }edit_email.text.isEmpty()->{
                 Toast.makeText(this,"E-mailini kiriting",Toast.LENGTH_SHORT).show()
             }edit_password.text.isEmpty()->{
                 Toast.makeText(this,"Parolini kiriting",Toast.LENGTH_SHORT).show()
             }edit_confirm.text.isEmpty()->{
                 Toast.makeText(this,"Parolni qayta kiriting",Toast.LENGTH_SHORT).show()
             } else ->{ val intent=Intent(this,LastActivity::class.java)
             startActivity(intent)

             }


         }

        }
    }


}