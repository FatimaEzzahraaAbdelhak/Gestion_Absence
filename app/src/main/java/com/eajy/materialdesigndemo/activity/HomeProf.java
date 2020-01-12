package com.eajy.materialdesigndemo.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.eajy.materialdesigndemo.R;

public class HomeProf extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_prof);
    }

    public void consulter_bsence(View view) {
        Intent intent = new Intent(this, ConsulterAbsenceProf.class);
        startActivity(intent);
    }

    public void validerldemande(View view) {
        Intent intent = new Intent(this, ValiderDemandProf.class);
        startActivity(intent);
    }

    public void ajouteretudiant(View view) {
        Intent intent = new Intent(this, AjouterEtudiant.class);
        startActivity(intent);
    }

    public void fiche(View view) {
        Intent intent = new Intent(this, FicheApppel.class);
        startActivity(intent);
    }
}
