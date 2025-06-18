
package br.com.estacio.mercearia

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCadastrarProduto = findViewById<Button>(R.id.btnCadastrarProduto)
        btnCadastrarProduto.setOnClickListener {
            val intent = Intent(this, CadastroProdutoActivity::class.java)
            startActivity(intent)
        }

        val btnRegistrarVenda = findViewById<Button>(R.id.btnRegistrarVenda)
        btnRegistrarVenda.setOnClickListener {
            val intent = Intent(this, RegistroVendaActivity::class.java)
            startActivity(intent)
        }

        val btnRelatorioEstoque = findViewById<Button>(R.id.btnRelatorioEstoque)
        btnRelatorioEstoque.setOnClickListener {
            val intent = Intent(this, RelatorioEstoqueActivity::class.java)
            startActivity(intent)
        }

        Toast.makeText(this, "Bem-vindo ao App Mercearia Nova Esperança", Toast.LENGTH_LONG).show()
    }
}
