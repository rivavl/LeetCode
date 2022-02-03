//83. Remove Duplicates from Sorted List
//
//Given the head of a sorted linked list, delete all duplicates such that each element appears only once.
//Return the linked list sorted as well.


public class RemoveDuplicatesFromSortedList {
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode prev = head;
        ListNode ch = prev.next;

        while (ch != null) {
            if (ch.val == prev.val) {
                prev.next = ch.next;
            } else {
                prev = ch;
            }
            ch = ch.next;
        }
        return head;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
