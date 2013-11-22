package com.quinlan.placering;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

public class PlaceRingMain extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_ring_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.place_ring_main, menu);
        return true;
    }
    
}
