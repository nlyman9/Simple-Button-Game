/**
Author: Nathan Lyman
Date: 12/21/17
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleGame implements ActionListener, MouseMotionListener, MouseListener
{
	JFrame window;
	Container content;
	int mouseX, mouseY;
	int rcount = 0;
	int gcount = 0;
	JLabel coords;
	Button rButton;
	Button gButton;
	Button bButton;
	Button yButton;
	
	public SimpleGame()
	{
		JFrame window = new JFrame("Simple_Game");
		content = window.getContentPane();
		content.setLayout(new BoxLayout(content, 1));
		coords = new JLabel();
		coords.setFont(new Font("TimesRoman", Font.ITALIC + Font.BOLD, 32));
		content.add(coords);
		window.setSize(1000,800);
		//Intialiaze and implement RED button
		rButton = new Button("RED");
		rButton.addActionListener(this);
		rButton.setSize(100, 100);
		rButton.setLocation(700, 100);
		rButton.setFont(new Font("Arial", Font.BOLD, 16));
		content.add(rButton);
		//Intialize and implement GREEN button
		gButton = new Button("GREEN");
		gButton.addActionListener(this);
		gButton.setSize(100, 100);
		gButton.setLocation(100, 150);
		gButton.setFont(new Font("Arial", Font.BOLD, 16));
		content.add(gButton);
		
		//make window visible
		window.setVisible(true);
		window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	//when you press & release with NO MOVEMENT while pressed
	public void mouseClicked( MouseEvent me)
	{
		mouseX = me.getX();
		mouseY = me.getY();
		
		
	}
	//when you press
	public void actionPerformed(ActionEvent e)
	{
		Object change = e.getSource();
		if (change == rButton)
		{
			//If RED button is already red then turn to white; if white turn to red
			if (rcount % 2 == 0)
			{
				rButton.setBackground(Color.RED);
				rcount++;
			}
			else
			{
				rButton.setBackground(Color.WHITE);
				rcount++;
			}
				
		}
		else if (change == gButton)
		{
			//If GREEN button is already green then turn to white; if white turn to green
			if (gcount % 2 == 0)
			{
				gButton.setBackground(Color.GREEN);
				gcount++;
			}
			else
			{
				gButton.setBackground(Color.WHITE);
				gcount++;
			}
		}
	}
	public void mousePressed( MouseEvent me)
	{
		mouseX = me.getX();
		mouseY = me.getY();
	}
	//when you let release after dragging
	public void mouseReleased( MouseEvent me)
	{
		mouseX = me.getX();
		mouseY = me.getY();
		
		//repaint();
	}
	// the mouse just moved off of the JFrame
	public void mouseExited( MouseEvent me)
	{
		mouseX = me.getX();
		mouseY = me.getY();
	}
	// the mouse just moved onto the JFrame
	public void mouseEntered( MouseEvent me)
	{
		mouseX = me.getX();
		mouseY = me.getY();
	}
	// mouse is moving while pressed
	public void mouseDragged( MouseEvent me)
	{
		mouseX = me.getX();
		mouseY = me.getY();

	}
	// moved mouse but not pressed
	public void mouseMoved( MouseEvent me)
	{
		mouseX = me.getX();
		mouseY = me.getY();
		
		//repaint();
	}

	public static void main(String [] args)
	{
		new SimpleGame();
	}
	private void reportEventCoords( String msg )
	{
		coords.setText( msg ); 
	}
}