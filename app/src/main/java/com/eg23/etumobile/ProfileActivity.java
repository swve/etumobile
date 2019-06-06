package com.eg23.etumobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        ImageView image_btn =  findViewById(R.id.params_btn);
        image_btn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent myIntent = new Intent(ProfileActivity.this, ParamsActivity.class);
                ProfileActivity.this.startActivity(myIntent);
                /** Fading Transition Effect */
                ProfileActivity.this.overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                //Toast.makeText(ProfileActivity.this, "Bienvenue à l'application étudiante de l'UTT", Toast.LENGTH_SHORT).show();

            }
        });
    }

}
