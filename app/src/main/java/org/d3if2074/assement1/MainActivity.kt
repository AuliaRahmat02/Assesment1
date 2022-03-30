package org.d3if2074.assement1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.d3if2074.assement1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            ukuranButton.setOnClickListener {
                ukuranBaju()
            }
        }
    }

    /* Catalog Ukuran Baju
    * Ukuran M  | Panjang = 68 - 70 | Lebar = 54 - 56 cm
    * Ukuran L  | Panjang = 71 - 72 | Lebar = 57 - 59 cm
    * Ukuran XL | Panjang = 73 - 75 | Lebar = 60 - 62 cm */

    private fun ukuranBaju() {
        val lebar = binding.lebarEditText.text.toString()
        val panjang = binding.panjangEditText.text.toString()

        if (lebar.toInt() in 54..62) {
            if (panjang.toInt() in 68..75) {
                // Ukuran Baju M
                if (lebar.toInt() in 54..56) {
                    if (panjang.toInt() in 68..70) {
                        binding.ukuranView.text = "Ukuran baju anda adalah : M"
                    } else {
                        binding.ukuranView.text =
                            "Maaf ukuran baju yang anda inginkan tidak tersedia!"
                    }
                }

                // Ukuran Baju L
                if (lebar.toInt() in 57..59) {
                    if (panjang.toInt() in 71..72) {
                        binding.ukuranView.text = "Ukuran baju anda adalah : L"
                    } else {
                        binding.ukuranView.text =
                            "Maaf ukuran baju yang anda inginkan tidak tersedia!"
                    }
                }

                // Ukuran Baju XL
                if (lebar.toInt() in 60..62) {
                    if (panjang.toInt() in 73..75) {
                        binding.ukuranView.text = "Ukuran baju anda adalah : XL"
                    } else {
                        binding.ukuranView.text =
                            "Maaf ukuran baju yang anda inginkan tidak tersedia!"
                    }
                } else {
                    binding.ukuranView.text =
                        "Maaf ukuran baju yang anda inginkan tidak tersedia!"
                }
            } else {
                binding.ukuranView.text =
                    "Maaf ukuran baju yang anda inginkan tidak tersedia!"
            }
        } else {
            binding.ukuranView.text =
                "Maaf ukuran baju yang anda inginkan tidak tersedia!"
        }
    }
}