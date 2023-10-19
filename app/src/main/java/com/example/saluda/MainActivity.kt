package com.example.saluda

import android.os.Bundle
import androidx.activity.ComponentActivity
import android.content.Intent
import android.widget.Button
import android.widget.EditText


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.principal)
        title="Hola Usuario"
        val botonSaluda: Button = findViewById(R.id.BotonSaluda)
        val editTextNombre: EditText = findViewById(R.id.ingresaSaluda)

        botonSaluda.setOnClickListener {
            val nombre = editTextNombre.text.toString()
            val intent = Intent(this, SaludaActivity::class.java)
            intent.putExtra("NOMBRE", nombre)
            startActivity(intent)
        }
    }
}