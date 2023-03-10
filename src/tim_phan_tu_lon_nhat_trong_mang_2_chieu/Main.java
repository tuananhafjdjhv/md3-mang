package tim_phan_tu_lon_nhat_trong_mang_2_chieu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao so phan tu mang 1: ");
        int x = sc.nextInt();
        System.out.println("nhap vao so phan tu mang 2: ");
        int y = sc.nextInt();
        int[][] arr = new int[x][y];
        System.out.println("nhap cac phan tu mang 1: ");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.println("arr["+i+"]["+j +"]=");
                arr[i][j]= sc.nextInt();
            }
        }
        int max = arr[0][0];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("phan tu max la: "+ max);
    }
}
