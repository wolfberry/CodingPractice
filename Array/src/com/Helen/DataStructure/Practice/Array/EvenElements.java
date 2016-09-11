package com.Helen.DataStructure.Practice.Array;

public class EvenElements {
	
	public static void main(String[] args){
		int[] test = {1,2,3,4,5,6,7,8,9,0};
		int even_c = 0;
		int odd_c = test.length -1;
		
		while(even_c < odd_c){
			if(test[even_c]%2 == 0){
				even_c++;
			}else{
				int temp;
				temp = test[even_c];
				test[even_c] = test[odd_c];
				test[odd_c--] = temp;
			}
		}
		
		for(int i=0; i<test.length; i++){
			System.out.println(test[i]);
		}
	}

}
