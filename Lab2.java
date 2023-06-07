interface Polygon {
    double getArea();

    int getSides();
}

class Rectangle implements Polygon {
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double getArea() {
        return length * breadth;
    }

    public int getSides() {
        return 4;
    }
}

class Square implements Polygon {
    private double side;

    Square(double side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    public int getSides() {
        return 4;
    }
}

public class Lab2 {
    public static void main(String[] args) {
        // objects of Rectangle and Square
        Rectangle Rec = new Rectangle(6, 5);
        Square Sq = new Square(5);
        double rectangleArea = Rec.getArea();
        int rectangleSides = Rec.getSides();
        double squareArea = Sq.getArea();

        // results
        System.out.println("The area of the rectangle is " + rectangleArea);
        System.out.println("I have " + rectangleSides + " sides.");
        System.out.println("The area of the square is " + squareArea);
        System.out.println("I can get sides of polygon.");
    }
}
