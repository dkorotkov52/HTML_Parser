package com.example.html_parser;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.webkit.WebView;
import android.widget.TextView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    WebView myWebView;
    TextView parse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        loadHTML();
    }

    private void initView() {
        getSupportActionBar().setTitle("Parsing HTML");
        myWebView = findViewById(R.id.web_view);
        parse = findViewById(R.id.parse);
    }

    private void loadHTML() {
        myWebView.loadUrl("file:///android_asset/list.html");
    }
}
