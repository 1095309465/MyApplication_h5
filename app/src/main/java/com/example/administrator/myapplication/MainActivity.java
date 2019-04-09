package com.example.administrator.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    WebView web;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        web = findViewById(R.id.web);
        tv = findViewById(R.id.tv);
        web.getSettings().setJavaScriptEnabled(true);
        web.addJavascriptInterface(new JavaScripInterface(), "imooclauncher");

        web.loadUrl("file:///android_asset/index.html");
    }
}
