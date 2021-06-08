package br.com.local.pluglightapp02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class testemenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.testemenu_layout);
    }

    public void voltar(View view){
        startActivity(new Intent(getApplicationContext(), teste.class));
        //fechando a janela principal
        finish();
    }

}