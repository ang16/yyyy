package com.example.menu.Listado;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.menu.R;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {
    ListView lDatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        lDatos=findViewById(R.id.lDatos);
        final ArrayList<String> datos= new ArrayList<>();
        for (int i=0;i<100;i++){
            datos.add("Dato "+i);
        }
        ArrayAdapter<String> adapatador=new ArrayAdapter<String>(Main2Activity.this,android.R.layout.simple_list_item_1,datos);
        lDatos.setAdapter(adapatador);

        lDatos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(Main2Activity.this, "Has pulsado la opción: "+datos.get(i), Toast.LENGTH_LONG).show();
            }
        });
    }
}
