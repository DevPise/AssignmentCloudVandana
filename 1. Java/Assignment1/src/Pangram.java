import java.util.Scanner;

public class Pangram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Write the sentence to check Pangram :");
		String str = sc.next();
		
		boolean bln = checkPangram(str);
		
		 if (bln) {
	            System.out.println("The sentence is a pangram.");
	        } else {
	            System.out.println("The sentence is not a pangram.");
	        }
		;
	}
	static boolean checkPangram(String str) {
		String s = str.toLowerCase();
		
		for (char ch='a'; ch<='z'; ch++) {
            if (s.indexOf(ch) == -1) {
                return false;
            }
        }
		return true;
	}

}
