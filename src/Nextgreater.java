import java.util.ArrayList;

public class Nextgreater {
public static ArrayList<Integer> nextGreater(ArrayList<Integer> a) {
	    int size = a.size(), i, j;
	    ArrayList<Integer> b = new ArrayList<>(size);
	    for(i = 0; i < size; i++) {
	        if(i != size -1) {
	           j = i + 1;
	           while(a.get(i) >= a.get(j)) {
	           j++;
	           if(j > size - 1) {
	        	   
	        	   break;
	           }
	           }
	           if(j > size -1) {
	        	   b.add(i, -1);
	           } else {
	           b.add(i, a.get(j));
	           }
	        
	        } else{
	        	b.add(i, -1);
	        }
	        }
	        
	    return b;
	}
}
