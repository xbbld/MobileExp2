package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {
    @Override
    protected  void onCreate (Bundle sabaInstanceState){
        super.onCreate(sabaInstanceState);
        //setContentView(R.layout.linear_layout);
        //setContentView(R.layout.table_layout);
        setContentView(R.layout.constraint_layout_2);
    }
}
