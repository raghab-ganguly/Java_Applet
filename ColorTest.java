//Background color in applet set from  java applet program.
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;
public class ColorTest extends Applet {
    public void init() {
        setBackground(Color.RED);
    }
    public void paint(Graphics g) {
        g.drawString("Hi..I am Raghab",50,150);
    }
}