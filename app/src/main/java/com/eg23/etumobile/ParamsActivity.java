package com.eg23.etumobile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class ParamsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_params);
        Spinner spinner1 = (Spinner) findViewById(R.id.spinner);
        Spinner spinner2 = (Spinner) findViewById(R.id.spinner2);
        Spinner spinner3 = (Spinner) findViewById(R.id.spinner3);
        Spinner spinner4 = (Spinner) findViewById(R.id.spinner4);

        // List 1
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this, R.array.importance,
                android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter1);
        // End List

        // List 1
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this, R.array.quand,
                android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter2);
        // End List

        // List 1
        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this, R.array.reccurence,
                android.R.layout.simple_spinner_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner3.setAdapter(adapter3);
        // End List

        // List 1
        ArrayAdapter<CharSequence> adapter4 = ArrayAdapter.createFromResource(this, R.array.lang,
                android.R.layout.simple_spinner_item);
        adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner4.setAdapter(adapter4);
        // End List
    }
}
