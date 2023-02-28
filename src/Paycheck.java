import java.util.Scanner;

public class Paycheck {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int cases = kb.nextInt();
		for (int i = 0; i < cases; i++) {
			System.out.println(kb.nextInt() * kb.nextInt());
		}
	}
}
