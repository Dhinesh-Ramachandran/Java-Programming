package level_1;
import java.util.Scanner;
public class P06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String num = scan.next();
		int decimal;
		if(num.startsWith("0x")) {
		decimal = Integer.parseInt(num.substring(2), 16);
		}
		else if (num.startsWith("0")){
			decimal = Integer.parseInt(num, 8);
		}
		else {
			decimal = Integer.parseInt(num);
		}
		System.out.println(decimal);
	}

}
