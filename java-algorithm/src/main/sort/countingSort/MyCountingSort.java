package main.sort.countingSort;

public class MyCountingSort {
    public static void main(String[] args) {
        int[] array = new int[100]; //array의 크기
        int[] counting = new int[31]; //수의 범위 0~30
        int[] result = new int[100]; //정렬된 배열

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 31); //0~30
        }

        for (int i = 0; i < array.length; i++) {
            counting[array[i]]++;
        }

        for (int i = 1; i < counting.length; i++) {
            counting[i] += counting[i - 1];
        }

        for (int i = array.length -1; i >= 0; i--) {
            int value = array[i];
            counting[value]--;
            result[counting[value]] = value;
        }

        System.out.println("array[]");
        for (int i = 0; i < array.length; i++) {
            if (i % 10 == 0) {
                System.out.println();
            }
            System.out.println(array[i] + "\t");
        }
        System.out.println("\n\n");

        System.out.println("counting[]");
        for (int i = 0; i < counting.length; i++) {
            if(i % 10 == 0) System.out.println();
            System.out.println(counting[i] + "\t");
        }
        System.out.println("\n\n");

        System.out.println("result[]");
        for (int i = 0; i < result.length; i++) {
            if(i % 10 == 0) System.out.println();
            System.out.println(result[i] + "\t");
        }
        System.out.println();

        //간략버전
        int[] arr = new int[101];
        for (int i = 0; i < 50; i++) {
            arr[(int) (Math.random() * 100)]++;
        }
        for (int i = 0; i < arr.length; i++) {
            while (arr[i]-- > 0) {
                System.out.println(i + "");
            }
        }
    }
}
