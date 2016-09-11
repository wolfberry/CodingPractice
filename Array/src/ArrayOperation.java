public class ArrayOperation{
    private int[] array;
    private int length;
    
    
    public ArrayOperation(int initial_size){
    	length = initial_size;
    	array = new int[length];
        for(int i=0; i<length; i++){
            array[i] = 10 + i;
        }
    }
    
    public boolean search(int n){
        int i =0;
        for(; i<length; i++){
            if(n==array[i]){
                System.out.println("Found element: " + n + " at index: " +  i);
                return true;
            }
        }
        
        if(i == length){
            System.out.println("Cannot find element : " + n);
        }
        return false;
    }
    
    public static void main(String[] args){
        ArrayOperation arrayTest = new ArrayOperation(10);
        arrayTest.search(15);
    
    }

}