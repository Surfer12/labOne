
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

 // Assign the index of the node to the hashmap key value pair 
 // if the node is already in the hashmap, return the node and the value of the index of the no
 // if the node is not in the hashmap, add the node to the hashmap



import java.util.HashMap;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }


class LinkedListTwo {
    public ListNode detectCycle(ListNode head) {
        HashMap<ListNode, Integer> nodeMap = new HashMap<>();
        ListNode current = head;
        while (current != null) {
            if (nodeMap.containsKey(current)) {
                return current;
            }
            nodeMap.put(current, );
            current = current.next;
        }
        return null;
    }
}
}

