package com.example.prakash.gharpeti;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

/**
 * Created by prakash on 6/25/2015.
 */
public class CreateNewAccountForm extends ActionBarActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.createnewaccountform);

    }
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //yesko kam vaneko  action bar ma ra menu ma items laune  ho
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    public void CreateAccount(View v) {

        switch (v.getId()) {

            case R.id.createnewaccountsignup:
                Toast.makeText(CreateNewAccountForm.this, "click me again i m signup button.",
                        Toast.LENGTH_SHORT).show();
                break;

            case R.id.createaccountaddpost:
                Intent addpostform = new Intent(this, AddPostForm.class);
                startActivity(addpostform);


                break;



        }
    }

}
