abstract class Shape {
    public abstract double getPerimeter();

    public abstract double getArea();
}

class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        if (width > 0 && height > 0) {
            this.width = width;
            this.height = height;
        } else {
            System.out.println("Hay nhap so nguyen duong.");
        }
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public double getArea() {
        return width * height;
    }
}

class Circle extends Shape {
    private int radius;

    public Circle(int radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            throw new IllegalArgumentException("Radius phai la so nguyen duong.");
        }
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 10);
        Shape circle = new Circle(7);
        System.out.println("Hinh chu nhat: Chu vi: " + rectangle.getPerimeter() + ", Dien tich: " + rectangle.getArea());
        System.out.println("Hinh tron: Chu vi: " + circle.getPerimeter() + ", Diện tích: " + circle.getArea());
    }
}

