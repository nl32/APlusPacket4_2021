import java.util.Scanner;

public class Product {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int cases =kb.nextInt(); kb.nextLine();
		for (int i = 0; i < cases; i++) {
			String line = kb.nextLine().toLowerCase();
			boolean good = true;
			for (int j = 0; j < line.length()-1; j++) {
				if(line.charAt(j)> line.charAt(j+1)){
					good = false;
					break;
				}
			}
			if(good){
				System.out.println("APPROVED BY COMMITTEE: It's a go!");
			}else{
				System.out.println("REJECTED BY COMMITTEE: Back to the drawing board!");
			}
		}
	}
}
