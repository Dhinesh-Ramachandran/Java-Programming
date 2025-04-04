package level_1;
import java.util.Scanner;
public class P01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char ch = scan.next().charAt(0);
		int ascii = (int) ch;
		System.out.println(ch + ":" + ascii);
		scan.close();

	}

}
