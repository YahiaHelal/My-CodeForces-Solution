import java.util.Scanner;
public class Watermelon {		
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int weight = input.nextInt();
		if(weight > 2) {
			String Dividable = (weight%2 == 0)? "YES" : "NO";
			System.out.println(Dividable);
		}else 
			System.out.println("NO");
	}
}
