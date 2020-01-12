package com.eajy.materialdesigndemo.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.eajy.materialdesigndemo.R;

public class MesAbsences extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mes_absences);
    }

    public void demande(View view) {
        Intent demande = new Intent(this, JustifierAbsence.class);
        startActivity(demande);
    }
}
