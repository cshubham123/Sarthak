package com.example.sarthak

import android.os.Bundle
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragment = findViewById<FrameLayout>(R.id.frag)
        val ft = supportFragmentManager.beginTransaction()
        ft.add(R.id.frag , RecyclerFragment())
        ft.commit()

    }
}
