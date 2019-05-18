public class Series {

  //returns the sum of all integers up to n (inclusive)
  public int nSum(int n) {
          int sum = 0;
          
          for(int i=0; i<=n; i++) {
              sum += i;
          }
        
          return sum;
   }
  
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
  
}

