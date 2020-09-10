package leetcode.challenge.easy;

import leetcode.challenge.Challenge;

public class BubleSort extends Challenge {
    @Override
    public void test() {
        int[] arr = new int[] {400, 2,1,4,3,7, 12,9,8,100,300,5};
        arr = sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
    }
    
    public int[] sort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length - 1-i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }    
}
