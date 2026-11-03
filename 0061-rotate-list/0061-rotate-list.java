/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null)
            return head;
        ListNode t = head, p = head ;
        int len = 0;
        while (t != null) {
            len++;
            t = t.next;
        }
        t = head;
        ListNode n = t.next;
        k = k % len;
        if(len==1 || k==0){
            return head;
        }
        for (int i = 1; i < len-k; i++) {
            t = t.next;
        }
        p = t.next;
        t.next = null;
        n = p;
        while ( n!= null && n.next != null) {
            n = n.next;
        }
        n.next = head;
        head = p;
        return head;
    }
}