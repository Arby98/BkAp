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

       public  void LogOut (View view)
    {
        Intent intent = new Intent(BA2Activity.this, MainActivity.class);
        startActivity(intent);

        Toast.makeText(this, "Sucessfully Logged Out", Toast.LENGTH_SHORT).show();
    }
}
