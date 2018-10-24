package com.example.jegede.ba;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void login (View view) {
        Intent intent = new Intent(MainActivity.this, BA2Activity.class);
        startActivity(intent);
    }
    public void signUp (View view) {
        Intent intent = new Intent(MainActivity.this, BA3Activity.class);
        startActivity(intent);
    }
}
