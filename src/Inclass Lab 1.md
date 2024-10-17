Inclass Lab 1
Due Thursday by 5pm Points 100 Submitting a file upload File Types pdf Available Oct 17 at 12:30am - Oct 17 at 5pm 16 hours and 30 minutes
Form Groups: Form groups of 3 to 4 students. Choose a name for your group.
Solve Problems: As a group, solve the following LeetCode problems:
141. Linked List CycleLinks to an external site.
142. Linked List Cycle IILinks to an external site.  
Document Solutions:
For each problem, include screenshots of your accepted code in a Word document.
Important: Along with the screenshots, provide a brief explanation of your solution approach and the logic behind your code, time and space complexity .
Submission:
Save your Word document as a PDF file. Include names of each group member.
Name the PDF file using the following format: CIS233_GROUPNAME.pdf (e.g., CIS233_CodeCrushers.pdf)


Linked List Cycle Two : 
Step wise solution:
1. Create a hashmap from given headnode by traversing linked list forward with a while loop
2. Use a while loop to traverse singley linked list with from the head given of type ListNode
3. Using head as 'current' pointer while setting the key of the hashmap as current, and the value as true or false 
4. The node to true in the hashmap (key, value)
3. Assign the current pointer to the next node in the list
4. return false if the current pointer is ever null
5. return true if the current pointer is ever found in the hashmap


class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }

public boolean hasCycListNodes(ListNode head){
    HashMap<ListNode, Boolean> nodeMap = new HashMap<>(); // create new Hashmap of type listNode and boolean 
    ListNode current = head;
    while (current != null) {
        // If the node is already in the map, it means we have a cycle
        if (nodeMap.containsKey(current)) {
            return true; // Cycle detected
        }
        // Add the current node to the map
        nodeMap.put(current, true);
        current = current.next; // Move to the next node
    }
    return false; // No cycle detected
    }
    }