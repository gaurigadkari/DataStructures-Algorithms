import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class KthSmallestElement {
	// DO NOT MODIFY THE LIST. IT IS READ ONLY
	static class PQCompare implements Comparator<Integer> {
 
		public int compare(Integer one, Integer two) {
			return two - one;
		}
	}
	public int kthsmallest(final List<Integer> a, int k) {
	    PQCompare pqCompare = new PQCompare();
	    PriorityQueue<Integer> q = new PriorityQueue<Integer>(k, pqCompare);
        for(int i: a){
        q.offer(i);
 
        if(q.size()>k){
            q.poll();
        }
    }
 
    return q.peek();
	}
}

