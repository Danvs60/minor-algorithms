import java.util.*;
public class sorted {

	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int k = Integer.parseInt(args[0]);
		int i = 0;
		ArrayList<Integer> numbers = new ArrayList<>();
		while(s.hasNextInt() && i < k){
			numbers.add(s.nextInt());
			i++;
		}
		Collections.sort(numbers);
		for(int n : numbers)
			System.out.println(n);
	}

}
