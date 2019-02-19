package com.example.cjgreen.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.e("tag", "Error");
        Log.w("tag", "Warning");
        Log.i("tag", "Information");
        Log.d("tag", "Debug");
        Log.v("tag", "Verbose");
    }
}
