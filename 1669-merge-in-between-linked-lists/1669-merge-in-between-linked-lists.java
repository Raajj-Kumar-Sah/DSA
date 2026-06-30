/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp = list1;

        // Step 1: Reach the node right before index 'a' (index a - 1) 🚶‍♂️
        for (int i = 0; i < a - 1; i++) {
            temp = temp.next;
        }

        ListNode A = temp; // Gateway node right before the cut
        
        // Step 2: Advance across the deletion zone to find the node right after index 'b' 🎯
        int i = b - a;
        while (i >= 0) {
            temp = temp.next;
            i--;
        }
        ListNode B = temp.next; // Gateway node right after the cut

        // Step 3: Link node 'A' directly into the start of list2 🔀
        A.next = list2;
        
        // Step 4: Traverse to the final element of list2 🏁
        ListNode t = list2;
        while (t.next != null) {
            t = t.next;
        }
        
        // Step 5: Securely bridge the tail of list2 to node 'B' 🪡
        t.next = B;

        return list1;
    }
}