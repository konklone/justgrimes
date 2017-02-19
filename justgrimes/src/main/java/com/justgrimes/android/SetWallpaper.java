package com.justgrimes.android;

import java.io.IOException;

import android.app.Activity;
import android.app.WallpaperManager;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class SetWallpaper extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		try {
			WallpaperManager.getInstance(this).setResource(R.drawable.wallpaper);
		} catch (IOException e) {
			Log.e("JUSTIN GRIMES", "ERROR LOADING WALLPAPER.", e);
		}
		
		Toast.makeText(this, R.string.wallpaper_message, Toast.LENGTH_SHORT).show();
		
		finish();
	}
	
}