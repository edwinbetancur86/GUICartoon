import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class MyPanel extends JPanel implements MouseListener, ActionListener
{
	private Color moonColor;
	private Color skyColor;
	private Color moonLiningColor;
	
	private Rectangle2D sky, grass, houseLeft1, triRoofLeft2, 
	windowSidingLeft, windowSidingRight, houseLeft2, houseRight1, 
	houseRight2, houseChimRec, woodenPlank1,
	woodenPlank2, woodenPlank3;
	
	private Path2D triRoofLeft1, triRoofRight3, triRoofRight4,
	frontDoor, windowLeft21, windowLeft22, windowRight3, 
	windowRight4, moon, moonLining, trunk;
	
	private Line2D horizon, branch1, branch2, branch3,
	 branch4, branch5, branch6, branch7, windowLining1,
	 windowLining2, windowLining3, windowLining4, windowLining5,
	 windowLining6, windowLining7,windowLining8, sidingLine,
	 houseOutline1, houseOutline2, houseOutline3, houseOutline4,
	 houseOutline5;
	
	private Spider webAndSpider;
	private Cat cat1;
	private Tombstone tombS, tombS2;

	private int x, y;
	private Font fnt;
	private boolean windowLight21 = false;		// by default it's off	
	private boolean windowLight22 = true;		// by default it's on
	private boolean windowRightLight3 = false;  // by default it's off
	private boolean windowRightLight4 = true; 	// by default it's on
	
	public MyPanel()
	{
		this.setPreferredSize(new Dimension(860, 580));
		this.initPicture();
	}
	
	public void initPicture()
	{	
		sky = new Rectangle2D.Float(0, 0, 859, 324);
		skyColor = new Color(25,25,112);
		horizon = new Line2D.Float(0, 324, 859, 324);
		grass = new Rectangle2D.Float(0, 325, 859, 324);
		houseLeft1 = new Rectangle2D.Float(31, 174, 150, 150);
		
		
		triRoofLeft2 = new Rectangle2D.Float(15, 101, 166, 73);
		houseLeft2 = new Rectangle2D.Float(181, 56, 200, 268);
		triRoofLeft1 = new Path2D.Float();
		triRoofLeft1.moveTo(282, 2);
		triRoofLeft1.lineTo(379, 55);
		triRoofLeft1.lineTo(181, 56);
		triRoofLeft1.closePath();
		
		houseRight1 = new Rectangle2D.Float(381, 144, 148, 180);
		triRoofRight3 = new Path2D.Float();
		triRoofRight3.moveTo(451, 44);
		triRoofRight3.lineTo(528, 144);
		triRoofRight3.lineTo(380, 143);
		
		houseRight2 = new Rectangle2D.Float(529, 134, 133, 190);
		triRoofRight4 = new Path2D.Float();
		triRoofRight4.moveTo(529, 134); 
		triRoofRight4.lineTo(590, 0);
		triRoofRight4.lineTo(661, 134);
		triRoofRight4.closePath();
		
		houseChimRec = new Rectangle2D.Float(535, 30, 25, 104);
		
		frontDoor = new Path2D.Float();
		frontDoor.moveTo(280, 234);
		frontDoor.lineTo(307, 250);
		frontDoor.lineTo(308, 323);
		frontDoor.lineTo(248, 324);
		frontDoor.lineTo(248, 252);
		frontDoor.lineTo(275, 234);
		frontDoor.closePath();
		
		windowLeft21 = new Path2D.Float();
		windowLeft21.moveTo(220, 82);
		windowLeft21.lineTo(242, 111);
		windowLeft21.lineTo(242, 158);
		windowLeft21.lineTo(201, 158);
		windowLeft21.lineTo(201, 111);
		windowLeft21.closePath();
		
		windowLeft22 = new Path2D.Float();
		windowLeft22.moveTo(339, 82);  
		windowLeft22.lineTo(360, 108); 
		windowLeft22.lineTo(360, 158); 
		windowLeft22.lineTo(320, 158); 
		windowLeft22.lineTo(320, 108);  
		windowLeft22.closePath();
		
		windowRight3 = new Path2D.Float();
		windowRight3.moveTo(451, 200);
		windowRight3.lineTo(427, 225);
		windowRight3.lineTo(427, 280);
		windowRight3.lineTo(475, 280);
		windowRight3.lineTo(475, 225);
		windowRight3.closePath();
		
		windowRight4 = new Path2D.Float();
		windowRight4.moveTo(595, 183);
		windowRight4.lineTo(617, 222);
		windowRight4.lineTo(617, 280);
		windowRight4.lineTo(574, 280);
		windowRight4.lineTo(574, 222);
		windowRight4.closePath();
		
		windowLining1 = new Line2D.Float(220, 81, 220, 158);
		windowLining2 = new Line2D.Float(201, 127, 243, 127); 
		windowLining3 = new Line2D.Float(339, 82, 339, 160); 
		windowLining4 = new Line2D.Float(320, 127, 360, 127); 
		windowLining5 = new Line2D.Float(451, 200, 451, 280);
		windowLining6 = new Line2D.Float(426, 249, 475, 249); 
		windowLining7 = new Line2D.Float(595, 183, 595, 280);
		windowLining8 = new Line2D.Float(573, 245, 617, 245); 
		
		windowSidingLeft = new Rectangle2D.Float(407, 226, 20, 54);
		windowSidingRight = new Rectangle2D.Float(475, 226, 21, 54);
		
		sidingLine = new Line2D.Float(406, 249, 495, 249);
		
		woodenPlank1 = new Rectangle.Float(31, 257, 150, 20);
		woodenPlank2 = new Rectangle.Float(70, 277, 20, 47);
		woodenPlank3 = new Rectangle.Float(130, 277, 20, 47);
		
		moon = new Path2D.Float();
		moon.moveTo(93, 10);
		moon.lineTo(92, 35);
		moon.lineTo(108, 77);
		moon.lineTo(119, 82);
		moon.lineTo(94, 88);
		moon.lineTo(77, 83);
		moon.lineTo(71, 64);
		moon.lineTo(70, 32);
		moon.lineTo(85, 16);
		moon.closePath();
		moonColor = Color.WHITE; 
		
		moonLining = new Path2D.Float();
		moonLining.moveTo(93, 10);
		moonLining.lineTo(92, 35);
		moonLining.lineTo(108, 77);
		moonLining.lineTo(119, 82);
		moonLining.lineTo(94, 88);
		moonLining.lineTo(77, 83);
		moonLining.lineTo(71, 64);
		moonLining.lineTo(70, 32);
		moonLining.lineTo(85, 16);
		moonLining.closePath();
		moonLiningColor = Color.BLACK;
		
		trunk = new Path2D.Float();
		trunk.moveTo(758, 254); 
		trunk.lineTo(762, 272); 
		trunk.lineTo(762, 338);  
		trunk.lineTo(768, 344); 
		trunk.lineTo(746, 344);
		trunk.lineTo(751, 338);
		trunk.lineTo(751, 261);
		trunk.closePath();
		
		branch1 = new Line2D.Float(751, 261, 740, 126); 
		branch2 = new Line2D.Float(758, 255, 763, 84);
		branch3 = new Line2D.Float(757, 241, 804, 162);
		branch4 = new Line2D.Float(746, 211, 725, 225);
		branch5 = new Line2D.Float(744, 181, 708, 145);
		branch6 = new Line2D.Float(762, 135, 781, 134);
		branch7 = new Line2D.Float(784, 194, 814, 184);
		
		houseOutline1 = new Line2D.Float(180, 174, 180, 323);
		houseOutline2 = new Line2D.Float(380, 143, 380, 323);
		houseOutline3 = new Line2D.Float(528, 143, 528, 323);
		houseOutline4 = new Line2D.Float(662, 135, 662, 323);
		houseOutline5 = new Line2D.Float(31, 174, 31, 323);
		
		webAndSpider = new Spider(381, 144);
		
		cat1 = new Cat(430, 405); 
		
		tombS = new Tombstone(100, 380, "Here", "Lies", 
								"Wormy");
		tombS2 = new Tombstone(600, 380, "Here", "Lies",
								"Toad");
		
		fnt = new Font("SansSerif", Font.BOLD, 16);
		this.addMouseListener(this);
		x = 0; 
		y = 0;
	}
	
	public void paintComponent(Graphics g)
	{
		Graphics2D gr = (Graphics2D) g;
		String msg;
		
		super.paintComponent(g);
		
		gr.setPaint(skyColor);	
		gr.fill(sky);
		gr.setPaint(Color.BLACK); 			
		gr.draw(horizon);	
		gr.setPaint(new Color(17, 225, 0)); 
		gr.fill(grass);	
		gr.setPaint(new Color(33, 33, 33));
		gr.fill(houseLeft1);	
		gr.setPaint(new Color(178,34,34));
		gr.fill(triRoofLeft2);		
		gr.setPaint(new Color(33, 33, 33));
		gr.fill(houseLeft2);	
		gr.setPaint(new Color(178,34,34));
		gr.fill(triRoofLeft1);	
		gr.setPaint(new Color(33, 33, 33));
		gr.fill(houseRight1);	
		gr.setPaint(new Color(178,34,34));
		gr.fill(triRoofRight3);	
		gr.setPaint(new Color(33, 33, 33));
		gr.fill(houseRight2);	
		gr.setPaint(new Color(178,34,34));
		gr.fill(triRoofRight4);
		gr.fill(houseChimRec);	
		gr.setPaint(new Color(218,165,32));
		gr.fill(frontDoor);	
		gr.fill(windowLeft21);	
		
		if (windowLight21 == true)				
		{
			gr.setPaint(new Color(255,215,0));
			gr.fill(windowLeft21);	
		}
		
		else if (windowLight21 == false)			
		{
			gr.setPaint(new Color(218,165,32));
			gr.fill(windowLeft21);
			
		}
		
		gr.setPaint(new Color(255,215,0));
		gr.fill(windowLeft22);
		
		if (windowLight22 == true)
		{
			gr.setPaint(new Color(255,215,0));
			gr.fill(windowLeft22);	
		}
		
		else if (windowLight22 == false)
		{
			gr.setPaint(new Color(218,165,32));
			gr.fill(windowLeft22);
			
		}
		
		gr.setPaint(new Color(218,165,32));
		gr.fill(windowRight3);
		
		if (windowRightLight3 == true)
		{
			gr.setPaint(new Color(255,215,0));
			gr.fill(windowRight3);	
		}
		
		else if (windowRightLight3 == false)
		{
			gr.setPaint(new Color(218,165,32));
			gr.fill(windowRight3);
			
		}
		
		gr.setPaint(new Color(255,215,0));
		gr.fill(windowRight4);	
		
		if (windowRightLight4 == true)
		{
			gr.setPaint(new Color(255,215,0));
			gr.fill(windowRight4);	
		}
		
		else if (windowRightLight4 == false)
		{
			gr.setPaint(new Color(218,165,32));
			gr.fill(windowRight4);
			
		}
		
		gr.setPaint(Color.BLACK);
		gr.draw(windowLining1);	
		gr.draw(windowLining2);	
		gr.draw(windowLining3);	
		gr.draw(windowLining4);	
		gr.draw(windowLining5);	
		gr.draw(windowLining6);
		gr.draw(windowLining7);	
		gr.draw(windowLining8);
		gr.setPaint(new Color(220,20,60));
		gr.fill(windowSidingLeft);
		gr.fill(windowSidingRight);
		gr.setPaint(Color.BLACK);
		gr.draw(sidingLine);	
		gr.setPaint(new Color(178,34,34));
		gr.fill(woodenPlank1);	
		gr.fill(woodenPlank2);	
		gr.fill(woodenPlank3);	
		gr.setPaint(moonColor);
		gr.fill(moon);	
		gr.setPaint(moonLiningColor);
		gr.draw(moonLining);	
		gr.setPaint(new Color(139,69,19));
		gr.fill(trunk);
		gr.draw(branch1);	
		gr.draw(branch2);	
		gr.draw(branch3);	
		gr.draw(branch4);		
		gr.draw(branch5);	
		gr.draw(branch6);	
		gr.draw(branch7);	
		gr.setPaint(Color.BLACK);
		gr.draw(houseOutline1);			
		gr.draw(houseOutline2);			
		gr.draw(houseOutline3);			
		gr.draw(houseOutline4);		
		gr.draw(houseOutline5);
		
		webAndSpider.draw(gr);
		cat1.draw(gr);
		tombS.draw(gr);
		tombS2.draw(gr);
		
		gr.setPaint(Color.BLACK);
		gr.setFont(fnt);
		
		msg = String.format("x=%d", x);
		gr.drawString(msg, 760, 570);
		msg = String.format("y=%d", y);
		gr.drawString(msg, 810, 570);
		
	}
	
	public void mousePressed(MouseEvent evt)
	{
		x = evt.getX();
		y = evt.getY();
		
		if (x >= 201 && x <= 242 && y >= 82 && y <= 158)
		{
			if (windowLight21 == true)
			{
				windowLight21 = false;
			}
			else
			{
				windowLight21 = true;
			}
			
		}
		else if (x >= 320 && x <= 360 && y >= 82 && y <= 158)
		{
			if (windowLight22 == true)
			{
				windowLight22 = false;
			}
			else
			{
				windowLight22 = true;
			}
		}
		else if (x >= 427 && x <= 475 && y >= 200 && y <= 280)
		{
			if (windowRightLight3 == true)
			{
				windowRightLight3 = false;
			}
			else
			{
				windowRightLight3 = true;
			}
		}
		else if (x >= 574 && x <= 617 && y >= 183 && y <= 280)
		{
			if (windowRightLight4 == true)
			{
				windowRightLight4 = false;
			}
			else
			{
				windowRightLight4 = true;
			}
		}
		
		this.repaint();
	}
	
	public void mouseClicked(MouseEvent evt){}
	
	public void mouseEntered(MouseEvent evt){}
	
	public void mouseExited(MouseEvent evt){}
	
	public void mouseReleased(MouseEvent evt){}
	
	public void actionPerformed(ActionEvent evt)
	{
		String selection = evt.getActionCommand();
		
		if (selection.equals("Day"))
		{
			moonColor = new Color(0,255,255);
			skyColor = new Color(0,255,255);
			moonLiningColor = new Color(0,255,255);
			
		}
		else if (selection.equals("Night")) 
		{
			moonColor = Color.WHITE;
			skyColor = new Color(25,25,112);
			moonLiningColor = Color.BLACK;
		}
		
		this.repaint();
	}
	
}
