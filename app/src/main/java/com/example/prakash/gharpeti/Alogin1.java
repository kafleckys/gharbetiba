package com.example.prakash.gharpeti;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;



/**
 * Created by prakash on 3/2/2015.
 */
public class Alogin1 extends ActionBarActivity {

    //TextView clickhere;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alogin1);
//        clickhere = (TextView) findViewById(R.id.resethere);
//        clickhere.setOnClickListener(new view.OnClickListener);
//  implements on onclick listener
//            Intent gotoresethere = new Intent(this , ResetHere.class);
//             startActivity(gotoresethere);

    }
       public void PerformResethere(View v) {

           switch (v.getId()) {
               case R.id.resethere:
                   Intent gotoresethere = new Intent(this , ResetHere.class);
                   startActivity(gotoresethere);
                   break;

               case R.id.submitbuttonforlogin1:
                   Toast.makeText(Alogin1.this, "click me again i m submit button.",
                           Toast.LENGTH_SHORT).show();
                   break;
               case R.id.createnewaccount:
                   Intent gotocreatenewaccountform = new Intent(this , CreateNewAccountForm.class);
                   startActivity(gotocreatenewaccountform);
                   break;
           }





    }
}
