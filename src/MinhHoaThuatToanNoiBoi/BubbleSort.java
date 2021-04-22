package MinhHoaThuatToanNoiBoi;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhap phan tu thu " + i + "");
            array[i] = scanner.nextInt();
        }
        System.out.println("Mang da nhap");
        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + "\t");
        }
        System.out.println("\nBegin sort processing...");
        BubbleSort(array);
    }

    public static void BubbleSort(int[] array) {
        boolean Nextpast = true;
        for (int k = 1; k < array.length && Nextpast; k++) {
            Nextpast = false;
            for (int i = 0; i < array.length - k; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    Nextpast = true;
                }
            }
            if (Nextpast==false) {
                System.out.println("Array may be sorted and next pass not needed");
                break;
            }
            System.out.print("List after the  " + k + "' sort: ");
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[j] + "\t");
            }
            System.out.println();
        }
    }
}
