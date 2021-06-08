package br.com.local.pluglightapp02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class teste extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.teste_layout);
    }

    public void entrarJanelaPrincipal(View view) {

        Intent abrirJanela = new Intent(getApplicationContext(),testemenu.class);
        startActivity(abrirJanela);
        //Fechando a janela de Login
        finish();

    }

}