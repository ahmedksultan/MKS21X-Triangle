public class Driver {
  public static void main(String[]args){
     System.out.println("TEST 1 START\n")
     //point creation
     Point P1 = new Point(1,1);
     Point P2 = new Point(2,2);
     Point P3 = new Point(3,3);
     //making sure points work
     System.out.println("--- POINTS ACTIVE ---");
     System.out.println("P1 =" + P1);
     System.out.println("P2 =" + P2);
     System.out.println("P3 =" + P3);
     System.out.println("--- POINTS ACTIVE ---");
     //distance formulas
     System.out.println("\n--- DISTANCE CALCULATIONS ---");
     System.out.println("distance btwn P1 & P2 = " + Point.distance(P1,P2));
     System.out.println("distance btwn P1 & P2 = " + P1.distanceTo(P2));
     System.out.println("distance btwn P1 & P3 = " + Point.distance(P1, P3));
     System.out.println("distance btwn P1 & P3 = " + P1.distanceTo(P3));
     System.out.println("--- DISTANCE CALCULATIONS ---");

     //triangles!
     System.out.println("\n--- TRIANGLES ---");
     Triangle T1 = new Triangle(P1, P2, P3);
     System.out.println(T1);
     System.out.println("perimeter of T1 = " + T1.perimeter());
     System.out.println("vertex 0 = " + T1.getVertex(0));
     System.out.println("vertex 1 = " + T1.getVertex(1));
     System.out.println("vertex 2 = " + T1.getVertex(4));
     System.out.println("--- TRIANGLES ---");
     }
}
