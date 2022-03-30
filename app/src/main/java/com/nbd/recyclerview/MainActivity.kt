package com.nbd.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nbd.recyclerview.databinding.ActivityMainBinding
import org.json.JSONObject

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fakeVideoData: Array<JSONObject> = arrayOf(

           // JSONObject("{\"title\": \"BARRA DE NAVIDAD\", \"ViajandoSobreRuedas\": \"Channel\", \"views\": \"640 views\", \"datePosted\": \"1 year ago\", \"duration\": \"01:40\"}"),
            //JSONObject("{\"title\": \"MUSEO CASA NATAL DE MORELOS\", \"channel\": \"ViajandoSobreRuedas\", \"views\": \"303 views\", \"datePosted\": \"5 days ago\", \"duration\": \"03:14\"}"),
            //JSONObject("{\"title\": \"TRANSFERENCIA CAMA/SILLA\", \"channel\": \"ViajandoSobreRuedas\", \"views\": \"501 views\", \"datePosted\": \"6 months ago\", \"duration\": \"03:57\"}"),
            JSONObject("{\"title\": \"naarsee\", \"channel\": \"Channel\", \"views\": \"10k views\", \"datePosted\": \"2 months ago\", \"duration\": \"05:00\"}"),
            JSONObject("{\"title\": \"alex\", \"channel\": \"Channel\", \"views\": \"25k views\", \"datePosted\": \"2 years ago\", \"duration\": \"05:00\"}"),
            JSONObject("{\"title\": \"bere\", \"channel\": \"Channel\", \"views\": \"54k views\", \"datePosted\": \"2 days ago\", \"duration\": \"05:00\"}"),
            JSONObject("{\"title\": \"Sep\", \"channel\": \"Channel\", \"views\": \"4k views\", \"datePosted\": \"2 hours ago\", \"duration\": \"05:00\"}"),

            )

        binding.rvVideoEntries.adapter=MainAdapter(fakeVideoData)
    }
}