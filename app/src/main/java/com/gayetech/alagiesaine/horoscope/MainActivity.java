package com.gayetech.alagiesaine.horoscope;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends Activity {
    String URL = "http://192.168.0.101/junior_project/select_birthday.php";
    WebView webView;
    WebSettings webSettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        webView = (WebView) findViewById(R.id.webview);
        webSettings = webView.getSettings();
        webView.loadUrl(URL);
        webView.setWebViewClient(new WebViewClient());
        webSettings.setJavaScriptEnabled(true);
    }

    @Override
    protected void onStart() {
        webView.loadUrl(URL);
        super.onStart();
    }

    @Override
    public void onBackPressed() {
        if (webView.canGoBack()){
            webView.goBack();
        }
        super.onBackPressed();
    }
}
