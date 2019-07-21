package com.azhar.myquran.model

import com.google.gson.annotations.SerializedName

data class Response (
        @SerializedName("status")
        val status: String? = null,

        @SerializedName("hasil")
        val hasil: ArrayList<Surat>?)