package com.eg23.etumobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class UEHomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uehome);

        Button cs_btn =  findViewById(R.id.buttonCS);
        cs_btn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent myIntent = new Intent(UEHomeActivity.this, UEActivity.class);
                UEHomeActivity.this.startActivity(myIntent);
                //Toast.makeText(ProfileActivity.this, "Bienvenue à l'application étudiante de l'UTT", Toast.LENGTH_SHORT).show();

            }
        });
    }
}
