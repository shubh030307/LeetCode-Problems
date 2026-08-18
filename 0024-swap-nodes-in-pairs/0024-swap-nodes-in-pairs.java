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
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
dummy.next = head;

if (head == null || head.next == null)
    return head;

ListNode prev = dummy;
ListNode i = head;
ListNode j = head.next;

while (i != null && j != null) {
    prev.next = j;
    i.next = j.next;
    j.next = i;

    prev = i;
    i = i.next;

    if (i != null)
        j = i.next;
}

return dummy.next;
    }
}