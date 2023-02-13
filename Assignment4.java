class Rectangle {
    double length, width, area;
    String colour;

    public Rectangle(double length, double width, String colour) {
        this.length = length;
        this.width = width;
        this.colour = colour;
        this.area = length * width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public String getColour() {
        return colour;
    }

    public double findArea() {
        return area;
    }
}

public class Assignment4 {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(5, 10, "Red");
        Rectangle rect2 = new Rectangle(5, 10, "Red");

        if (rect1.findArea() == rect2.findArea() && rect1.getColour().equals(rect2.getColour())) {
            System.out.println("Matching Rectangles");
        } else {
            System.out.println("Non-matching Rectangles");
        }
    }
}
