import java.util.Scanner;
public class WayTooLongWords {		
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String word;
		int counter = 0;
		while(counter < n) {
			 word = input.next();
			 if(word.length()>10) {
				 System.out.println(word.charAt(0)+Integer.toString(word.length()-2)+word.charAt(word.length()-1));
			 }else
				 System.out.println(word);
			 counter++;
		}
	}
}
