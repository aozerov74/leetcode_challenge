package leetcode.challenge.easy;

import leetcode.challenge.Challenge;

public class DeleteListNode extends Challenge {
    @Override
    public void test() {
        ListNode node1 = new ListNode(0);
        ListNode node2 = new ListNode(-1);
        ListNode node3 = new ListNode(99);
        node1.next = node2;
        node2.next = node3;
        deleteNode(node2);
    }
    
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }
    
    public void deleteNode(ListNode node) {
      node.val = node.next.val;
      node.next = node.next.next;  
    }   
}
