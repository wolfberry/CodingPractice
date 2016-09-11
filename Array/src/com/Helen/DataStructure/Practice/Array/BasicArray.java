package com.Helen.DataStructure.Practice.Array;

public abstract class BasicArray {

	protected int[] a;
	protected int nElems;
	
	public int getSize(){
		return nElems;
	}
	
	public BasicArray(int max){
		a = new int[max];
	}
	
	public void insert(int value){
		a[nElems++] = value;
	}
	
	public void display(){
		for(int i=0;i<nElems;i++){
			System.out.print(a[i] + " ");
		}
		
		System.out.println();
	}
	
	public void swap(int i, int j){
		int temp;
		temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	abstract void sort();
	
}
