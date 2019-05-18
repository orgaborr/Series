public class Series {

  //returns the sum of all integers up to n (inclusive)
  public int nSum(int n) {
          int sum = 0;
          
          for(int i=0; i<=n; i++) {
              sum += i;
          }
        
          return sum;
   }
  
//multiplies all numbers up to n, 0 factorial is 1 by default
   public int factorial(int n) {
	    if(n == 0) {
	        return 1;
	    }
	    
	    int fact = 1;
	    for(int i=1; i<=n; i++) {
	        fact *= i;
	    }
	    
	    return fact;
   }
//the next number is always the sum of the 2 previous ones, starts with 0, 1, 1, 2, ...	
public int fibonacci(int n) {
        int[] fibonacciArray = new int[n+2]; //enables the initiation of the first 2 numbers
        fibonacciArray[0] = 0;
        fibonacciArray[1] = 1;
        
        if(n>1) {
            for(int i=2; i<=fibonacciArray.length-2; i++) { //length-2 to balance the extension at initialization of the array
                fibonacciArray[i] = fibonacciArray[i-1] + fibonacciArray[i-2];
            }
        }
        
        return fibonacciArray[n];
    }
  
}

