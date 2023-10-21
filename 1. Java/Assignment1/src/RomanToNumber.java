import java.util.Scanner;

public class RomanToNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Roman Number : ");

		String roman = sc.next();
		romanToNumber(roman);

		

	}
	static void romanToNumber(String roman) {
		String str = roman.toLowerCase();
		int intNo = 0;
		int result = 0;
		int currentNo = 0;
		boolean defaultExe = false;

		loop : for (int i = str.length()-1; i>= 0; i--) {
			char c = str.charAt(i);

			switch (c) {

			case 'i' : 
				currentNo = 1;
				break;
			case 'v' : 
				currentNo = 5;
				break;
			case 'x' : 
				currentNo = 10;
				break;

			case 'l' : 
				currentNo = 50;
				break;

			case 'c' : 
				currentNo = 100;
				break;

			case 'd' : 
				currentNo = 500;
				break;

			case 'm' : 
				currentNo = 1000;
				break;

			default: 
				defaultExe = true;
				break loop;
			} 
				if (currentNo < intNo) {
					result = result - currentNo;
				} else {
					result = result + currentNo;
				}
				intNo = currentNo;
			
		}
		if(defaultExe) {
			System.out.println("Invalid Roman number : " + str);
		}else {
			System.out.println("Integer of Entered Roman No is : "+result);
		}

	}
}
