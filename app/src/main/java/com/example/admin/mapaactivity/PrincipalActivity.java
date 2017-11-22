package com.example.admin.mapaactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

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
    private void irMarcador(int pos) {
        Intent intent = new Intent(this,MapaActivity.class);
        intent.putExtra("MARCADOR",lstMarcadores.get(pos));
        startActivity(intent);
    }

    private void llenarMarcadores() {
        lstMarcadores       = new ArrayList<>();
        lstMarcadores.add(new Marcador(13.730287, -89.719526999999971,"Universidad de Sonsonate"));
        lstMarcadores.add(new Marcador(13.7161024, -89.20346899999998,"Universidad Nacional"));
        lstMarcadores.add(new Marcador(13.7159035, -89.1536987,"Universidad Don Bosco"));
    }
}
