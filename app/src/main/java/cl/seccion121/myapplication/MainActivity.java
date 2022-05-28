package cl.seccion121.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Button btnActividadDos, btnFono, btnInacap, btnContatos;
    private EditText etCorreo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Referencias
        etCorreo = findViewById(R.id.etCorreo);
        btnActividadDos = findViewById(R.id.btnActividadDos);
        btnFono = findViewById(R.id.btnFono);
        btnInacap = findViewById(R.id.btnInacap);
        btnContatos = findViewById(R.id.btnContactos);

        //Eventos
        btnActividadDos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, SegundaActivity.class);
                String correo = etCorreo.getText().toString();

                Usuario usr = new Usuario("pulloa", 44, correo);
                i.putExtra("usuario", usr);
                startActivity(i);
            }
        });

        btnFono.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_CALL, Uri.parse("tel:+56966077777"));
                startActivity(i);
            }
        });

        btnInacap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.emol.com"));
                startActivity(i);
            }
        });

        btnContatos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("content://contacts/people/"));
                startActivity(i);
            }
        });
    }
}