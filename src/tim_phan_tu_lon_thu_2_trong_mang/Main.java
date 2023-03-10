package tim_phan_tu_lon_thu_2_trong_mang;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5}; // ví dụ một mảng
        System.out.println("nhap phan tu can xoa: ");

        int elementToRemove = sc.nextInt(); // phần tử cần xóa

        int index = -1; // khởi tạo biến lưu vị trí của phần tử cần xóa

        // tìm vị trí của phần tử cần xóa trong mảng
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == elementToRemove) {
                index = i;
                break;
            }
        }

        // nếu không tìm thấy phần tử cần xóa trong mảng
        if (index == -1) {
            System.out.println("Không tìm thấy phần tử cần xóa trong mảng");
        } else {
            // xóa phần tử cần xóa bằng cách dịch chuyển các phần tử phía sau về trước
            for (int i = index; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }

            // giảm kích thước của mảng đi 1
            arr = Arrays.copyOf(arr, arr.length - 1);

            // in ra mảng sau khi xóa
            System.out.println("Mảng sau khi xóa: " + Arrays.toString(arr));
        }
    }
}
