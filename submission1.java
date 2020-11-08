import java.util.*;
public class submission1 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		float n = s.nextFloat();
		float g = 1;
		while(Math.abs(g - n/g)>= 0.00001){
			g = (g + n/g)/2;
		}
		System.out.printf("%.0f\n", g);
	}
}
