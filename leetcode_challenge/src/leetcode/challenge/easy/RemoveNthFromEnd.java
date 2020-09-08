package leetcode.challenge.easy;

import java.util.ArrayList;
import java.util.List;
import leetcode.challenge.Challenge;


public class RemoveNthFromEnd extends Challenge {

    @Override
    public void test() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        //node2.next = node3; 
        //node3.next = node4;
        //node4.next = node5;
        
        removeNthFromEnd(node1, 2);
        ListNode curr = node1;
        while (curr != null) {
            System.out.println(curr.val);
            curr = curr.next;
        }
    }
    
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            if (n == 1) {
                return  null;
            }
            return head;
        }
        ListNode curr = head;
        List<ListNode> list = new ArrayList<>();
        do {
            list.add(curr);
            curr = curr.next;
        } while (curr != null);
        
        int indexToDelete = 0;
        if (list.size() >= n) {
            indexToDelete = list.size() - n;
            ListNode toDelete = list.get(indexToDelete);
            ListNode before = null;
            ListNode next = toDelete.next;
            if (indexToDelete-1 >= 0) {
                before = list.get(indexToDelete-1);
                before.next = next;
            } else {
                head = next;
            }     
        }
        return head;
    }
}
