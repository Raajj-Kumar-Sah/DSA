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
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head ;
        ListNode p1 = dummy ;
        ListNode p2 = head ;
        while( p2 != null ){
            if(p2.val == val ){
                p1.next = p2.next ;
                p2 = p2.next ;
            }
            else{
            p2 = p2.next ;
            p1 = p1.next ;
            }
        }
        return dummy.next ;
    }
}