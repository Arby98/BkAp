package com.example.jegede.ba;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.content.Intent;



public class BA2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ba2);
    }

    public void _LogOut (View view) {

        Toast.makeText(this, "Congratulations, you have successfully logged out", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(BA2Activity.this, MainActivity.class);
        startActivity(intent);
    }

    public void _AbtUs (View view) {
        Intent intent = new Intent(BA2Activity.this, BA4Activity.class);
        startActivity(intent);
    }

    public void _OurS (View view) {
        Intent intent = new Intent(BA2Activity.this, BA6Activity.class);
        startActivity(intent);
    }

    public void _contUs (View view) {
        Intent intent = new Intent( BA2Activity.this, BA6Activity.class);
        startActivity(intent);
    }


}
