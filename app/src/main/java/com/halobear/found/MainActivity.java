package com.halobear.found;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("ArrayEmail",getResources().getStringArray(android.R.array.emailAddressTypes).toString());
        Log.e("ArrayEmail","222222");
    }
}
