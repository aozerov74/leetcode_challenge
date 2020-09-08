package leetcode.challenge.easy;

import leetcode.challenge.Challenge;

public class InsertionSort extends Challenge {
    @Override
    public void test() {
        int[] arr = new int[] {2,1,4,3,7, 12,9,8,100,300,5};
        arr = sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
    }
    
    public int[] sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int curPos = i;
            for (int j = i - 1; j >= 0; j--) {
                int prev = arr[j];
                if (curr < prev) {
                    arr[curPos] = prev;
                    arr[j] = curr;
                    curPos = j;
                } else {
                    break;
                }
            }
        }
        return arr;
    }
}
