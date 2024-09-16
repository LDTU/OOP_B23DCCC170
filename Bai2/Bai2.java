class Rectangle {
    int width;
    int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getPerimeter() {
        return 2 * (width + height);
    }

    public int getArea() {
        return width * height;
    }
}

public class Bai2 {
    public static void main(String[] args) {
        try {
            int width = Integer.parseInt(args[0]);
            int height = Integer.parseInt(args[1]);

            if (width > 0 && height > 0) {
                Rectangle rectangle = new Rectangle(width, height);
                System.out.println("Dien tich: " + rectangle.getPerimeter() + ", Chu vi: " + rectangle.getArea());
            } else {
                System.out.println("So nguyen duong khong hop le.");
            }
        } catch (NumberFormatException e) {
            System.out.println("So nguyen duong khong hop le.");
        }
    }
}
