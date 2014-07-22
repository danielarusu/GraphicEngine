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
	
	public void paintComponent(Graphics g){
		
		super.paintComponent(g);
		
		for(int i = 0; i < 10; i++){
			shapes[i].draw(g);
		}
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
		
		shapes = new PaintObject[10];
		
		for(int i = 0; i < 10; i++){
			if(i%2 == 0){
				shapes[i] = new Point(10 + i, 20 + i);
			}
			else{
				shapes[i] = new Line(50,60,100,100);
			}
		}
		
		Point point1 = new Point(10,20);
		Point point2 = new Point(20,30);
		
		Line line = new Line(point1.x, point1.y, point2.x, point2.y);
		
		System.out.println("(x1, y1) is " + point1.printPoint() + "and (x2, y2) is " + point2.printPoint());
		System.out.println("The distance between the two points is: " + line.distance());
	}
}
