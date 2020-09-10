package leetcode.challenge.easy;

import leetcode.challenge.Challenge;

public class MergeSort extends Challenge {
    @Override
    public void test() {
        int[] arr = new int[] {400, 2,1,4,3,7, 12,9,8,100,300,5};
        arr = mergeSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
    }
    
    public int[] mergeSort(int[] arr) {
        if (arr.length <= 1) {
            return arr;
        }
        int m = arr.length  / 2;
        int l = m;
        int r = arr.length - m;
        int[] right = new int[r];
        int[] left = new int[l];
        System.arraycopy(arr, 0, left, 0, l);
        left = mergeSort(left);
        System.arraycopy(arr, l, right, 0, r);
        right = mergeSort(right);            
        int[] temp = new int[arr.length];
        int kl = 0;
        int kr = 0;
        int k = 0;
        while(kl < l && kr < r) {
            if (left[kl] < right[kr]) {
                temp[k++] = left[kl++];
            } else {
                temp[k++] = right[kr++];
            }
        }
        if (kl == l) {
            for (int i = kr; i < right.length; i++) {
                temp[k++] = right[i];
            }
        } else {
            for (int i = kl; i < left.length; i++) {
                temp[k++] = left[i];
            }            
        }
        return temp;
    }        
}
