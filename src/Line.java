import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

import javax.swing.JPanel;


public class Line extends PaintObject{
	double x1, y1, x2, y2;
	
	static Point[] points = new Point[100];
	
	public Line(double x1, double y1, double x2, double y2){
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		constructLine();
	}
	
	public double distance(){
		
		return Math.sqrt((x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1));
	}
	
	public double slopeX(){
		
		return (x2 - x1)/distance();
	}
	
	public double slopeY(){
		
		return (y2 - y1)/distance();
	}
	
	public void constructLine(){
		//for(int i = 0; i < distance(); i++){
			//points[i] = new Point(x1 + i*slopeX(), y1 + i*slopeY());
			points = new Point[(int)distance()];
		//}
	}
	
	@Override
	void draw(Graphics g) {
		
		System.out.println("Line");
		g.setColor(Color.BLACK);
		
		for(int i = 0; i < points.length; i++){
			points[i].draw(g);
		}
	}
}
