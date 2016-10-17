package com.example.principal.sided;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    BotaoAcessar.setOnClickListener(new OnClickListener() {
        @Override
        public void onClick(View v) {

            Intent trocadorTela = new Intent(MainActivity.this, SegundaTelaActivity.class);
            startActivity(trocadorTela);

        }
    }


}