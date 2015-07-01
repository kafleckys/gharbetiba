package com.example.prakash.gharpeti;
//this java file is for 1 sec displaY of online rental solution
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by prakash on 2/24/2015.
 */
public class Splash extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        Thread timer = new Thread(){
            public void run(){
                try{
                    sleep(1000);

                }catch (InterruptedException e){
                    e.printStackTrace();
                }finally {
                    Intent openmainactivity = new Intent("com.example.prakash.gharpeti.MAINACTIVITY");
                    startActivity(openmainactivity);
                }

            }
        };
        timer.start();
    }

    @Override
    protected void onPause() {
        /// TODO Auto-generated method stub
        super.onPause();
        finish();
    }

}
