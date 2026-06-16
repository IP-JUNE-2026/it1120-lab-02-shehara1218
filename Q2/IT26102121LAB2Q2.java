import java.util.Scanner;

public class IT26102121LAB2Q2{
	
public static void main(String[]args){
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter perimeter of fence:");
	double perimeter = input.nextDouble();
	
	//length = perimeter/3.5
	double length = perimeter/3.5;
	
	//width = 3/4*length
	double width =0.75*length;
	
	System.out.println("Length of fence:" +length);
	System.out.println("width of fence:" +width);
	
	input.close();
	}
}