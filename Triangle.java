public class Triangle {
     private Point PA;
     private Point PB;
     private Point PC;
     public Triangle(Point a, Point b, Point c) {
          PA = a;
          PB = b;
          PC = c;
     }
     public Triangle(double pxa, double pya, double pxb, double pyb, double pxc, double pyc) {
          PA = new Point(pxa, pya);
          PB = new Point(pxb, pyb);
          PC = new Point(pxc, pyc);
     }
     public double perimeter() {
          return PA.distanceTo(PB) + PB.distanceTo(PC) + PC.distanceTo(PA);
     }
     public String toString() {
          return "Triangle: A(" + PA.getX() + ", " + PA.getY() + ")" +
                    " B(" + PB.getX() + ", " + PB.getY() + ")" +
                    " C(" + PC.getX() + ", " + PC.getY() + ")";
     }
     //vertices
     public Point getVertex(int index) {
          if (index == 0) {
               return PA;
          }
          else if (index == 1) {
               return PB;
          }
          else if (index == 2) {
               return PC;
          }
          return null;
     }
     //Alma helped me with this
     public void setVertex(int index, Point newPt) {
          if (index == 0) {
               PA = newPt;
          }
          else if (index == 1) {
               PB = newPt;
          }
          else {
               PC = newPt;
          }
     }
}
