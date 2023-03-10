package tim_gia_tri_nho_nhat_trong_mang;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng: ");
        int x = sc.nextInt();
        int [] arr = new int[x];
        for (int i = 0; i < x; i++) {
            System.out.println("Nhập phần tử thứ "+i);
            arr[i]= sc.nextInt();
        }
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("phan tu nho nhat la: "+ min);
    }
}
