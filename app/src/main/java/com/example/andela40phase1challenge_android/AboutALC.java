package com.example.andela40phase1challenge_android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class AboutALC extends AppCompatActivity {
    private WebView wvaboutalc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        wvaboutalc = new WebView(this);
        wvaboutalc.loadUrl("https://andela.com/alc/");
        setContentView(wvaboutalc);

    }
}
