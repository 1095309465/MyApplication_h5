package com.example.administrator.myapplication;

import android.util.Log;
import android.webkit.JavascriptInterface;

public class JavaScripInterface {

    @JavascriptInterface
    void setValue(String value) {
        Log.e("JavaScripInterface", "value=" + value);
    }
}
