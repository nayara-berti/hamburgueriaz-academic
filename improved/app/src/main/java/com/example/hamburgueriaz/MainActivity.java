package com.example.hamburgueriaz;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.CheckBox;
import android.content.Intent;
import android.net.Uri;

import com.example.hamburgueriaz.model.Order;
import com.example.hamburgueriaz.model.Cart;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    EditText edtNome;
    Button btnAdicionar, btnFinalizar, btnMais, btnMenos;
    TextView txtResumo, txtQuantidade;
    CheckBox chkBacon, chkQueijo, chkOnion;

    int quantidade = 1;
    Cart cart = new Cart();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNome = findViewById(R.id.edtNome);
        btnAdicionar = findViewById(R.id.btnAdicionar);
        btnFinalizar = findViewById(R.id.btnFinalizar);
        txtResumo = findViewById(R.id.txtResumo);
        btnMais = findViewById(R.id.btnMais);
        btnMenos = findViewById(R.id.btnMenos);
        txtQuantidade = findViewById(R.id.txtQuantidade);

        chkBacon = findViewById(R.id.chkBacon);
        chkQueijo = findViewById(R.id.chkQueijo);
        chkOnion = findViewById(R.id.chkOnion);

        // Botão +
        btnMais.setOnClickListener(view -> {
            quantidade++;
            txtQuantidade.setText(String.valueOf(quantidade));
        });

        // Botão -
        btnMenos.setOnClickListener(view -> {
            if (quantidade > 1) {
                quantidade--;
                txtQuantidade.setText(String.valueOf(quantidade));
            }
        });

        // 🛒 ADICIONAR AO CARRINHO
        btnAdicionar.setOnClickListener(view -> {

            String nome = edtNome.getText().toString().trim();

            if (nome.isEmpty()) {
                txtResumo.setText("Digite seu nome antes de adicionar.");
                return;
            }

            Order order = new Order(
                    nome,
                    chkBacon.isChecked(),
                    chkQueijo.isChecked(),
                    chkOnion.isChecked(),
                    quantidade
            );

            cart.addOrder(order);

            String descricao = cart.generateOrderDescription();

            txtResumo.setText(
                    "Itens no carrinho:\n\n" +
                            descricao +
                            "\n------------------------\n" +
                            "Total: R$ " + cart.getTotalPrice()
            );

            limparCampos();
        });

        // 📧 FINALIZAR PEDIDO
        btnFinalizar.setOnClickListener(view -> {

            if (cart.getOrders().isEmpty()) {
                txtResumo.setText("Carrinho vazio.");
                return;
            }

            String nomeCliente = edtNome.getText().toString().trim();

            if (nomeCliente.isEmpty()) {
                txtResumo.setText("Digite seu nome antes de finalizar.");
                return;
            }

            int total = cart.getTotalPrice();

            String descricao = cart.generateOrderDescription();

            // Código cliente baseado em horário
            String timestamp = new SimpleDateFormat("HHmmss", Locale.getDefault())
                    .format(new Date());

            String codigoCliente = "HZ" + timestamp;

            String resumoFinal =
                    "Pedido finalizado com sucesso!\n\n" +
                            "Cliente: " + nomeCliente + "\n\n" +
                            "Itens:\n" +
                            descricao +
                            "\n-----------------------------\n" +
                            "Total: R$ " + total +
                            "\n\nCódigo do Cliente: " + codigoCliente +
                            "\n\nObrigada pela preferência e bom apetite! 🍔";

            Intent intent = new Intent(Intent.ACTION_SENDTO);
            intent.setData(Uri.parse("mailto:"));
            intent.putExtra(Intent.EXTRA_SUBJECT,
                    "Pedido Hamburgueria de " + nomeCliente);
            intent.putExtra(Intent.EXTRA_TEXT, resumoFinal);

            startActivity(intent);


        });
    }

    private void limparCampos() {
        quantidade = 1;
        txtQuantidade.setText("1");
        chkBacon.setChecked(false);
        chkQueijo.setChecked(false);
        chkOnion.setChecked(false);
    }
}