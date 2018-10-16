package com.example.balal.qrgenerat;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class Main4Activity extends AppCompatActivity {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        imageView=(ImageView) this.findViewById(R.id.imageView);
        Bitmap bitmap=getIntent().getParcelableExtra("pic");
        imageView.setImageBitmap(bitmap);
    }
}
