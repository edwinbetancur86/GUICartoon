import java.awt.*;
import java.awt.geom.*;

public class Cat 
{
	private int xPos, yPos;
	private Ellipse2D catBody, catHead, catEye;
	private Path2D catEar1, catEar2;
	private Line2D catLeg1, catLeg2, catLeg3,
	catLeg4, catTail;
	
	public Cat(int x, int y)
	{
		xPos = x;
		yPos = y;
	}
	
	public void draw(Graphics2D g2)
	{
		catBody = new Ellipse2D.Float(xPos, yPos, 50, 30);
		catHead = new Ellipse2D.Float(414, 393, 30, 30);
		
		catEar1 = new Path2D.Float();
		catEar1.moveTo(420, 395);
		catEar1.lineTo(421, 388);
		catEar1.lineTo(425, 393);
		catEar1.closePath();
		
		catEar2 = new Path2D.Float();
		catEar2.moveTo(431, 394);
		catEar2.lineTo(434, 388);
		catEar2.lineTo(439, 396);
		catEar2.closePath();
		
		catEye = new Ellipse2D.Float(423, 400, 4, 4);
		
		catLeg1 = new Line2D.Float(441, 431, 432, 444);
		catLeg2 = new Line2D.Float(444, 433, 440, 447);
		catLeg3 = new Line2D.Float(465, 432, 472, 447);
		catLeg4 = new Line2D.Float(474, 429, 484, 443);
		
		catTail = new Line2D.Float(478, 416, 500, 398);
		
		g2.setPaint(Color.BLACK);	
		g2.fill(catBody);	
		g2.fill(catHead);
		g2.fill(catEar1);
		g2.fill(catEar2);
		g2.setPaint(Color.WHITE);
		g2.fill(catEye);
		g2.setPaint(Color.BLACK);
		g2.draw(catLeg1);
		g2.draw(catLeg2);
		g2.draw(catLeg3);
		g2.draw(catLeg4);
		g2.draw(catTail);
		
	}
}
