package nl.youngcapital;

import java.util.ArrayList;
import java.util.Scanner;

public class HighestNumber {
	
	public static int findMax(ArrayList<Integer> a, int index){
	    if (index > 0) {
	        return Math.max(a.get(index), findMax(a, index-1));
	    } else {
	        return a.get(0);
	    }
	}

    public static void main(String[] args) {
        HighestNumber obj = new HighestNumber();

        System.out.println("Please enter an array of integers, finish with 'end'");
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        
        while (s.hasNextInt()) {
        	arrayList.add(s.nextInt());
        }
        
        int result = findMax(arrayList,arrayList.size()-1);
        System.out.println(result);
    }
}
