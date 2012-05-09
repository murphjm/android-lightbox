package com.justinschultz.android;

import android.app.Activity;
import android.app.Dialog;
import android.widget.TextView;

public class BaseActivity extends Activity {
	
	private Dialog busyDialog;
	
	public void showBusyDialog(String message) {
		busyDialog = new Dialog(this, R.style.lightbox_dialog);
		busyDialog.setContentView(R.layout.lightbox_dialog);
		((TextView)busyDialog.findViewById(R.id.dialogText)).setText(message);
		
		busyDialog.show();
	}
	
	public void dismissBusyDialog() {
		if (busyDialog != null)
		{
			try {
				busyDialog.dismiss();
			}
			catch(IllegalArgumentException err) { }
		}
		
		busyDialog = null;
	}
}
