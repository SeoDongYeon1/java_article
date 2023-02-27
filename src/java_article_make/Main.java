package java_article_make;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("==���α׷� ����==");

		Scanner sc = new Scanner(System.in);

		int lastArticleId = 0;

		List<Article> articles = new ArrayList<>();

		while (true) {

			System.out.printf("��ɾ� ) ");
			String command = sc.nextLine().trim();

			if (command.length() == 0) {
				System.out.println("��ɾ �Է����ּ���");
				continue;
			}

			if (command.equals("system exit")) {
				break;
			}

			if (command.equals("article list")) {
				if (articles.size() == 0) {
					System.out.println("�Խñ��� �����ϴ�");
					continue;
				}
				System.out.println("��ȣ    /     ����    ");
				String tempTitle = null;
				for (int i = articles.size() - 1; i >= 0; i--) {
					Article article = articles.get(i);
					if (article.title.length() > 4) {
						tempTitle = article.title.substring(0, 4);
						System.out.printf("%d	/	%s\n", article.id, tempTitle + "...");
						continue;
					}

					System.out.printf("%d	/	%s\n", article.id, article.title);
				}
			} else if (command.equals("article write")) {
				int id = lastArticleId + 1;
				System.out.printf("���� : ");
				String title = sc.nextLine();
				System.out.printf("���� : ");
				String body = sc.nextLine();

				Article article = new Article(id, title, body);
				articles.add(article);

				System.out.printf("%d�� ���� ���� �Ǿ����ϴ�\n", id);
				lastArticleId++;
			} else if (command.startsWith("article detail ")) {
				String[] commandBits = command.split(" "); // article / detail / ~
				// commandBits[0] => article
				// commandBits[1] => detail
				// commandBits[2] => ~

				int id = Integer.parseInt(commandBits[2]);
				// article detail 1 => "1" => 1

//				boolean found = false;
				Article foundArticle = null;

				for (int i = 0; i < articles.size(); i++) {
					// 0 , 1 , 2 -> index
					// 1 , 2 , 3 -> id
					Article article = articles.get(i);
					if (article.id == id) {
//						found = true;
						foundArticle = article;
						break;
					}
				}

				if (foundArticle == null) {
					System.out.printf("%d�� �Խù��� �������� �ʽ��ϴ�.\n", id);
					continue;
				}
				System.out.println(id + "�� ���� �����մϴ�");
				System.out.printf("��ȣ : %d\n", foundArticle.id);
				System.out.printf("��¥ : 2023-12-12 12:12:12\n");
				System.out.printf("���� : %s\n", foundArticle.title);
				System.out.printf("���� : %s\n", foundArticle.body);
			}

			else {
				System.out.println("�������� �ʴ� ��ɾ��Դϴ�");
			}

		}

		System.out.println("==���α׷� ��==");

		sc.close();
	}
}

class Article {
	int id;
	String title;
	String body;

	Article(int id, String title, String body) {
		this.id = id;
		this.title = title;
		this.body = body;
	}
}