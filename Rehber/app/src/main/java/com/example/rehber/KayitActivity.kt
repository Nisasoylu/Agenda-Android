package com.example.rehber

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_kayit.*

class KayitActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kayit)

        kayit_toolbar.title = "Kayıt Ekranı"
        kayit_toolbar.subtitle = "Yeni kayıt ekle"
        setSupportActionBar(kayit_toolbar)

        buttonKaydet.setOnClickListener {
            kayit(text_ad.text.toString(), text_soyad.text.toString(), text_tel_no.text.toString())

            val intent = Intent(this@KayitActivity, MainActivity::class.java)
            startActivity(intent)
        }
    }

    fun kayit(ad:String, soyad:String, tel_no:String){
        Log.e("Kişi bilgileri", "$ad - $soyad -$tel_no")
    }
}