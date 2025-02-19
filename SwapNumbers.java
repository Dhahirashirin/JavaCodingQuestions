package javaprograms;

public class SwapNumbers {

	public static void main(String[] args) {
		//Swap two numbers with Temporary variable
		int a = 10;
        int b= 5;
        
        int temp = a;
         a = b;
         b= temp;
        System.out.println("a:"+ a);
        System.out.println("b:"+ b);
        
//Swap two numbers without Temporary variable
 
        int c = 10;
        int d= 5;
        c=c+d;//15  
        d=c-d;//10;
        c=c-d;//5
        
        //c=c*d;//50
        //d=c/d;//10;
        //c=c/d;//5
        
        System.out.println("c:"+ c);
        System.out.println("d:"+ d);

	}

}
