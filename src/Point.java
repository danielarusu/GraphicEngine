import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

import javax.swing.JPanel;


public class Point extends PaintObject {
	/*
	 * Sets the coordinates of a point to be drawn
	 */
	int x;
	int y;
	
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	//sets the location of the point to the same coordinates as the current object
	public void setPoint(Point p){
		this.x = p.x;
		this.y = p.y;
	}
	
	//sets the location of the point to the specified coordinates
	public void setCoordinates(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public String printPoint(){
		return "(" + this.x + "," + this.y + ")";
	}
	
	@Override
	void draw(Graphics g) {
		System.out.println("Point");
		g.setColor(Color.red);
		g.drawLine(this.x, this.y, this.x, this.y);
	}

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("Point");
	}
}
