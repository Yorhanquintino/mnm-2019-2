package com.example.mnm_20192

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var segredo:TextView = findViewById(R.id.texto)

        var quantidadedeerros:TextView = findViewById(R.id.texto2)

        var letra:EditText = findViewById(R.id.editText)

        var botao:Button = findViewById(R.id.button)

        var reiniciar:Button = findViewById(R.id.button2)

        var palavras = listOf<String>("sabado", "Maonamassa" , "eu")
        var erros = 0
        var acertos = mutableListOf<String>()
        var palavra = ""

        reiniciar. setOnClickListener{
            palavra = palavras.random()
            segredo.text = "_ ".repeat(palavra.count())

        }
        botao.setOnClickListener {
            var digito = letra.text.toString()
            var contemletra = palavra.indexOf(digito)
            if (contemletra > -1) {
                acertos.add(digito)

            } else {
                erros = erros + 1
                quantidadedeerros.text = "Erros $erros"
            }
        }
//
//        var texto:TextView = findViewById(R.id.texto)
//        texto.text= "meu texto"
//
//        var texto2:TextView = findViewById(R.id.texto2)
//        texto.text= "meu texto"
//
//        var botao :Button = findViewById((R.id.button))
//
//        var imput:EditText = findViewById(R.id.editText)
//
//        var numero = 7.0
//        var divisao = numero / 2
//        texto.text = divisao.toString()
//
//        var meuTexto = "meuTexto"
//        texto.text=meuTexto.get(1).toString()
//
//        var a = 1
//
//            texto2.text = "Digite o numero" + a
//
//        botao.setOnClickListener{
//            if  (imput.text.toString() == a.toString() ){
//                texto.text = "você digitou correndo"
//
//
//            }
//                else {
//                texto.text = "você errou, você não sabe escrever"
//            }
//        }
//
//
//        texto.text = imput.text
//

    }
}
