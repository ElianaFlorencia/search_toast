package com.example.search_toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.SearchView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        SearchView barraBusqueda =findViewById(R.id.barraBusqueda);
        barraBusqueda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView contentText =findViewById(R.id.contentText);
                contentText.setText(R.string.contentTextNroDosActualizadoOnClick);
            }
        });







    }



}