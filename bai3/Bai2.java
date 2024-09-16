class Common {
    public static boolean check(int value) {
        return value > 0;
    }
}

class Rectangle {
    int width;
    int height;

    public Rectangle(int width, int height) {
        if (Common.check(width) && Common.check(height)) {
            this.width = width;
            this.height = height;
        } else {
            System.out.println("Vui long nhap so nguyen duong.");
        }
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
