package project_1;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sentence = new Scanner(System.in);
		System.out.println("Enter the sentence:");
		String sentence2 = sentence.nextLine();
		System.out.println("After removing the vowels: ");

		for (int i = 0; i < sentence2.length(); ++i) {
			if (sentence2.charAt(i) == 'a' || sentence2.charAt(i) == 'e' || sentence2.charAt(i) == 'ı'
					|| sentence2.charAt(i) == 'i' || sentence2.charAt(i) == 'o' || sentence2.charAt(i) == 'ö'
					|| sentence2.charAt(i) == 'u' || sentence2.charAt(i) == 'ü' || sentence2.charAt(i) == 'A'
					|| sentence2.charAt(i) == 'E' || sentence2.charAt(i) == 'I' || sentence2.charAt(i) == 'İ'
					|| sentence2.charAt(i) == 'O' || sentence2.charAt(i) == 'Ö' || sentence2.charAt(i) == 'U'
					|| sentence2.charAt(i) == 'Ü') {

			} 
			else {
				System.out.print("" + sentence2.charAt(i));
			}
		}
	}
}
