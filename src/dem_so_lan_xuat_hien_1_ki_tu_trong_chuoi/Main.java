package dem_so_lan_xuat_hien_1_ki_tu_trong_chuoi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String str = "Nguyen Minh Quan";
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập kí tự cần tìm: ");
        char lol = sc.nextLine().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == lol){
                count++;
            }
        }
        System.out.println("số kí tự "+ lol+" bạn muốn tìm là "+count);
    }
}
