# android-lightbox, a lightbox effect for Android dialogs

Web Site: [Public Static Droid Main](http://publicstaticdroidmain.com/)

This is a simple library for achieving a [lightbox](http://lokeshdhakar.com/projects/lightbox2/) style overlay effect with Android progress dialogs. 

## Using this library
First, add the lightbox_dialog.xml file to your res/layout folder. Then add the styles.xml and colors.xml in your res/values folder.  

Then, just define these methods in your base Activity:
	private Dialog busyDialog;
	
	public void showBusyDialog(String message) {
		busyDialog = new Dialog(this, R.style.lightbox_dialog);
		busyDialog.setContentView(R.layout.lightbox_dialog);
		((TextView)busyDialog.findViewById(R.id.dialogText)).setText(message);
		
		busyDialog.show();
	}
	
	public void dismissBusyDialog() {
		if (busyDialog != null)
			busyDialog.dismiss();
		
		busyDialog = null;
	}  
## License
	Copyright (C) 2012 Justin Schultz
	android-lightbox, a lightbox effect for Android dialogs

	http://justinschultz.com/
	http://publicstaticdroidmain.com/

	Licensed under the Apache License, Version 2.0 (the "License");
	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at

	http://www.apache.org/licenses/LICENSE-2.0

	Unless required by applicable law or agreed to in writing, software
	distributed under the License is distributed on an "AS IS" BASIS,
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	See the License for the specific language governing permissions and
	limitations under the License.  

