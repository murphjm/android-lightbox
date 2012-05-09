package com.justinschultz.android;

import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends BaseActivity {
	Handler handler = new Handler();
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    
    @Override
    public void onResume() {
    	super.onResume();
    	showBusyDialog("Lightbox dialog...");
    	
    	handler.postDelayed(new Runnable() {
			public void run() {
				dismissBusyDialog();
			}
    	}, 4000);
    }
}