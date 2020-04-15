package com.example.intentproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class Activity2 extends AppCompatActivity {

    EditText edt2,edt4,edt5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        edt2=findViewById(R.id.edt2);
        edt2=findViewById(R.id.edit4);
        edt2=findViewById(R.id.edit5);

    }
}
