package lab_work_fourth;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class MyPanel extends JPanel 
{
	public void paint(Graphics g)
	{		
		//draw home
		g.setColor(Color.RED);
		g.drawRect(100, 100, 100, 100);
		
		//draw roof
		g.drawLine(70,100,230,100);
		g.drawLine(70, 100, 150, 50);
		g.drawLine(150,50,230,100);
		
		//draw chimney pipe
		g.drawLine(200, 50, 200, 80);
		g.drawLine(180,50,180,68);
		g.drawLine(180, 50, 200, 50);
		
		//draw glass
		g.setColor(Color.BLACK);
		g.drawRect(138, 140, 25, 25);
		
		//draw string
		g.setColor(Color.MAGENTA);
		g.drawString("Ротанов Дмитрий ВТАСбз-11", 250, 100);
	}
}
