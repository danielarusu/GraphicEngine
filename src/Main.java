import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

import javax.swing.JPanel;

public class Main extends JPanel {
	/*
	 * Main class
	 * Draws things on a window
	 */	
	static PaintObject[] shapes;
	
	public Main(){
		super();
	}
	
	
	static void paintShapes(){
		for(int i = 0; i < 10; i++){
			shapes[i].draw();
		}
	}
	
	public void paintComponent(Graphics g){
		
		super.paintComponent(g);
		
		//Point point = new Point(10,20);
		//point.setPoint(point);
		//g.setColor(Color.RED);
		//g.drawLine(point.x, point.y, point.x, point.y);
	}

	public static void main(String[] args){
		
		JFrame frame = new JFrame("2D Graphics");
		
		frame.setSize(600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Main panel = new Main();
		
		frame.setContentPane(panel);
		frame.setVisible(true);
		
		Point point = new Point(10,20);
		
		System.out.println(point.printPoint());
	}
}
