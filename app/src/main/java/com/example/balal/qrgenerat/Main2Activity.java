package com.example.balal.qrgenerat;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.balal.qrgenerat.R;

public class Main2Activity extends AppCompatActivity {
    EditText editText;
    TextView textView;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        editText = (EditText) findViewById(R.id.editText);
        textView = (TextView) findViewById(R.id.textView);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textView.setText(convert(editText.getText().toString()));
            }
        });
    }

    public String convert(String text) {
        String temp = "";

        temp = text.toUpperCase();

        temp = temp.replace("0", "----- ");
        temp = temp.replace("1", ".---- ");
        temp = temp.replace("2", "..--- ");
        temp = temp.replace("3", "...-- ");
        temp = temp.replace("4", "....- ");
        temp = temp.replace("5", "..... ");
        temp = temp.replace("6", "-.... ");
        temp = temp.replace("7", "--... ");
        temp = temp.replace("8", "---.. ");
        temp = temp.replace("9", "----. ");



        temp = temp.replace("A", ".- ");
        temp = temp.replace("B", "-... ");
        temp = temp.replace("C", "-.-. ");
        temp = temp.replace("D", "-.. ");
        temp = temp.replace("E", ". ");
        temp = temp.replace("F", "..-. ");
        temp = temp.replace("G", "--. ");
        temp = temp.replace("H", ".... ");
        temp = temp.replace("I", ".. ");
        temp = temp.replace("J", ".--- ");
        temp = temp.replace("K", "-.- ");
        temp = temp.replace("L", ".-.. ");
        temp = temp.replace("M", "-- ");
        temp = temp.replace("N", "-. ");
        temp = temp.replace("O", "--- ");
        temp = temp.replace("P", ".--. ");
        temp = temp.replace("Q", "--.- ");
        temp = temp.replace("R", ".-. ");
        temp = temp.replace("S", "... ");
        temp = temp.replace("T", "- ");
        temp = temp.replace("U", "..- ");
        temp = temp.replace("V", "...- ");
        temp = temp.replace("W", ".-- ");
        temp = temp.replace("X", "-..- ");
        temp = temp.replace("Y", "-.-- ");
        temp = temp.replace("Z", "--.. ");


        return temp;
    }


}
