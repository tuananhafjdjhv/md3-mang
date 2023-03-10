package Tinh_tong_1_cot_trong_mang_2_chieu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Nhập số cột cần tính: ");
        int colum = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][colum];
        }
        System.out.println("tổng của cột "+colum+" là "+sum);
    }
}
