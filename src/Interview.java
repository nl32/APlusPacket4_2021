import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Interview {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int cases =kb.nextInt();
		for (int i = 0; i < cases; i++) {
			int candidateCount = kb.nextInt(); kb.nextLine();
			List<Candidate> candidates = new ArrayList<>();
			for (int j = 0; j < candidateCount; j++) {
				candidates.add(new Candidate(kb.next(),kb.nextInt(),kb.nextInt(),kb.nextInt()));
			}
			candidates.sort(Comparator.reverseOrder());
			StringBuilder out = new StringBuilder();
			for (Candidate candidate : candidates) {
				out.append(candidate.name);
				out.append(", ");
			}
			System.out.println(out.substring(0,out.length()-2));
		}
	}
}
class Candidate implements Comparable<Candidate>{
	String name;
	int exp;
	int skills;
	int comms;
	int total;

	public Candidate(String name, int exp, int skills, int comms) {
		this.name = name;
		this.exp = exp;
		this.skills = skills;
		this.comms = comms;
		total = exp + skills + comms;
	}

	@Override
	public int compareTo(Candidate o) {
		int totalCom = this.total - o.total;
		if(totalCom==0){
			int expCom = this.exp - o.exp;
			if(expCom == 0){
				int skillCom = this.skills - o.skills;
				if(skillCom == 0){
					int commsCom = this.comms - o.comms;
					if(commsCom==0){
						return o.name.compareTo(name);
					}
					return commsCom;
				}
				return skillCom;
			}
			return expCom;
		}
		return totalCom;
	}
}
