/*Raghab Ganguly
This is the basic applet program..
Corresponding HTML code is present named as: HelloWorld.html
Note: use Java 8 or bellow versions only[command: appletviewer HelloWorld.html]
=-=-=-=-=-=-=-=-=--=-=-=--=-=-=--=-=-==-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=
*/

import java.applet.Applet;
import java.awt.Graphics;

public class HelloWorld extends Applet {
	public void paint(Graphics g) {
		g.drawString("Hello World",150,150);
	}
}