import java.lang.Math;
public class Point {
     private double x;
     private double y;
     //alternative way to do this is private double x,y
     //POINTS!!!
     public Point(double X, double Y) {
          x = X;
          y = Y;
     }
     public Point(Point p) {
          x = p.x;
          y = p.y;
     }
     //accessors!!!
     public double getX(){
          return x;
     }
     public double getY(){
          return y;
     }
     public String toString() {
          return "(" + x + " ," + y + ")";
     }
     //distance (STATIC) & distanceTo (NONSTATIC)
     public static double distance(Point p1, Point p2) {
          double xa = Math.pow((p2.getX() - p1.getX()), 2);
          double ya = Math.pow((p2.getY() - p1.getY()), 2);
          return Math.sqrt(xa + ya);
     }
     public double distanceTo(Point p2) {
          double xb = (p2.getX() - x) * (p2.getX() - x);
          double yb = (p2.getY() - y) * (p2.getY() - y);
          return Math.sqrt(xb + yb);
     }
}
