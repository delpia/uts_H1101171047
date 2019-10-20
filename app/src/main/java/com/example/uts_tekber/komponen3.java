package com.example.uts_tekber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class komponen3 extends AppCompatActivity {
    Button button_syntax3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_komponen3);
        button_syntax3= (Button) findViewById(R.id.button_syntax3);

        button_syntax3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent delpia = new Intent(komponen3.this, contoh_3.class);
                startActivity(delpia);
            }
        });
    }
    public void link3 (View view){
        Intent lk3= new Intent(Intent.ACTION_VIEW, Uri.parse("http://android-beginner-lessons.blogspot.com/2015/10/android-mengenal-komponen-aplikasi.html"));
        startActivity(lk3);
    }
}
