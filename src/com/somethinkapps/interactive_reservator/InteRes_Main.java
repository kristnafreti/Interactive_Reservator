package com.somethinkapps.interactive_reservator;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class InteRes_Main extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_interes_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.layout_interes_main, menu);
		return true;
	}

}
