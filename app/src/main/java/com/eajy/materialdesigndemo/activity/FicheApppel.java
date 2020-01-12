package com.eajy.materialdesigndemo.activity;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.eajy.materialdesigndemo.R;

public class FicheApppel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fiche_apppel);



    }

    public void ficheapp(View view) {
        String[] singleChoiceItems = getResources().getStringArray(R.array.fiche);
        int itemSelected = 0;
        new AlertDialog.Builder(this)
                .setTitle(getString(R.string.main_dialog_single_choice))
                .setSingleChoiceItems(singleChoiceItems, itemSelected, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                })
                .setPositiveButton("OK", null)
                .show();
    }
}
