package cz.utb.fai.project_ak7mt_v2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val secondActbutton = findViewById<Button>(R.id.second_act_btn)
        secondActbutton.setOnClickListener{
            val Intent = Intent(this,MainActivityCurrency::class.java)
            startActivity(Intent)
        }
    }
}