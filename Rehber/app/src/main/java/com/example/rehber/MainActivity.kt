package com.example.rehber

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import androidx.appcompat.widget.SearchView
import kotlinx.android.synthetic.main.activity_main.*
                                        // Arama özelliği eklemek için
class MainActivity : AppCompatActivity(), SearchView.OnQueryTextListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Toolbar kısmına yazı eklemek için ve aktif hale getirmek için:
        main_toolbar.title = "Rehber"
        main_toolbar.subtitle = "Kişi listesi"
        setSupportActionBar(main_toolbar)


        ButtonAdd.setOnClickListener {
            //val intent = Intent(this@MainActivity, KayitActivity::class.java)
            val intent = Intent(this@MainActivity, DuzenleActivity::class.java)

            startActivity(intent)
        }
    }
     // arama_toolbar_menu.xml doysındaki arama toolbar'ını
    // MainActivity'de tanımlamamız lazım.
    override fun onCreateOptionsMenu(menu: Menu): Boolean {

         // Tasatımsal yapıları koda aktarmak için inflater metodu kullanılır.
         menuInflater.inflate(R.menu.arama_toolbar_menu, menu)

         val item = menu.findItem(R.id.action_ara)
          // arama özelliği olan nesnemiz oldu.
         val searchView = item.actionView as SearchView
         searchView.setOnQueryTextListener(this)
         return super.onCreateOptionsMenu(menu)
    }

    override fun onBackPressed() {
        val intent = Intent(Intent.ACTION_MAIN)
        intent.addCategory(Intent.CATEGORY_HOME)
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        startActivity(intent)
    }

    // Arama özelliği eklemek için bu ikisini ekledik
    override fun onQueryTextSubmit(query: String): Boolean {
        Log.e("Gönderilen arama sonucu", query)
        return true
    }

    override fun onQueryTextChange(newText: String): Boolean {
        Log.e("Harf girdikçe sonuç",newText)
        return true
    }
}