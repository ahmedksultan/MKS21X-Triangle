public class Driver {
  /* more methods can go here*/
  public static void main(String[]args){
     //point creation
     Point P1 = new Point(1,1);
     Point P2 = new Point(2,2);
     Point P3 = new Point(3,3);
     //making sure points work
     System.out.println("--- POINTS ACTIVE ---");
     System.out.println(P1);
     System.out.println(P2);
     System.out.println(P3);
     System.out.println("--- POINTS ACTIVE ---");
     //distance formulas - what's wrong?
     System.out.println(Point.distance(P1,P2));
     System.out.println(P1.distanceTo(P2));
     System.out.println(Point.distance(P1, P3));
     System.out.println(P1.distanceTo(P3));
     System.out.println("\n");
     //triangles!
     Triangle T1 = new Triangle(P1, P2, P3);
     System.out.println(T1);
  }
 }
