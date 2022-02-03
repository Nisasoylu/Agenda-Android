package com.example.rehber

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_duzenle.*
import kotlinx.android.synthetic.main.activity_duzenle.text_ad
import kotlinx.android.synthetic.main.activity_duzenle.text_soyad
import kotlinx.android.synthetic.main.activity_duzenle.text_tel_no

class DuzenleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_duzenle)

        duzenle_toolbar.title = "Güncelleme Ekranı"
        duzenle_toolbar.subtitle = "Kişiyi Editle"
        setSupportActionBar(duzenle_toolbar)


        guncelle_buton.setOnClickListener {
            guncelle(text_ad.text.toString(), text_soyad.text.toString(), text_tel_no.text.toString())


        }
    }

    fun guncelle(ad:String, soyad:String, tel_no:String){
        Log.e("Kişi güncelle", "$ad - $soyad -$tel_no")
        startActivity(Intent(this@DuzenleActivity, MainActivity::class.java))

    }
}