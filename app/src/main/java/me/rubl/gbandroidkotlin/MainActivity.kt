package me.rubl.gbandroidkotlin

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnHelloWorld : Button = findViewById(R.id.btnHelloWorld)
        btnHelloWorld.setOnClickListener {
            Toast.makeText(this, getString(R.string.app_name), Toast.LENGTH_SHORT).show()
        }

        var film = Film("Breaking Bad", 2008)
        btnHelloWorld.setText("${film.name} (${film.year})")
        var newFilm = film.copy(name = "Misfits")

        var isDarkTheme = Settings.isDarkTheme

        for(i in 3..11) {
            println("Kotlin#$i")
        }

        for(i in 3 downTo 0 step 1) {
            println(i)
            if (i == 0)
                println("START!")
        }
    }
}