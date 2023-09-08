package org.sd;

import java.util.Scanner;

public class ScannerDemo {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number");
	//String next = s.next();
	String nextLine = s.nextLine();
	String next = s.next();
	//System.out.println(next);
	System.out.println(nextLine);
	System.out.println(next);
}
}
