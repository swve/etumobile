package com.eg23.etumobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UEActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ue);

        Button eg23_btn =  findViewById(R.id.eg23_more);
        eg23_btn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent myIntent = new Intent(UEActivity.this, UEInfoActivity.class);
                UEActivity.this.startActivity(myIntent);
                /** Fading Transition Effect */
                UEActivity.this.overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                //Toast.makeText(ProfileActivity.this, "Bienvenue à l'application étudiante de l'UTT", Toast.LENGTH_SHORT).show();

            }
        });
    }
}
