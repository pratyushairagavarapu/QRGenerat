package com.example.balal.qrgenerat;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.balal.qrgenerat.Main2Activity;
import com.example.balal.qrgenerat.Main3Activity;
import com.example.balal.qrgenerat.R;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void morsecodeGen(View view) {
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }
    public void qrcodeGen(View view) {
        Intent intent = new Intent(this, Main3Activity.class);
        startActivity(intent);
    }

}
