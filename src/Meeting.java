import java.util.Scanner;

public class Meeting {
	public static final String[] TIMES = {
			"9:00 AM",
			"9:30 AM",
			"10:00 AM",
			"10:30 AM",
			"11:00 AM",
			"11:30 AM",
			"12:00 PM",
			"12:30 PM",
			"01:00 PM",
			"01:30 PM",
			"02:00 PM",
			"02:30 PM",
			"03:00 PM",
			"03:30 PM",
			"04:00 PM",
			"04:30 PM",
	};
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int cases = kb.nextInt();
		for (int i = 0; i < cases; i++) {
			int lines = kb.nextInt(); kb.nextLine();
			String[][] blocks = new String[lines][16];
			for (int j = 0; j < lines; j++) {
				blocks[j] = kb.nextLine().split("");
			}
			for (int j = 0; j < 16; j++) {
				boolean free = true;
				for (int k = 0; k < lines && free; k++) {
					if (blocks[k][j].equals("#")) {
						free = false;
						break;
					}
				}
				if(free){
					System.out.println(TIMES[j]);
					break;
				}
			}
		}
	}
}
