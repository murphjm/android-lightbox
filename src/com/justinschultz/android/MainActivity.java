package com.justinschultz.android;

/*	
 *  Copyright (C) 2012 Justin Schultz
 *  android-lightbox, a lightbox effect for Android dialogs
 *  
 *  http://justinschultz.com/
 *  http://publicstaticdroidmain.com/
 * 
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *  
 *  	http://www.apache.org/licenses/LICENSE-2.0
 *  
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License. 
 */

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