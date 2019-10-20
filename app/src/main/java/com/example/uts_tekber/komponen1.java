package com.example.uts_tekber;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.text.util.Linkify;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class komponen1 extends AppCompatActivity {
Button button_syntax1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_komponen1);

        button_syntax1= (Button) findViewById(R.id.button_syntax1);

        button_syntax1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent delpia = new Intent(komponen1.this, contoh_1.class);
                startActivity(delpia);
            }
        });
    }
    public void link1 (View view){
        Intent lk1= new Intent(Intent.ACTION_VIEW, Uri.parse("http://android-beginner-lessons.blogspot.com/2015/10/android-mengenal-komponen-aplikasi.html"));
        startActivity(lk1);
    }
}
