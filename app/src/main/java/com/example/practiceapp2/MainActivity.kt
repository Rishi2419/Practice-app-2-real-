package com.example.practiceapp2

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import com.shashank.sony.fancytoastlib.FancyToast
import java.util.Vector

class MainActivity : AppCompatActivity() {
    private lateinit var button: Button
    private lateinit var button2: Button

    val custommenu= com.example.practiceapp2.Custommenu()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById<Button>(R.id.showtoast)

        button.setOnClickListener {
            Toast.makeText(this, "Toast msg", Toast.LENGTH_SHORT).show()

            button2 = findViewById<Button>(R.id.showtoast2)

            button2.setOnClickListener {
                FancyToast.makeText(
                    this,
                    "Hello World !",
                    FancyToast.LENGTH_LONG,
                    FancyToast.WARNING,
                    true
                ).show()
            }
        }

        val showPopUp = findViewById<ImageView>(R.id.imageView)

        showPopUp.setOnClickListener {
        custommenu.custommenu(this, it)
    }



    }
}