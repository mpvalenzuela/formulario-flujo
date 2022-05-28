package cl.seccion121.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class SegundaActivity extends AppCompatActivity {
    private Button btnTercera, btnVolver;

    private String[] nombres = new String[10];
    private ArrayList<String> losNombres = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        Bundle bundle = getIntent().getExtras();

        if(bundle != null){
            Usuario usr = (Usuario) bundle.getSerializable("usuario");

            Toast.makeText(this, "Edad " + usr.getEdad(), Toast.LENGTH_SHORT).show();
            Log.d("TAG_", "Correo ->" + usr.getCorreo());
            Log.d("TAG_", "Usuario ->" + usr.getUsuario());
        }

        btnTercera = findViewById(R.id.btnTercera);
        btnVolver = findViewById(R.id.btnVolver);

        nombres[0] = "juanito";
        losNombres.add("juanito");

        int x = 0;
        for (x = 0; x <= 100; ++x){
            losNombres.add("Elemento" + x);
        }
        Log.d("TAG_", "Contenido variable x" + x);
        losNombres.add("elemento n");
        losNombres.remove(0);

        Log.d("TAG_", "Recorrer ArrayList modo clásico");
        for(x = 0; x < losNombres.size(); ++x){
            Log.d("TAG_", losNombres.get(x));
        }

        Log.d("TAG_", "-------Con for extendido");
        for(String e : losNombres){
            Log.d("TAG_", e);
        }

        //Eventos
        btnTercera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SegundaActivity.this, TerceraActivity.class);
                startActivity(i);
            }
        });

        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}