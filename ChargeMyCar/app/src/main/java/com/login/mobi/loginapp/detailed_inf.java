package com.login.mobi.loginapp;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class detailed_inf extends AppCompatActivity {

    private TextView showNome;
    private TextView showMorada;
    private TextView showCidade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detailed_inf);

//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        showNome = findViewById(R.id.show_nome);
        showMorada = findViewById(R.id.show_morada);
        showCidade = findViewById(R.id.show_cidade);
        Intent intent = getIntent();
        String nome = intent.getStringExtra("nome");
        String morada = intent.getStringExtra("morada");
        String cidade = intent.getStringExtra("cidade");

        showNome.setText("Nome: " + nome);
        showMorada.setText("Morada: " + morada);
        showCidade.setText("Cidade: " + cidade);
    }
}