package labonerefactor;        
import java.util.HashSet;


class ListNode {
    int val;
    ListNode next;


    ListNode(int x) {
    val = x;
    next = null; // next is either null or not null
        }

} 


public class HashSetSolution {
    public boolean hasCycle(ListNode head) {
    HashSet<ListNode> nodeSet = new HashSet<>(); // Use HashSet instead of HashMap
    ListNode current = head;
    while (current != null) {
        if (!nodeSet.add(current)) { // add returns false if the element was already present
            return true; // returns true if  detected
        }
        current = current.next; // Move to the next node
    }
    return false; // No cycle detected
}
}

// Time Complexity: O(n)
// The algorithm traverses the linked list once, where n is the number of nodes in the list.
// Equivalent to the input (n) size of the Linked List given. 
// Space Complexity: O(n)
// In the worst case, all nodes are stored in the HashSet if there is no cycle.

/* 
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null; // next is either null or not null
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        ListNode listNode = (ListNode) obj;
        return val == listNode.val;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(val);
    }
}
 */


