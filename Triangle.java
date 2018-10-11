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
          return "Triangle: \n\tA(" + PA.getX() + ", " + PA.getY() + ")" +
                    "\n\tB(" + PB.getX() + ", " + PB.getY() + ")" +
                    "\n\tC(" + PC.getX() + ", " + PC.getY() + ")";
     }
}
