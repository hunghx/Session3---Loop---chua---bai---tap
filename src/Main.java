import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // vẽ mặt phẳng oxy
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(i+j>=4 && i>=j) {
                    System.out.print(" * ");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }


        // vẽ bth
        System.out.println("       *      ");
        System.out.println("    *  *  *   ");
        System.out.println(" *  *  *  *  *");

        // công thức giữa h và d
        // y = 2x - 1
        // phương trình đường chéo chính : i >= j
        // phương trình đường chéo phụ : i + j >= 4
        // yêu cầu nhập chiều cao
        System.out.println("Nhập vào chiều cao hình tam cân cần vẽ");
        int ch = new Scanner(System.in).nextInt();
        int day = 2*ch-1;
        // vẽ hình chữ nhật

        // pt i+j = h-1
        // pt j-i = h-1
        for (int i = 0; i < ch; i++) {
            for (int j = 0; j < day; j++) {
                if(i+j>=ch-1 && j-i<=ch-1) {
                    System.out.print(" * ");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

    }
}