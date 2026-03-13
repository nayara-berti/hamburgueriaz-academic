package com.example.hamburgueriaz;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.CheckBox;
import android.content.Intent;
import android.net.Uri;

public class MainActivity extends AppCompatActivity {

    EditText edtNome;
    Button btnEnviar, btnMais, btnMenos;
    TextView txtResumo, txtQuantidade;
    CheckBox chkBacon, chkQueijo, chkOnion;

    int quantidade = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Conectar elementos da tela
        edtNome = findViewById(R.id.edtNome);
        btnEnviar = findViewById(R.id.btnEnviar);
        txtResumo = findViewById(R.id.txtResumo);
        btnMais = findViewById(R.id.btnMais);
        btnMenos = findViewById(R.id.btnMenos);
        txtQuantidade = findViewById(R.id.txtQuantidade);

        chkBacon = findViewById(R.id.chkBacon);
        chkQueijo = findViewById(R.id.chkQueijo);
        chkOnion = findViewById(R.id.chkOnion);

        // Botão +
        btnMais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                quantidade++;
                txtQuantidade.setText(String.valueOf(quantidade));
            }
        });

        // Botão -
        btnMenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (quantidade > 1) {
                    quantidade--;
                    txtQuantidade.setText(String.valueOf(quantidade));
                }
            }
        });

        // Botão Enviar Pedido
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String nome = edtNome.getText().toString();

                boolean temBacon = chkBacon.isChecked();
                boolean temQueijo = chkQueijo.isChecked();
                boolean temOnion = chkOnion.isChecked();

                int preco = 20;

                if (temBacon) preco += 2;
                if (temQueijo) preco += 2;
                if (temOnion) preco += 3;

                int precoFinal = preco * quantidade;

                String resumo =
                        "Nome: " + nome +
                                "\nTem Bacon? " + (temBacon ? "Sim" : "Não") +
                                "\nTem Queijo? " + (temQueijo ? "Sim" : "Não") +
                                "\nTem Onion Rings? " + (temOnion ? "Sim" : "Não") +
                                "\nQuantidade: " + quantidade +
                                "\nPreço final: R$ " + precoFinal;

                txtResumo.setText(resumo);

                // Intent para abrir e-mail
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:"));
                intent.putExtra(Intent.EXTRA_SUBJECT, "Pedido de " + nome);
                intent.putExtra(Intent.EXTRA_TEXT, resumo);

                startActivity(intent);
            }
        });
    }
}