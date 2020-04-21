package com.happyldc.androidcomponentstudy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.happyldc.base.Utils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void performAdd(View view) {
        Toast.makeText(this,  Utils.add(1,2)+"", Toast.LENGTH_SHORT).show();
    }
}
