import java.applet.*;
import java.awt.*;
public class Myapplet extends Applet{
	public void paint(Graphics g){
		
		
		g.drawOval(150,100,200,200);
		g.drawOval(150,200,200,200);
		g.drawOval(20,40,200,40);
		g.drawArc(20,100,40,200,150,200);
	}
}

/*
<applet code="Myapplet.class" width=600 height=600>
</applet>
*/