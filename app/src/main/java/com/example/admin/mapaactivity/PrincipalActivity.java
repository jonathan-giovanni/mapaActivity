package com.example.admin.mapaactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class PrincipalActivity extends AppCompatActivity {

    Button btnMarcador1,btnMarcador2,btnMarcador3;
    ArrayList<Marcador> lstMarcadores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        btnMarcador1        = (Button) findViewById(R.id.btnMarcador1);
        btnMarcador2        = (Button) findViewById(R.id.btnMarcador2);
        btnMarcador3        = (Button) findViewById(R.id.btnMarcador3);

        llenarMarcadores();

        btnMarcador1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                irMarcador(0);
            }
        });
        btnMarcador2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                irMarcador(1);
            }
        });
        btnMarcador3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                irMarcador(2);
            }
        });
    }
    private void irMarcador(int pos){
        startActivity(new Intent(this,MapaActivity.class));
    }

    private void llenarMarcadores(){
        lstMarcadores       = new ArrayList<>();
        lstMarcadores.add(new Marcador("Universidad de sonsonate","13.730288","-89.71952699999997"));
        lstMarcadores.add(new Marcador("Universidad Nacional","13.7161024","-89.20346899999998"));
        lstMarcadores.add(new Marcador("Universidad Don Bosco","13.7159035","-89.1536987"));

    }
}
