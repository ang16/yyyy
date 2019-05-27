package com.example.menu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.menu.Listado.Main2Activity;
import com.example.menu.ListadoOptimizado.Main3Activity;
import com.example.menu.Recycler.Main4Activity;

public class MainActivity extends AppCompatActivity {
    Button listadoBtn;
    Button lIstadoOptimizadoBtn;
    Button recyclerBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listadoBtn= findViewById(R.id.listado);
        lIstadoOptimizadoBtn=findViewById(R.id.listadoOptimizado);
        recyclerBtn= findViewById(R.id.recycler);

        listadoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1= new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent1);
            }
        });
        lIstadoOptimizadoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1= new Intent(MainActivity.this, Main3Activity.class);
                startActivity(intent1);
            }
        });
        recyclerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1= new Intent(MainActivity.this, Main4Activity.class);
                startActivity(intent1);
            }
        });
    }
}
