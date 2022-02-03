package com.example.rehber

import android.content.Context
import android.view.TextureView
import android.view.View
import android.widget.ImageView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

// Dışardan parametre alarak context alırız.
// Context, androidin sahip olduğu işlemleri yapabilmemiçin gerekli olan
// bir nesne. Sayfa geçişi, toast mesaj gösterme vs. kullanılır.
class KisilerAdapter (var mContext: Context, var kisilerListe: Array<Kisiler>){
    inner class CardTasarimTutucu(tasarim:View):RecyclerView.ViewHolder(tasarim){
        var satir_card:CardView
        var satir_yazi:TextureView
        var satir_resim:ImageView
    }

}