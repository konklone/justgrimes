package com.justgrimes.android;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;

import com.justgrimes.android.R;


public class MainActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		String phone = getResources().getString(R.string.phone_number);
		startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel://" + phone)));
		
//		Toast.makeText(this, phone, Toast.LENGTH_LONG).show();
		
		finish();
	}
	
}
