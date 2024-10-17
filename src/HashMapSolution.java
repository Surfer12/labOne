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
 * 
 * 141. Linked List Cycle
Easy
Topics
Companies

Given `head`, the head of a linked list, determine if the linked list has a cycle in it.

A cycle in a linked list exists if there is a node that can be reached again by continuously following the next pointer. The variable `pos` denotes the index of 
the node that the tail's next pointer connects to. Note that `pos` is not passed as a parameter.

Return `true` if there is a cycle in the linked list; otherwise, return `false`.

### Examples

**Example 1:**
- Input: `head = [3,2,0,-4], pos = 1`
- Output: `true`
- Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).

**Example 2:**
- Input: `head = [1,2], pos = 0`
- Output: `true`
- Explanation: There is a cycle in the linked list, where the tail connects to the 0th node.

**Example 3:**
- Input: `head = [1], pos = -1`
- Output: `false`
- Explanation: There is no cycle in the linked list.

### Constraints
- The number of nodes in the list is in the range `[0, 10^4]`.
- `-10^5 <= Node.val <= 10^5`
- `pos` is `-1` or a valid index in the linked list.

### Follow up
Can you solve it using O(1) (i.e., constant) memory?

 */

import java.util.*;

public class HashMapSolution {

    class ListNode {
        int val;
        ListNode next;


        ListNode(int x) {
        val = x;
        next = null; // next is either null or not null
            }


            //create a hashmap from headnode by traversing linked list
            // use a while loop to traverse singley linked 
            // add the list with 'addAll' to a hashSet and check boolean return value for whether or not set has changed


    public class Solution {
        public ListNode detectCycle(ListNode head){
            HashMap<ListNode, Integer> nodeMap = new HashMap<>(); 
            ListNode current = head;
            int index = 0; // Initialize index to track the position of the node
            while (current != null) {
                // If the node is already in the map, it means we have a cycle
                if (nodeMap.containsKey(current)) {
                    return current;
                }
                // Add the current node to the map with its index
                nodeMap.put(current, index);
                current = current.next; // Move to the next node
                index++; // Increment the index
            }
            return null; // No cycle detected
        }
    }
}
}

// Time Complexity: O(n)
// The algorithm traverses the linked list once, where n is the number of nodes in the list.
// Space Complexity: O(n)
// In the worst case, all nodes are stored in the HashMap if there is no cycle.
