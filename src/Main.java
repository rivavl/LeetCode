public class Main {
    public static void main(String[] args) {
        RemoveDuplicatesFromSortedList.ListNode a = new RemoveDuplicatesFromSortedList.ListNode(1);
        RemoveDuplicatesFromSortedList.ListNode b = new RemoveDuplicatesFromSortedList.ListNode(1);
        RemoveDuplicatesFromSortedList.ListNode c = new RemoveDuplicatesFromSortedList.ListNode(1);

        a.next = b;
        b.next = c;

        RemoveDuplicatesFromSortedList.deleteDuplicates(a);
    }
}
