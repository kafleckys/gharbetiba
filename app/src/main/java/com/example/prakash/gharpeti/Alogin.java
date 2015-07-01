package com.example.prakash.gharpeti;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Toast;

/**
 * Created by prakash on 3/2/2015.
 */
public class Alogin extends ActionBarActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alogin);

    }
    public void PerformLogin(View v) {

        switch (v.getId()) {

            case R.id.login:
            Intent gotologin = new Intent(this, Alogin1.class);
            startActivity(gotologin);
                break;

            case R.id.createnewaccount:
                Intent intent = new Intent(this, CreateNewAccountForm.class);
                startActivity(intent);


                break;



        }
    }
}
