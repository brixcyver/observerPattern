// observerPattern/Main.java
package observerPattern;

import java.util.Scanner;

public class NewsPatrol {
    public static void main(String[] args) {
        new NewsPatrol().run();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("======= Welcome to News Patrol =======");
        System.out.println();
        System.out.print("Enter the number of users to subscribe: ");
        int numUsers = scanner.nextInt();

        NewsAgency newsAgency = new NewsAgency();

        for (int i = 1; i <= numUsers; i++) {
            System.out.println();
            System.out.print("Enter the name for User " + i + ": ");
            String userName = scanner.next();

            System.out.print(userName + ", do you want to subscribe to News Patrol and receive up to date News? (yes/no): ");
            String subscribeChoice = scanner.next().toLowerCase();

            if ("yes".equals(subscribeChoice)) {
                Subscriber subscriber = new Subscriber(userName);
                newsAgency.addObserver(subscriber);
            }
        }

        System.out.println();
        System.out.println("News agency setup complete. Publishing news...");

        newsAgency.publishNews("Dollar to Peso exchange rate reached it's all time high!");
        newsAgency.publishNews("China's Pneumonia Outbreak Update, patient's number still racking up!");

    }
}
