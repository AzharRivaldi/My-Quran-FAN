package com.azhar.myquran.activity.detail

import android.os.Build
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.Html
import com.azhar.myquran.R
import kotlinx.android.synthetic.main.activity_detail.*
import java.util.*

class DetailActivity : AppCompatActivity() {
    var NOMOR: String? = "nomor"
    var NAMASURAT: String? = "namasurat"
    var ASMA: String? = "asma"
    var ARTI: String? = "arti"
    var JUMLAHAYAT: String? = "jumlahayat"
    var TURUNSURAT: String? = "turunsurat"
    var TURUNKE: String? = "turunke"
    var KETERANGAN: String? = "keterangan"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        title = getString(R.string.detailsurat)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            Objects.requireNonNull(supportActionBar)?.setDisplayHomeAsUpEnabled(true)
        }

        val intent = intent
        intent.let {
            tv_nomor.text = it.getStringExtra(NOMOR)
            tv_nama_surat.text = it.getStringExtra(NAMASURAT)
            tv_asma.text = it.getStringExtra(ASMA)
            tv_arti.text = it.getStringExtra(ARTI)
            tv_jumlah_ayat.text = it.getStringExtra(JUMLAHAYAT)
            tv_turun_surat.text = it.getStringExtra(TURUNSURAT)
            tv_turun_ke.text = it.getStringExtra(TURUNKE)
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) tv_keterangan.text = Html.fromHtml(it.getStringExtra(KETERANGAN), Html.FROM_HTML_MODE_COMPACT)
            else {
                tv_keterangan.text = Html.fromHtml(it.getStringExtra(KETERANGAN))
            }
        }
    }
}
