package com.example.kshitijdani.sensors;

import android.widget.Button;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button acc = findViewById(R.id.acc);
        final Button mag = findViewById(R.id.mag);
        final Button pro = findViewById(R.id.pro);

        acc.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(getApplicationContext(), accelerometer.class);
                startActivity(intent);

            }
        });

        mag.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), magnetometer.class);
                startActivity(intent);
            }
        });
//
        pro.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), proximity.class);
                startActivity(intent);
            }
        });
    }
}
