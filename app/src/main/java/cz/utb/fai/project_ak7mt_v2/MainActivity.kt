package cz.utb.fai.project_ak7mt_v2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import cz.utb.fai.project_ak7mt_v2.databinding.ActivityMainCurrencyEurBinding
import cz.utb.fai.project_ak7mt_v2.databinding.ActivityMainCurrencyGbpBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val button1: Button = findViewById<Button>(R.id.second_act_btn)
        val button2: Button = findViewById<Button>(R.id.third_act_btn)
        val button3: Button = findViewById<Button>(R.id.fourth_act_btn)
        val button4: Button = findViewById<Button>(R.id.five_act_btn)
        //val button3: Button = findViewById<Button>(R.id.fourth_act_btn)

        button1.setOnClickListener{
            val intent = Intent(this, MainActivityCurrency::class.java)
            startActivity(intent)
        }
        button2.setOnClickListener{
            val intent = Intent(this, MainActivityCurrencyGBP::class.java)
            startActivity(intent)
        }
        button3.setOnClickListener {
            val intent = Intent(this, MainActivityCurrencyEUR::class.java)
            startActivity(intent)
        }
        button4.setOnClickListener {
            val intent = Intent(this, MainActivityCurrencyUSD::class.java)
            startActivity(intent)
        }

        //val secondActbutton = findViewById<Button>(R.id.second_act_btn)
        //secondActbutton.setOnClickListener {
            //val Intent = Intent(this, MainActivityCurrency::class.java)
            //startActivity(Intent)



        }
    }
