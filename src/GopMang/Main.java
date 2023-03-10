package GopMang;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6,7};
        int[] newArr = new int[7];
        int n = 0;
        for (int element : arr1) {
            newArr[n]= element;
            n++;
        }
        for (int element : arr2) {
            newArr[n]= element;
            n++;
        }
        System.out.println(Arrays.toString(newArr));
    }
}
