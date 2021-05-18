package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class webActivity extends AppCompatActivity {

    WebView wv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        wv1=(WebView)findViewById(R.id.wv1);

        String URL=getIntent().getStringExtra("Sitio Web");
        wv1.setWebViewClient(new WebViewClient());
        wv1.loadUrl("https://"+URL);
    }

    public void Cerrar(View view){
        finish();
    }
}