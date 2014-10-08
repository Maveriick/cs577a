package com.advanchip.mobile_controlledlighting;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;


public class MenuActivity extends Activity {

	private static Button manageUsersButton, manageGatewayButton, favoriteButton, manageSwitchButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        manageUsersButton = (Button)findViewById(R.id.manageUsers);
        manageGatewayButton = (Button)findViewById(R.id.manageGateways);
        favoriteButton = (Button)findViewById(R.id.favorites);
        manageSwitchButton = (Button)findViewById(R.id.manageSwitches);
        
        manageUsersButton.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {

				Intent intent = new Intent(MenuActivity.this, ManageUsersActivity.class);		
				startActivity(intent);
			}
		});
        
        manageGatewayButton.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {

				Intent intent = new Intent(MenuActivity.this, ManageGateway.class);		
				startActivity(intent);
			}
		});
        
        favoriteButton.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {

				Intent intent = new Intent(MenuActivity.this, FavoriteActivity.class);	
				startActivity(intent);
			}
		});
        
        manageSwitchButton.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {

				Intent intent = new Intent(MenuActivity.this, EditSwitchActivity.class);	
				startActivity(intent);
			}
		});
        
        
       
        
        
        
        
   
        
        
    }
    
    private OnClickListener onClickListener = new OnClickListener() {
        @Override
        public void onClick(View v) {
            switch(v.getId()){
                case R.id.button1:
                     //DO something
                break;
                case R.id.button2:
                     //DO something
                break;
                case R.id.button3:
                     //DO something
                break;
            }

      }
   };


    


	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
