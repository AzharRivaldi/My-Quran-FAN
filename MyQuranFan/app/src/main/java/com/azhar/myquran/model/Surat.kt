package com.azhar.myquran.model

import com.google.gson.annotations.SerializedName

data class Surat (
        @SerializedName("nomor")
        val nomor: String? = null,

        @SerializedName("nama")
        val nama: String? = null,

        @SerializedName("asma")
        val asma: String? = null,

        @SerializedName("name")
        val name: String? = null,

        @SerializedName("start")
        val start: String? = null,

        @SerializedName("ayat")
        val ayat: String? = null,

        @SerializedName("type")
        val type: String? = null,

        @SerializedName("urut")
        val urut: String? = null,

        @SerializedName("rukuk")
        val rukuk: String? = null,

        @SerializedName("arti")
        val arti: String? = null,

        @SerializedName("keterangan")
        val keterangan: String? = null)