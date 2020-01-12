package com.eajy.materialdesigndemo.activity;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.EditText;

import com.eajy.materialdesigndemo.R;

public class LoginPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide(); // hide the title bar
        setContentView(R.layout.activity_login_page);
    }

    public void gohome(View view) {
           //TextInputEditText t = (TextInputEditText) findViewById(R.id.password);
           /* Intent add_abs = new Intent(this, Home.class);
            startActivity(add_abs);*/
            Intent add_abs = new Intent(this, HomeProf.class);
            startActivity(add_abs);


    }
}
