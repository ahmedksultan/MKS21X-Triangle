public class Point {
     private double x;
     private double y;
     //alternative way to do this is private double x,y
     //POINTS!!!
     public Point(double X, double Y) {
          x = X;
          y = y;
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
}
