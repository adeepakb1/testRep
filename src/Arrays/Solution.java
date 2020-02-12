package Arrays;


class Solution {


    public static void main(String[] args) {
        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(1);
        l1.next = new ListNode(2);
        l2.next = new ListNode(3);
        l1.next.next = new ListNode(4);
        l2.next.next = new ListNode(5);
        ListNode lnew = mergeTwoLists(l1, l2);
        System.out.println();

    }
//branch deepak
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode dummyNode = new ListNode(0);


        ListNode tail = dummyNode;
        while (true) {
            if (l1 == null) {
                tail.next = l2;
                break;
            }
            if (l2 == null) {
                tail.next = l1;
                break;
            }


            if (l1.val <= l2.val) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }
        return dummyNode.next;
    }

    public ListNode mergeKLists(ListNode[] lists) {
        int len = lists.length;
        while (len != 0) {
            int i = 0, j = len;
            while (i < j) {
                lists[i]= mergeTwoLists(lists[i],lists[len]);
            }

        }
    }

}


class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
