package observerPattern;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements NewsAgencySubject {
    private List<SubscriberObserver> observerList = new ArrayList<>();

    @Override
    public void addObserver(SubscriberObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(SubscriberObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers(String news) {
        for (SubscriberObserver observer : observerList) {
            observer.update(news);
        }
    }

    public void publishNews(String news) {
        System.out.println();
        System.out.println("Breaking News: " + news);
        notifyObservers(news);
    }
}
