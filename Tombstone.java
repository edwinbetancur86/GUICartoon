import java.awt.*;
import java.awt.geom.*;

public class Tombstone 
{
	private int topLeftX, topLeftY;
	private Font fnt;
	private Path2D tombStone;
	private final String lineEngraving1, 
	lineEngraving2, lineEngraving3;
	
	public Tombstone(int x, int y, String line1, 
						String line2, String line3)
	{
		topLeftX = x;
		topLeftY = y;
		lineEngraving1 = line1;
		lineEngraving2 = line2;
		lineEngraving3 = line3;
	}
	
	public void draw(Graphics2D g2)
	{
		tombStone = new Path2D.Float();
		tombStone.moveTo(topLeftX, topLeftY);
		tombStone.lineTo(topLeftX + 20, topLeftY);
		tombStone.lineTo(topLeftX + 30, topLeftY + 10);
		tombStone.lineTo(topLeftX + 30, topLeftY + 40);
		tombStone.lineTo(topLeftX - 10,  topLeftY + 40); 
		tombStone.lineTo(topLeftX - 10, topLeftY + 10); 
		tombStone.lineTo(topLeftX, topLeftY);
		tombStone.closePath();
		
		fnt = new Font("X-Files", Font.PLAIN, 8); 
		
		g2.setPaint(new Color(128,128,128));
		g2.fill(tombStone);
		
		g2.setPaint(Color.BLACK);
		g2.setFont(fnt);
		g2.drawString(lineEngraving1, topLeftX, topLeftY + 10);
		g2.drawString(lineEngraving2, topLeftX, topLeftY + 20);
		g2.drawString(lineEngraving3, topLeftX, topLeftY + 30);
	}
}
