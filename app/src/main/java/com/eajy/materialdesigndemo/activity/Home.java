package com.eajy.materialdesigndemo.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.eajy.materialdesigndemo.R;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }





    public void mes_absences(View view) {
        Intent intent = new Intent(this, MesAbsences.class);
        startActivity(intent);
    }

    public void mes_demandes(View view) {
        Intent intent = new Intent(this, DemmandAbsences.class);
        startActivity(intent);

    }
}
