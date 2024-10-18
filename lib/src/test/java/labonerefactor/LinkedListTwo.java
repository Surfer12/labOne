package labonerefactor;
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
 // Key is 
 // if the node is already in the hashmap, return the node and the value of the index of the no
 // if the node is not in the hashmap, add the node to the hashmap

/*  Input: head = [3,2,0,-4], pos = 1
Output: tail connects to node index 1
Explanation: There is a cycle in the linked list, where tail connects to the second node. */



import java.util.HashMap;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }

    public class Solution {
        public ListNode detectCycle(ListNode head){
          HashMap<ListNode, Integer> nodeMap = new HashMap<>(); // create new Hashmap of type listNode and boolean 
          ListNode current = head;
          while (current != null) {
              // If the node is already in the map, it means we have a cycle
              if (nodeMap.containsKey(current)) {
                  return current;
              }
              // Add the current node to the map
              nodeMap.put(current, current.val);
              current = current.next; // Move to the next node
          }
          return current; // No cycle detected
          }
      }
    }

// Time Complexity: O(n)
// The algorithm traverses the linked list once, where n is the number of nodes in the list.
// Equivalent to the input (n) size of the Linked List given. 

// Space Complexity: O(n)
// In the worst case, all nodes are stored in the HashMap if there is no cycle.


