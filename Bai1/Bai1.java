public class Bai1 {
    public static void main(String[] args) {
        try {
            int width = Integer.parseInt(args[0]);
            int height = Integer.parseInt(args[1]);

            if (width > 0 && height > 0) {
                int chuVi = 2 * (width + height);
                int dienTich = width * height;

                System.out.println("Dien tich: " + dienTich + ", Chu vi: " + chuVi);
            } else {
                System.out.println("So nguyen duong khong hop le.");
            }
        } catch (NumberFormatException e) {
            System.out.println("So nguyen duong khong hop le.");
        }
    }
}
