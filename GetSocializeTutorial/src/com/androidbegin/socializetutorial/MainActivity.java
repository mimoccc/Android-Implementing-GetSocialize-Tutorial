package com.androidbegin.socializetutorial;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	// Declare variables
	private Button fvbutton; 
	private Button svbutton; 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// Get the view from main.xml
		setContentView(R.layout.main);
		
		// Locate buttons in main.xml
		fvbutton = (Button)findViewById(R.id.firstview);
		svbutton = (Button)findViewById(R.id.secondview);
		
		// Listen for first view button click 
		fvbutton.setOnClickListener(new OnClickListener() {
 
            public void onClick(View arg0) {
            	// Open FirstView.class
                Intent myIntent = new Intent(MainActivity.this, FirstView.class);
                MainActivity.this.startActivity(myIntent);
                // TODO Auto-generated method stub
            }
        });
		
		// Listen for second view button click 
		svbutton.setOnClickListener(new OnClickListener() {
			 
            public void onClick(View arg0) {
            	// Open SecondView.class
                Intent myIntent = new Intent(MainActivity.this, SecondView.class);
                MainActivity.this.startActivity(myIntent);
                // TODO Auto-generated method stub
            }
        });
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
