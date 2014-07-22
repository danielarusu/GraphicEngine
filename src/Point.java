import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

import javax.swing.JPanel;


public class Point extends PaintObject {
	/*
	 * Sets the coordinates of a point to be drawn
	 */
	double x;
	double y;
	
	public Point(double x, double y){
		this.x = x;
		this.y = y;
	}

	//sets the location of the point to the same coordinates as the current object
	public void setPoint(Point p){
		this.x = p.x;
		this.y = p.y;
	}
	
	//sets the location of the point to the specified coordinates
	public void setCoordinates(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public String printPoint(){
		return "(" + this.x + "," + this.y + ")";
	}

	@Override
	void draw(Graphics g) {
		// TODO Auto-generated method stub
		//System.out.println("Point");
		g.setColor(Color.RED);
		g.drawLine((int)this.x, (int)this.y, (int)this.x, (int)this.y);
	}
}
