package com.example.prakash.gharpeti;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
 import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;


public class MainActivity extends ActionBarActivity {
    // Constant for defining latitude and longitude
    //EditText addressEditText, finalAddressEditText;
   // static final LatLng DerekPos = new LatLng(40, -70); //FOR MAP POSTION
    // GoogleMap class
   // private GoogleMap googleMap;
    // LatLng addressPos, finalAddressPos;
   // Marker addressMarker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        //Initialize my EditTexts
//        addressEditText = (EditText) findViewById(R.id.addressEditText);
//        finalAddressEditText = (EditText) findViewById(R.id.finalAddressEditText);
//        // verify we can interact with the Google Map

      //  HeadlinesFragment firstFragment = new HeadlinesFragment();
       // googleMap = ((MapFragment) getFragmentManager().
        //        findFragmentById(R.id.map)).getMap();

        // Show a satellite map with roads
            /* MAP_TYPE_NORMAL: Basic map with roads.
            MAP_TYPE_SATELLITE: Satellite view with roads.
            MAP_TYPE_TERRAIN: Terrain view without roads.
            */
//            googleMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
//
//            // Place dot on current location
//            googleMap.setMyLocationEnabled(true);
//
//            // Turns traffic layer on
//            googleMap.setTrafficEnabled(true);
//
//            // Enables indoor maps
//            googleMap.setIndoorEnabled(true);
//
//            // Turns on 3D buildings
//            googleMap.setBuildingsEnabled(true);
//
//            // Show Zoom buttons
//            googleMap.getUiSettings().setZoomControlsEnabled(true);
//
//            // Create a marker in the map at a given position with a title
//            Marker marker = googleMap.addMarker(new MarkerOptions().
//                    position(DerekPos).title("Hello"));
//


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
           if (id == R.id.action_settings) {

               return true;
        } else if (id == R.id.LI) {
        //    Intent intent = new Intent("com.example.prakash.gharpeti.ALOGIN");
            Intent intent = new Intent(this, Alogin1.class);
            startActivity(intent);
            return true;
        }
        else if (id == R.id.action_search) {
              Intent intent1 = new Intent(this, SearchByUserFrom.class);
               startActivity(intent1);

               return true;
          }

        return super.onOptionsItemSelected(item);


    }
}