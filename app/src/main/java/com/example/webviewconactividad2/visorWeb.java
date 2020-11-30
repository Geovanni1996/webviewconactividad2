    package com.example.webviewconactividad2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.view.View;

public class visorWeb extends AppCompatActivity {

    WebView visor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visor_web);

        visor = (WebView)findViewById(R.id.visor1);

        String URL = getIntent().getStringExtra("nombreSitio");
        visor.setWebViewClient(new WebViewClient());
        visor.loadUrl("htpp://"+ URL);

    }


}