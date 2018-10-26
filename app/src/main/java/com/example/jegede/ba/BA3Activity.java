package com.example.jegede.ba;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;


public class BA3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ba3);
    }
    public void _Sign (View view) {
        Intent intent = new Intent(BA3Activity.this, MainActivity.class);
        startActivity(intent);
    }


}
