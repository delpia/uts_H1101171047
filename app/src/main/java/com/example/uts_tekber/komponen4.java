package com.example.uts_tekber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class komponen4 extends AppCompatActivity {
    Button button_syntax4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_komponen4);
        button_syntax4= (Button) findViewById(R.id.button_syntax4);

        button_syntax4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent delpia = new Intent(komponen4.this, contoh_4.class);
                startActivity(delpia);
            }
        });
    }
    public void link4 (View view){
        Intent lk4= new Intent(Intent.ACTION_VIEW, Uri.parse("http://android-beginner-lessons.blogspot.com/2015/10/android-mengenal-komponen-aplikasi.html"));
        startActivity(lk4);
    }
}
