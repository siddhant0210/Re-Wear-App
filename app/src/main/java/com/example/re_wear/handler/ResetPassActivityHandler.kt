package com.example.re_wear.handler

import android.content.ContentValues.TAG
import android.util.Log
import com.example.re_wear.databinding.ActivityPassresetBinding
import com.google.firebase.Firebase
import com.google.firebase.auth.auth

class ResetPassActivityHandler (
    private var  passResetBinding: ActivityPassresetBinding)
{

    fun onSendLink(){
        val emailAddress = passResetBinding.emailId.text.toString()

        Firebase.auth.sendPasswordResetEmail(emailAddress)
            .addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    Log.d(TAG, "Email sent.")
                }
            }
    }

}