import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Boss {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int people = kb.nextInt(); kb.nextLine();
		List<String> bosses= new ArrayList<>();
		for (int i = 0; i < people; i++) {
			bosses.add(kb.nextLine().trim());
		}
		int checks = kb.nextInt(); kb.nextLine();
		for (int i = 0; i < checks; i++) {
			int pos = bosses.indexOf(kb.nextLine().trim());
			if(pos == 0){
				System.out.println("no boss");
			}else{
				System.out.println(bosses.get(pos-1));
			}
		}
	}
}
