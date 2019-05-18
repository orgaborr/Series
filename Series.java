public class Series {

  //returns the sum of all integers up to n (inclusive)
  public static int nSum(int n) {
          int sum = 0;
          
          for(int i=0; i<=n; i++) {
              sum += i;
          }
        
          return sum;
      }
 }
