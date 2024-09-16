class Circle {
    int radius;

    public Circle(int radius) {
        if (Common.check(radius)) {
            this.radius = radius;
        } else {
            System.out.println("Radius phai la so nguyen duong.");
        }
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
            this.radius = radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}


public class Bai3 {
    public static void main(String[] args) {
        Circle circle = new Circle(30);
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Chu vi : " + circle.getPerimeter());
        System.out.println("Dien tich: " + circle.getArea());
    }
}
