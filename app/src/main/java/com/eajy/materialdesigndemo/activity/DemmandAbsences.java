package com.eajy.materialdesigndemo.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.eajy.materialdesigndemo.R;

public class DemmandAbsences extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demmand_absences);
    }

    public void form_add_abs(View view) {
        Intent add_abs = new Intent(this, AjouterDemandeAbsence.class);
        startActivity(add_abs);
    }
}
