//package com.example.ul_project1
//import android.util.Patterns
//
//
//class CredentialsManager {
////    fun isEmailValid(email:String): Boolean{
////        //gia regex Patterns.EMAIL_ADDRESS.......Patterns.EMAIL_ADDRESS.pattern()
////        val emailPattern= ("^[\w-\.]+@([\w-]+\.)+[\w-]{2,4}$")
////        val regex=Regex(emailPattern)
////
////        return regex.matches(email)
////        return email.isNotEmpty()
////    }
//
//    private val emailPattern = (("[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}" +
//            "\\@" +
//            "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}" +
//            "(" +
//            "\\." +
//            "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25}" +
//            ")+"))
//
//    fun isEmailValid(email: String): Boolean {
//        return Regex(emailPattern).matches(email)
//    }
//
//    fun login(email: String, password: String) {
//        if (email == "test" && password == "1234") {
//            return true
//        }
//        return false
//    }
//}
