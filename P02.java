package level_1;

import java.util.Scanner;

public class P02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int ascii = scan.nextInt();
		if(ascii>127) {
			System.out.println("Invalid ASCII value");
		}
		else {
		char ch = (char) ascii;
		System.out.println(ascii + ":" + ch);
		}
		scan.close();
	}

}
