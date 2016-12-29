/*****************************************************
   	Written by Edwin Betancur for CSCI 221
 ***************************************************
	This GUI application displays a haunted house,
	allows the user to choose between night 
	and day in a drop down menu and turns on 
	the lights in the house by clicking on
	the windows. 
 ****************************************************/

import javax.swing.*;
import java.awt.BorderLayout;

public class Controller 
{
	private JFrame frame;
	private MyPanel panel;
	public Controller()
	{
		frame = new JFrame("Haunted House by Edwin Betancur");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new MyPanel();
		this.initMenu();
		frame.add(panel, BorderLayout.CENTER);
		frame.pack();
		frame.setVisible(true);
	}
	
	public void initMenu()
	{
		JMenuBar allMenus = new JMenuBar();
		frame.setJMenuBar(allMenus);
		JMenu nightDayMenu = new JMenu("Choose Night or Day");
		allMenus.add(nightDayMenu);
		
		JMenuItem day = new JMenuItem("Day");
		day.addActionListener(panel);
		nightDayMenu.add(day);
		
		JMenuItem night = new JMenuItem("Night");
		night.addActionListener(panel);
		nightDayMenu.add(night);
	}
	
	public static void main(String args[])
	{
		new Controller();
	}
}
