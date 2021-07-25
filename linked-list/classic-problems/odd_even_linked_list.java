/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode() {} ListNode(int val) { this.val = val; } ListNode(int val,
 * ListNode next) { this.val = val; this.next = next; } }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {

        int i = 1;
        ListNode oddElems = new ListNode(-1);
        ListNode evenElems = new ListNode(-1);

        ListNode oddElemsHead = oddElems;
        ListNode evenElemsHead = evenElems;

        while (head != null) {
            if (i % 2 == 0) {
                evenElems.next = new ListNode(head.val);
                evenElems = evenElems.next;
            } else {
                oddElems.next = new ListNode(head.val);
                oddElems = oddElems.next;
            }
            head = head.next;
            ++i;
        }

        oddElems.next = evenElemsHead.next;

        return oddElemsHead.next;

    }
}