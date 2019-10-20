package com.example.uts_tekber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class komponen2 extends AppCompatActivity {
Button button_syntax2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_komponen2);

        button_syntax2= (Button) findViewById(R.id.button_syntax2);

        button_syntax2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent delpia = new Intent(komponen2.this, contoh_2.class);
                startActivity(delpia);
            }
        });

    }
   public void link2 (View view) {
        Intent lk2= new Intent(Intent.ACTION_VIEW, Uri.parse("http://android-beginner-lessons.blogspot.com/2015/10/android-mengenal-komponen-aplikasi.html"));
        startActivity(lk2);
   }
}
