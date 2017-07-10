import java.util.ArrayList;

public class Numrange {
public static int numRange(ArrayList<Integer> a, int b, int c) {
		    int size, rangeLow, rangeHigh, sum = 0, numberOfSequences = 0, maxSequences = 0;
		    size = a.size();
		    rangeLow = b < c ? b : c;
		    rangeHigh = b < c ? c : b;
		    int j;
		    for(int i = 0; i < size; i++) {
		    	sum = 0;
		        if(a.get(i) > rangeHigh) {
		            sum = 0;
		            continue;
		        } else {
		        	j = i;
		            while (sum <= rangeHigh) {
		            	if(sum + a.get(j) <= rangeHigh) {
		                sum = sum + a.get(j);
		                if(sum >= rangeLow) {
		                    numberOfSequences++;
		                }
		            	
		                if(j < size - 1) {
		                	j++;
		                } else{
		                	break;
		                }
		            	} else {
		            		break;
		            	}
		            }
		            if(numberOfSequences > maxSequences) {
		            maxSequences = numberOfSequences;
		        }
		        }
		        
		    }
		    return maxSequences;
		}
}
