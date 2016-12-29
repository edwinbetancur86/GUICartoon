import java.awt.*;
import java.awt.geom.*;

public class Spider 
{
	private int xPos, yPos;
	private Line2D webStrand1, webStrand2, webStrand3, 
	webStrand4, webStrand5, webStrand6, spiderHangStrand, 
	spiderLegLeft1, spiderLegLeft2, spiderLegLeft3,
	spiderLegRight1, spiderLegRight2, spiderLegRight3;
	
	
	private Path2D webOutline;
	
	private Ellipse2D spiderBody;
	
	
	public Spider(int x, int y)
	{
		xPos = x;
		yPos = y;
		 
	}
	
	public void draw(Graphics2D g2)
	{
		webOutline = new Path2D.Float();
		webOutline.moveTo(xPos, yPos);
		webOutline.lineTo(410, 145);
		webOutline.lineTo(413, 153);
		webOutline.lineTo(403, 164);
		webOutline.lineTo(391, 171);
		webOutline.lineTo(380, 170);
		webOutline.lineTo(381, 144);
		webOutline.closePath();
		
		webStrand1 = new Line2D.Float(381, 158, 395, 168);
		webStrand2 = new Line2D.Float(381, 144, 402, 164);
		webStrand3 = new Line2D.Float(397, 145, 410, 155);
		webStrand4 = new Line2D.Float(393, 144, 380, 152);
		webStrand5 = new Line2D.Float(388, 170, 402, 145);
		webStrand6 = new Line2D.Float(381, 163, 402, 163);
		
		spiderHangStrand = new Line2D.Float(401, 165, 401, 185);
		
		spiderBody = new Ellipse2D.Float(397, 185, 8, 8);
		spiderLegLeft1 = new Line2D.Float(398, 187, 393, 186);
		spiderLegLeft2 = new Line2D.Float(397, 189, 391, 189);
		spiderLegLeft3 = new Line2D.Float(398, 191, 393, 193);
		spiderLegRight1 = new Line2D.Float(403, 187, 408, 185);
		spiderLegRight2 = new Line2D.Float(404, 189, 409, 188);
		spiderLegRight3 = new Line2D.Float(404, 190, 409, 194);
		
		g2.setPaint(Color.WHITE);
		g2.fill(webOutline);
		g2.setPaint(new Color(70,130,180));
		g2.draw(webStrand1);
		g2.draw(webStrand2);
		g2.draw(webStrand3);
		g2.draw(webStrand4);
		g2.draw(webStrand5);
		g2.draw(webStrand6);
		g2.draw(spiderHangStrand);
		g2.setPaint(Color.BLACK);
		g2.fill(spiderBody);
		g2.draw(spiderLegLeft1);
		g2.draw(spiderLegLeft2);
		g2.draw(spiderLegLeft3);
		g2.draw(spiderLegRight1);
		g2.draw(spiderLegRight2);
		g2.draw(spiderLegRight3);
		
		
	}
}
