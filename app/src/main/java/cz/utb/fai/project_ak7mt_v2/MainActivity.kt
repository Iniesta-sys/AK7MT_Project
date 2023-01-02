package cz.utb.fai.project_ak7mt_v2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import cz.utb.fai.project_ak7mt_v2.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity()
{
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}