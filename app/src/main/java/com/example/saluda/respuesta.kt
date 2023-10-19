package com.example.saluda
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity

class SaludaActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.saluda )
        title="Hola Usuario"
        val nombre= intent.getStringExtra("NOMBRE")
        val textViewContesta: TextView = findViewById(R.id.contesta)
        textViewContesta.text= "Hola, $nombre!"
    }
}