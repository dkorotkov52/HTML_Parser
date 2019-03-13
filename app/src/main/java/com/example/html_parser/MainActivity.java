package com.example.html_parser;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

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
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            Objects.requireNonNull(getSupportActionBar()).setTitle("Parsing HTML");
        }
        myWebView = findViewById(R.id.web_view);
        parse = findViewById(R.id.parse);
        parse.setOnClickListener(this);
    }

    private void loadHTML() {
        myWebView.loadUrl("file:///android_asset/list.html");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.parse:
                parseHTML();
                break;
            default:
                Log.e("MyLog", "click " + v.getId());
                break;
        }
    }

    private void parseHTML() {

    }
}
