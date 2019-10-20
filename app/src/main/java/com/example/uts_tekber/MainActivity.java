package com.example.uts_tekber;



import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.util.Linkify;
import android.content.Intent;
import android.view.View;
import android.widget.Button;



public class MainActivity extends AppCompatActivity {
Button button_kom1,button_kom2,button_kom3,button_kom4,button_kom5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_kom1 = (Button) findViewById(R.id.button_kom1);
        button_kom2 = (Button) findViewById(R.id.button_kom2);
        button_kom3 = (Button) findViewById(R.id.button_kom3);
        button_kom4 = (Button) findViewById(R.id.button_kom4);
        button_kom5 = (Button) findViewById(R.id.button_kom5);

        button_kom1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pia1 = new Intent(MainActivity.this, komponen1.class);
                startActivity(pia1);
            }
        });


        button_kom2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pia2 = new Intent(MainActivity.this, komponen2.class);
                startActivity(pia2);
            }
        });


        button_kom3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pia3 = new Intent(MainActivity.this, komponen3.class);
                startActivity(pia3);
            }
        });

        button_kom4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pia4 = new Intent(MainActivity.this, komponen4.class);
                startActivity(pia4);
            }
        });

        button_kom5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pia5 = new Intent(MainActivity.this, komponen5.class);
                startActivity(pia5);
            }
        });








    }
}
