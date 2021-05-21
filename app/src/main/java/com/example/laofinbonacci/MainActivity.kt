package com.example.laofinbonacci

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var digitar: EditText
    lateinit var botao: Button
    private lateinit var resposta: TextView
    var msg: String = "1 "

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        digitar = findViewById(R.id.numero)
        botao = findViewById(R.id.calcular)
        resposta = findViewById(R.id.resultado)

        botao.setOnClickListener {
            var numDigitado = digitar.text.toString()
            var numInt = numDigitado.toIntOrNull()


            var fn1: Int = 1
            var fn2: Int = 1

            when {
                numDigitado.isEmpty() -> {
                    digitar.error = "Por favor, digite um número!"
                }
                else -> {
                    for (i in 1 until numInt!!) {
                        msg += "$fn1"
                        val fn2_aux = fn1
                        fn1 = fn1 + fn2
                        fn2 = fn2_aux

                    }
                    resposta.visibility = View.VISIBLE
                    resposta.text = msg
                }
            }
        }

    }
}