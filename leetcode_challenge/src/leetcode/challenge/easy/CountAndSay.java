package leetcode.challenge.easy;

import leetcode.challenge.Challenge;


public class CountAndSay extends Challenge {
    @Override
    public void test() {
        System.out.println(countAndSay(2));
        System.out.println(countAndSay(3));
        System.out.println(countAndSay(4));
        System.out.println(countAndSay(30));
    }
    
    public String countAndSay(int n) {
        if (n <= 0) {
            return "";
        }
        if (n == 1) {
            return "1";
        }
        String prev = "1";
        for (int i = 2; i <= n; i++) {
            char curr = prev.charAt(0);
            int sum = 0;
            StringBuilder builder = new StringBuilder();
            for (int j = 0; j < prev.length(); j++) {
                char next = prev.charAt(j);
                if (curr == next) {
                    sum++;
                } else {
                    builder.append(Integer.toString(sum)).append(curr);
                    curr = next;
                    sum = 1;
                }
                if (j == prev.length() - 1) {
                    builder.append(Integer.toString(sum)).append(curr);
                }
            }
            prev = builder.toString();
        }
        return prev;
    }       
}
