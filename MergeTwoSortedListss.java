public class MergeTwoSortedLists
{
	public static void main(String[] args)
	{
		MergeTwoSortedLists lcp = new MergeTwoSortedLists();
		ListNode q1 = ListNode(1);
		ListNode q2 = {"1", "3", "4"};
		ListNode ans = lcp.mergeTwoLists(q1, q2);
		System.out.println(ans);
	}
	
	public class ListNode {
       int val;
       ListNode next;
       ListNode(int x) { val = x; }
    }
 
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
    }
}