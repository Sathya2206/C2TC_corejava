package dayone;

import java.util.Scanner;

public class basics {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter The A Value");
		int a = Sc.nextInt();
		System.out.println("Enter The B Value");
		int b = Sc.nextInt();
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a|b);
		System.out.println(a%b);
}
}
