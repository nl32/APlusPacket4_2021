import java.util.Scanner;

public class Supply {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int cases = kb.nextInt();
		System.out.print("ORDER_START ");
		for (int i = 0; i < cases; i++) {
			kb.useDelimiter("[\\sx]");
			int repeat = kb.nextInt();
			System.out.print((kb.next()+" ").repeat(repeat));
		}
		System.out.print("ORDER_END");
	}
}
