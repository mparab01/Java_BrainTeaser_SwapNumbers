

/*

Write a function to swap a number in place (that is, without temporary variables).

*/


package swapnumbers;


public class SwapNumbers {
    
    public void SwapNumbers(int a, int b){
       
        a = a + b;
        b = a - b;
        a = a - b;
        
         // Printing number after swapping
        System.out.println(" Numbers after swapping :");
        System.out.println(" First no a is  :" +a +" Second no b is : " +b);
    }
    
    public static void main(String[] args) {
        
        int a = -152;   // First No
        int b = -98;    // Second No
        
        // Printing number before swapping
        System.out.println(" Numbers before swapping :");
        System.out.println(" First no a is  :" +a +" Second no b is : " +b);
        
        SwapNumbers obj = new SwapNumbers();
        obj.SwapNumbers(a,b);
        
        
    }
    
}
