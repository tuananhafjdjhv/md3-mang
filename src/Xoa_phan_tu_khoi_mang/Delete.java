package Xoa_phan_tu_khoi_mang;

import java.util.ArrayList;
import java.util.Scanner;


public class Delete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(11);
        arr.add(24);
        arr.add(11);
        arr.add(33);
        System.out.println("nhap phan tu can xoa: ");
        int input = sc.nextInt();
        boolean isRemoved = arr.remove(Integer.valueOf(input));
        if (isRemoved) {
            System.out.println("Xoa thanh cong");
        }
        System.out.print("Cac phan tu con lai: ");
        for (Integer i : arr) {
            System.out.print(i + " ");
        }
    }
}
