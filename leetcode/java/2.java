/**
 * Definition for singly-linked list.
 *
 * <ul>
 *   public class ListNode {
 *   <li>int val;
 *   <li>ListNode next;
 *   <li>ListNode() {}
 *   <li>ListNode(int val) { this.val = val; }
 *   <li>ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * </ul>
 *
 * }
 */
class Solution {
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode c1 = l1;
    ListNode c2 = l2;
    ListNode answer = new ListNode();
    ListNode start = answer;
    ListNode prev = null;
    int x, y;
    int z = 0;

    while (c1 != null || c2 != null) {
      if (c1 == null) x = 0;
      else x = c1.val;
      if (c2 == null) y = 0;
      else y = c2.val;
      z = x + y + z;
      answer.val = z % 10;
      z = z / 10;

      prev = answer;
      answer.next = new ListNode();
      answer = answer.next;

      if (c1 != null) c1 = c1.next;
      if (c2 != null) c2 = c2.next;
    }
    if (z > 0) answer.val = z;
    else prev.next = null;
    return start;
  }
}
