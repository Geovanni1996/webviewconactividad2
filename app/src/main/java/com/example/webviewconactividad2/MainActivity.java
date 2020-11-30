package com.example.webviewconactividad2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    private EditText et1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.et_buscar);
    }

    public void Navegar(View view){
        Intent intent = new Intent(this, visorWeb.class);
        intent.putExtra("nombreSitio", et1.getText().toString());
        startActivity(intent);

    }



}


