package nl.youngcapital;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HighestNumber {
	
	public static int findMax(ArrayList<Integer> a, int index){
	    if (index > 0) {
	        return Math.max(a.get(index), findMax(a, index-1));
	    } else {
	        return a.get(0);
	    }
	}
	
	public int divideConquer(List<Integer> list) {
		int length = list.size();
		if (length==1) {
			return list.get(0);
		} else if (length==2) {
			return Math.max(list.get(0),list.get(1));
		} else {
			int end1 = length/2;			
			List<Integer> list1 = list.subList(0, end1);
			List<Integer> list2 = list.subList(end1, length);
			return Math.max(divideConquer(list1),divideConquer(list2));
		}
	}

    public static void main(String[] args) {
        HighestNumber obj = new HighestNumber();

        System.out.println("Please enter an array of 5 integers");
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        
        while (true) {
        	if (s.hasNextInt()) {
        		arrayList.add(s.nextInt()); 	
        	}
        	System.out.println(s.next());
        	if (arrayList.size()==5) {
        		break;
        	}
        }
        
        
        
        int result = findMax(arrayList,arrayList.size()-1);
        int divide = obj.divideConquer(arrayList);
        System.out.println(result + " vs. " + divide);
    }
}
