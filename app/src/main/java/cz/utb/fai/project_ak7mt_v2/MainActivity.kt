package cz.utb.fai.project_ak7mt_v2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.gson.Gson
import cz.utb.fai.project_ak7mt_v2.databinding.ActivityMainBinding
import java.io.InputStreamReader
import java.net.URL
import javax.net.ssl.HttpsURLConnection


class MainActivity : AppCompatActivity()
{
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        fetchCurrencyData().start()
    }


    private fun fetchCurrencyData(): Thread
    {
        return Thread {
            val url = URL("https://open.er-api.com/v6/latest/aud")
            val connection = url.openConnection() as HttpsURLConnection

            if(connection.responseCode == 200)

            {
                val inputSystem = connection.inputStream
                val inputStreamReader = InputStreamReader(inputSystem, "UTF-8")
                val request = Gson().fromJson(inputStreamReader, Request::class.java)
                updateUI(request)
                inputStreamReader.close()
                inputSystem.close()
            }
            else
            {
                binding.baseCurrency.text = "Připojení se nezdařilo"

            }
        }

    }

    private fun updateUI(request: Request)
    {
        runOnUiThread{
            kotlin.run {
                binding.lastUpdate.text = request.time_last_update_utc
                binding.czk.text = String.format("CZK:  %.2f", request.rates.CZK)
                binding.eur.text = String.format("EUR:  %.2f", request.rates.EUR)
                binding.usd.text = String.format("USD:  %.2f", request.rates.USD)
            }

        }
    }
}