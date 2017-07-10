import java.util.ArrayList;

/**
 * Definition for singly-linked list.
 */
class ListNode {
	public int val;
	public ListNode next;

	ListNode(int x) {
		val = x;
		next = null;
	}
}

public class Subtract {
	public ListNode subtract(ListNode a) {
		ArrayList<Integer> List = new ArrayList<>();
		ListNode b = a, front = a, back = a;
		int i, j, size = 0;
		while (b != null) {
			List.add(b.val);
			b = b.next;
			size++;
		}
		for (i = 0, j = size - 1 - i; i < size / 2; i++, j--) {
			front.val = List.get(j) - List.get(i);
			front = front.next;
		}
		return a;

	}
}
