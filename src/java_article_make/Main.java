package java_article_make;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("==���α׷� ����==");

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.printf("��ɾ� ) ");
			String command = sc.nextLine();

			if (command.equals("system exit")) {
				break;
			}

		}

		System.out.println("==���α׷� ��==");

		sc.close();
	}
}