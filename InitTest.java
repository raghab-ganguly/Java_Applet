//Init method is used for reinitialize the window size hence it is already declared in html document.

import java.applet.Applet;
import java.awt.Graphics;
public class InitTest extends Applet {
    public void init() {
        resize(200,200);
    }
    public void paint(Graphics g) {
        g.drawString("Hi..I am Raghab",50,150);
    }
}