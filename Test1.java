import java.applet.Applet;
import java.awt.Graphics;
public class Test1 extends Applet {
    public void paint(Graphics g) {
        int x=0;
        int y=0;
        x=Integer.parseInt(getParameter("x"));
        y=Integer.parseInt(getParameter("y"));
        String msg=getParameter("msg");
        g.drawString(msg,x,y);
    }
}