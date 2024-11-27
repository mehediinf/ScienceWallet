package com.mtach.sciencewallet;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = findViewById(R.id.webView);

        // WebView Settings
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true); // Enable JavaScript
        webSettings.setDomStorageEnabled(true); // Enable DOM storage

        // Load URL
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://sciencewallet25.blogspot.com/");



    }
    @Override
    public void onBackPressed() {
        if (webView.canGoBack()){

            webView.goBack();
        }
        else {
            super.onBackPressed();
        }
    }
}


