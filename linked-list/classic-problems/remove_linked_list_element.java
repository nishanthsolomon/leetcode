/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode() {} ListNode(int val) { this.val = val; } ListNode(int val,
 * ListNode next) { this.val = val; this.next = next; } }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {

        ListNode newHead = new ListNode(-1);
        ListNode returnHead = newHead;

        while (head != null) {
            if (head.val != val) {
                newHead.next = new ListNode(head.val);
                newHead = newHead.next;
            }
            head = head.next;
        }

        return returnHead.next;

    }
}