//A Point object represents a pair of (x, y) coordinates
//Fourth version: encapsulated
	public class Point{
		private int x; 
		private int y;
		
		//constructs a new Point
		public Point(){
			this(0, 0);// calls Pint(int, int) constructor 
		}
		//constructs a new Point with the given (x, y) location
		public Point(int x, int y){
			setLocation(x, y);// calls setLocation method
		}
		//returns a distance between this point and (0, 0)
		public double distanceFromOrigin(){
			return Math.sqrt(x * x + y * y);
		}
		//return the x-coordinate of this point
		public int getX(){
			return x;
		}
		//return the y-coordinate of this point
		public int getY(){
			return y;
		}
		//sets this point's (x, y) location to the given values 
		public void setLocation(int x, int y){
			this.x = x;
			this.y = y;
		}
	//returns a String representation of this point
		public String toString(){
			return "(" + x + ", " + y + ")";
		}
	
	//shifts this point's object by given amount
		public void translate(int dx, int dy){
			x += dx;
			y += dy;
		}
		
	}