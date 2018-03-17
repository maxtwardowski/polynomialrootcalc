import java.util.Scanner;

class Polynomial {
	int coefficient_A, coefficient_B, coefficient_C;
	
	public void setCoefficients(int a, int b, int c) {
		coefficient_A = a;
		coefficient_B = b;
		coefficient_C = c;
	}
	
	public void calculateRoots() {
		double delta;
		
		if (coefficient_A == 0) {
			double root = -coefficient_C / coefficient_B;
			System.out.println("The root of the linear function is: " + root);
		} else {
		
			delta = Math.pow(coefficient_B, 2) - 4 * coefficient_A * coefficient_C;
			
			if (delta < 0) {
				System.out.println("This polynomial ain't got not roots");
			} else if (delta == 0) {
				double root;
				root = -coefficient_B / (2 * coefficient_A);
				System.out.println("The root of the polynomial is: " + root);
			} else if (delta > 0) {
				double root1 = (-coefficient_B - Math.sqrt(delta)) / (2 * coefficient_A),
					   root2 = (-coefficient_B + Math.sqrt(delta)) / (2 * coefficient_A);
				System.out.println("The roots of the polynomial are: " + root1 + ", " + root2);
			}
		}
	}	
}

public class intconverter {

	public static void main(String[] args) {
		Scanner scnr1 = new Scanner(System.in),
				scnr2 = new Scanner(System.in),
				scnr3 = new Scanner(System.in);
		
		System.out.println("Input coefficient #1: ");
		String input1 = scnr1.nextLine();
		System.out.println("Input coefficient #2: ");
		String input2 = scnr2.nextLine();
		System.out.println("Input coefficient #3: ");
		String input3 = scnr3.nextLine();
		
		//Closing the scanners
		scnr1.close();
		scnr2.close();
		scnr3.close();
		
		int integer1 = Integer.parseInt(input1),
			integer2 = Integer.parseInt(input2),
			integer3 = Integer.parseInt(input3);
		
		Polynomial mypoly = new Polynomial();
		mypoly.setCoefficients(integer1, integer2, integer3);
		mypoly.calculateRoots();
	}

}
