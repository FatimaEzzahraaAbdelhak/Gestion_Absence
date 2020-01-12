package com.eajy.materialdesigndemo.activity;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.eajy.materialdesigndemo.R;

public class ValiderDemandProf extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_valider_demand_prof);
    }

    public void alert(View view) {
        new AlertDialog.Builder(this)
                .setTitle(getString(R.string.main_dialog_simple_title))
                .setMessage("choisisser votre choix :")
                .setPositiveButton("accépter", null)
                .setNegativeButton("refuser", null)
                .show();
    }
}
