import java.util.HashMap;
import java.util.List;

public class LongestConsecutiveSequence {
	public int longestConsecutive(final List<Integer> a) {
	    int size = a.size(), max = 0, tmpMax = 0, startSeq;
	    HashMap hashMap = new HashMap();
	    for(int i = 0; i < size; i++) {
	        hashMap.put(a.get(i), 0);
	    
	    }
	    for(int i = 0; i < size; i++) {
	        if(hashMap.containsKey(a.get(i) - 1)) {
	            hashMap.put(a.get(i), -1);
	        } else {
	            hashMap.put(a.get(i), 1);

	        }
	    }
	    for(int i = 0; i < size; i++) {
	        if(hashMap.containsKey(a.get(i))) {
	            if(hashMap.get(a.get(i)).equals(1)) {
	                startSeq = a.get(i);
	                while(hashMap.containsKey(startSeq)) {
	                    tmpMax++;
	                    startSeq++;
	                }
	            }
	        }
	        max = tmpMax > max ? tmpMax : max;
	        tmpMax = 0;
	    }
	    
	    return max;
	}
}
