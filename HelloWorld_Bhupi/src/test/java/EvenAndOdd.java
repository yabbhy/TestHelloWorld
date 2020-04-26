import org.testng.annotations.Test;
import java.util.Scanner;
public class EvenAndOdd {

	@Test
	public void evenAndOdd() {

		Scanner sc = new Scanner(System.in);


		System.out.print("Enter the number between 1 and 100: ");

		int n = sc.nextInt();


		while (!(n > 0 && n <= 100)) {
			System.out.print("Invalid Entry. Please enter another number between 1 and 100: ");
			n = sc .nextInt();
		}

		if(n%2==0) {
			System.out.println(n + " is even number");
		}
		else
		{
			System.out.println(n + " is odd number");
		}
	}

}
