package chapter01;

import java.util.Scanner;

public class NHelloWorld01 {

	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.print("Hello World");
		System.out.println("Hello World");

		Scanner scanner =new Scanner (System.in);
		
		int count1 = scanner.nextInt();//scannner의 nextInt 는 space/tab/\n 를 중심으로 잘라서
		int count2 = scanner.nextInt();
		String str = scanner.next();
		
		System.out.println(count1+":"+count2+":"+str);
		
		String str2 = scanner.nextLine();
		System.out.println(str2);
	}

}
