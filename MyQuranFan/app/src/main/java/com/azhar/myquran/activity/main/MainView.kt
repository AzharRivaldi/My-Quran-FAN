package com.azhar.myquran.activity.main

import com.azhar.myquran.model.Surat

interface MainView {
    fun showLoading()
    fun onRespone(hasil: ArrayList<Surat>?)
    fun onError(message: String?)
    fun hideLoading()
}