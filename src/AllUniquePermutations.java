import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AllUniquePermutations {
	public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> a) {
	    ArrayList<ArrayList<Integer>> resultList = new ArrayList<ArrayList<Integer>>();
		resultList.add(new ArrayList<Integer>());
		int size = a.size();
		for (int i = 0; i < size; i++) {
			Set<ArrayList<Integer>> currentSet = new HashSet<ArrayList<Integer>>();
			for (List<Integer> l : resultList) {
				for (int j = 0; j < l.size() + 1; j++) {
					l.add(j, a.get(i));
					ArrayList<Integer> T = new ArrayList<Integer>(l);
					l.remove(j);
					currentSet.add(T);
				}
			}
			resultList = new ArrayList<ArrayList<Integer>>(currentSet);
		}
	 
		return resultList;
	}
}
