package com.example.exampleintent2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView text1, text2, text3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initialize();
        al();
    }

    public void initialize(){
        text1 = findViewById(R.id.text1);
        text2 = findViewById(R.id.text2);
        text3 = findViewById(R.id.text3);
    }

    public void al(){
        Bundle bundle = getIntent().getExtras();
        String isim = bundle.getString("name");
        String soyisim = bundle.getString("lastname");
        String number = bundle.getString("number");
        text1.setText(isim);
        text2.setText(soyisim);
        text3.setText(number);
    }
}
