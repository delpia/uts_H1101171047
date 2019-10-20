package com.example.uts_tekber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class komponen5 extends AppCompatActivity {
    Button button_syntax5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_komponen5);
        button_syntax5= (Button) findViewById(R.id.button_syntax5);

        button_syntax5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent delpia = new Intent(komponen5.this, contoh5.class);
                startActivity(delpia);
            }
        });
    }
    public void link5 (View view){
        Intent lk5= new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.codepolitan.com/belajar-menggunakan-intent-sebuah-jembatan-interaksi-antar-komponen-599a5576271ef"));
        startActivity(lk5);
    }
}
