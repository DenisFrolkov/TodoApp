package com.example.todoapp.extensions

import android.text.Editable
import androidx.fragment.app.Fragment

fun Fragment.validateName(text: Editable?): String? {
    return if (text.toString().isNotEmpty()) null else "Поле не должно быть пустым"
}

fun Fragment.validateEmail(text: Editable?): String? {

    return if(text?.isNotEmpty()!!)
    {
        if(text.length >= 7 && text.contains("@")) {
            null
        } else {
            "Неверная почта"
        }
    }
    else {
        "Поле не должно быть пустым"
    }

}

fun Fragment.validatePass(text: Editable?): String? {

    return if(text?.isNotEmpty()!!)
    {
        if(text.length >= 8) {
            null
        } else {
            "Пароль должен содержать больше 8 символов"
        }
    }
    else {
        "Поле не должно быть пустым"
    }
}

fun Fragment.validateConf(text: Editable?): String? {
    return if(text?.isNotEmpty()!!)
    {
        if(text.length >= 8) {
            null
        } else {
            "Пароль должен содержать больше 8 символов"
        }
    }
    else {
        "Поле не должно быть пустым"
    }
}