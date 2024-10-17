
import java.util.HashSet;


class ListNode {
    int val;
    ListNode next;


    ListNode(int x) {
    val = x;
    next = null; // next is either null or not null
        }

public class HashSetSolution {
    public boolean hasCycle(ListNode head) {
    HashSet<ListNode> nodeSet = new HashSet<>(); // Use HashSet instead of HashMap
    ListNode current = head;
    while (current != null) {
        // If the node is already in the set, it means we have a cycle
        if (!nodeSet.add(current)) { // add returns false if the element was already present
            return true; // Cycle detected
        }
        current = current.next; // Move to the next node
    }
    return false; // No cycle detected
}
}


public void addAll(HashSet<ListNode> nodes) {
    nodeSet.addAll(nodes); // Add all nodes from the provided HashSet
}

// ... existing code ...
}
