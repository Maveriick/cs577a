package com.advanchip.mobile_controlledlighting;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		getActionBar().hide();
		
		
		/*
		 * TODO
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			Log.i("MainActivity.class", "Unable to stop thread");
		}
		*/
		
		
		boolean isInternetAvailable = haveInternet();
		if (isInternetAvailable) {
			Intent loginIntent = new Intent(this, LoginActivity.class);
			startActivity(loginIntent);
		} else {
			Toast.makeText(getApplicationContext(), "Please enable Internet connection to use this application",
					   Toast.LENGTH_SHORT).show();
		}
		
		
		
	}
	
	/*
	* @return boolean return true if the application can access the internet
	*/
	private boolean haveInternet(){
	        NetworkInfo info = ((ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE)).getActiveNetworkInfo();
	        if (info==null || !info.isConnected()) {
	                return false;
	        }
	        if (info.isRoaming()) {
	                // here is the roaming option you can change it if you want to disable internet while roaming, just return false
	                return true;
	        }
	        return true;
	}
}
