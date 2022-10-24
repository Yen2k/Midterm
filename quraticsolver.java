import java.lang.*;
public class quraticsolver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
		int b = 3;
		int c = 2;
		if (b*b - 4*a*c <0)
			System.out.println("This equation " + a + "x^2 + " + b +"x + " + c +" has no solution");
		else
			{
				System.out.println("The solution for the equation " + a + "x^2 + " + b +"x + " + c +" are");
				System.out.println((-b+Math.sqrt(b*b-4*a*c))/2*a + " and " + (-b-Math.sqrt(b*b-4*a*c))/2*a);
			}
	}

}
