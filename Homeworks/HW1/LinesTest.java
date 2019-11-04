class Point2D {
    private double x;
    private double y;

    Point2D(double xVal, double yVal) {
        x = xVal;
        y = yVal;
    }

    double getX() {
        return x;
    }

    double getY() {
        return y;
    }

    void details() {
        System.out.println("(" + x + "," + y + ")");
    }
}

class Line2D {
    Point2D first;
    Point2D second;

    Line2D(Point2D p1, Point2D p2) {
        first = p1;
        second = p2;
    }

    void details() {
        System.out.println(
                "((" + first.getX() + "," + first.getY() + ") , (" + second.getX() + "," + second.getY() + "))");
    }

    boolean isParallel(Line2D otherLine) {
        double thisGrad = (this.first.getY() - this.second.getY()) / (this.first.getX() - this.first.getY());
        double otherGrad = (otherLine.first.getY() - otherLine.second.getY())
                / (otherLine.first.getX() - otherLine.first.getY());
        return thisGrad == otherGrad;
    }

    double length() {
        double f = Math.pow((this.first.getY() - this.second.getY()), 2);
        double s = Math.pow((this.first.getX() - this.second.getX()), 2);
        return Math.sqrt(f + s);
    }
}

public class LinesTest {
    public static void main(String args[]) {
        Line2D line1, line2;
        line1 = new Line2D(new Point2D(10, 20), new Point2D(5, 15));
        line2 = new Line2D(new Point2D(4, 4), new Point2D(33, 22));
        System.out.println("The length of line1 is : " + line1.length());
        System.out.println("The length of line2 is : " + line2.length());
        if (line1.isParallel(line2)) {
            System.out.println("line1 is parallel to line2");
        } else {
            System.out.println("line1 is not parallel to line2");
        }
    }
}