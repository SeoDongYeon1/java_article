package java_article_make;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("==���α׷� ����==");

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.printf("��ɾ� ) ");
			String command = sc.nextLine();

			if (command.length() == 0) {
				System.out.println("��ɾ �Է����ּ���");
				continue;
			}

			if (command.equals("system exit")) {
				break;
			}

			if (command.equals("article list")) {
				System.out.println("�Խñ��� �����ϴ�");
			} else if (command.equals("article write")) {
				System.out.println("���� : ");
				System.out.println("���� : ");
			}

			else {
				System.out.println("�������� �ʴ� ��ɾ��Դϴ�");
			}

		}

		System.out.println("==���α׷� ��==");

		sc.close();
	}
}