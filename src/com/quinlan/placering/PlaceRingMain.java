package com.quinlan.placering;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

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
    
    public void sendMessage(View view){
    	Intent intent = new Intent(this, AddLocationActivity.class);

    	EditText editText = (EditText)this.findViewById(R.id.places_edit_text);
    	String message = editText.getText().toString();

    	intent.putExtra("some extra string", message);
    	this.startActivity(intent);
    }
    
}
