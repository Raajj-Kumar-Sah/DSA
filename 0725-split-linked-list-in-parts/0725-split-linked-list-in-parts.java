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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] result = new ListNode[k];
        int size = 0;
        ListNode curr = head;
        
        // Step 1: Compute the total size of the linked list 📏
        while (curr != null) {
            size++;
            curr = curr.next;
        }
        
        curr = head;
        // Step 2: Determine base length per part and the extra leftover nodes 🧮
        int parts = size / k;
        int rem = size % k;
        
        // Step 3: Segment the list into k distinct buckets
        for (int i = 0; i < k; i++) {
            ListNode newNode = new ListNode(0); // Dummy anchor node for the current segment ⚓
            ListNode temp = newNode;
            
            int currSize = parts;
            // Distribute remaining elements evenly to earlier buckets 🎁
            if (rem > 0) {
                currSize++;
                rem--;
            }

            // Construct the current segment sub-chain
            for (int j = 0; j < currSize; j++) {
                temp.next = new ListNode(curr.val);
                temp = temp.next;
                curr = curr.next;
            }
            
            // Assign the constructed sub-list to the result slot
            result[i] = newNode.next;
        }
        
        return result;
    }
}