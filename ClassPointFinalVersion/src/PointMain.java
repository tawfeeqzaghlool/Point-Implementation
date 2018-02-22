//A program that deals with points.
//Final version; to accompany encapsulated Point class
public class PointMain {

	public static void main(String[] args) {

		//create two Point objects
		Point p1 = new Point(7, 2);
		Point p2 = new Point(4, 3);
		
		//print each point and its distance from the origin
		System.out.println("P1 is " + p1);
		System.out.println("distance from origin = " +
							p1.distanceFromOrigin());
		System.out.println();
		System.out.println("P2 is " + p2);
		System.out.println("distance from origin = " +
							p2.distanceFromOrigin());
		System.out.println();
		
		//translates each point to a new location
		
		p1.translate(11, 6);
		p2.translate(1, 7);
		
		//print the points again
		System.out.println("P1 is " + p1);
		System.out.println("P2 is " + p2);

	}

}
