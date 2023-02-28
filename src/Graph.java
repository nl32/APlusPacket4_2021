import java.util.Scanner;

public class Graph {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int cases = scanner.nextInt();
		for (int i = 0; i < cases; i++) {
			int size = scanner.nextInt()-1;
			for (int j = 0; j < size; j++) {
				System.out.println("|" + " ".repeat(size-j-1) +"/");
			}
			System.out.println("+"+"-".repeat(size));
		}
	}
}
