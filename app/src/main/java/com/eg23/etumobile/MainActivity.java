package com.eg23.etumobile;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.MenuItem;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.widget.Button;
import android.widget.EditText;

import java.text.BreakIterator;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private static EditText dateSelected;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);


        // Gestion de la date Tableau de bord

        dateSelected = (EditText) findViewById(R.id.dateSelected);
        final Calendar dateDuJour = Calendar.getInstance();
        int annee = dateDuJour.get(Calendar.YEAR);
        int mois = dateDuJour.get(Calendar.MONTH);
        int jourMois = dateDuJour.get(Calendar.DAY_OF_MONTH);
        int jourSemaine = dateDuJour.get(Calendar.DAY_OF_WEEK);

        String tabMois[] = {"Janvier","Février","Mars","Avril","Mai","Juin","Juillet","Août","Septembre","Octobre","Novembre","Décembre"};
        String tabSemaine[] = {"Lundi","Mardi","Mercredi","Jeudi","Vendredi","Samedi","Dimanche"};

        String date = tabSemaine[jourSemaine] + " " + jourMois + " " + tabMois[mois] + " " + annee;
        dateSelected.setText(date);

        // Changement de la date via les boutons
        // Droite
        Button rightDateButton = (Button) findViewById(R.id.rightDateButton);
        rightDateButton.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.dateSelected.setText("Jour d'avant"); //test
            }
        });

        // Gauche
        Button leftDateButton = (Button) findViewById(R.id.leftDateButton);
        leftDateButton.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.dateSelected.setText("Jour d'après"); //test
            }
        });
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        /*if (id == R.id.profile) {
            Intent myIntent = new Intent(MainActivity.this, ProfileActivity.class);
            MainActivity.this.startActivity(myIntent);
            return true;
        }

        if (id == R.id.params) {
            Intent myIntent = new Intent(MainActivity.this, ParamsActivity.class);
            MainActivity.this.startActivity(myIntent);
            return true;
        }*/

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.bord) {
            // Handle the camera action
        } else if (id == R.id.planning) {

        } else if (id == R.id.contacts) {

        } else if (id == R.id.cursus) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.stage) {

        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
