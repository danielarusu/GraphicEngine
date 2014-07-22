public class Line extends PaintObject{
	public int x1, y1, x2, y2;
	
	Point[] points = new Point[100];
	
	public Line(int x1, int y1, int x2, int y2){
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	
	public double distance(){
		
		double dist = Math.sqrt((x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1));
		return dist;
	}
	
	public double slope(double m){
		return m;
	}

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("Line");
	}
}
