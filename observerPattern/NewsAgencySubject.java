package observerPattern;

public interface NewsAgencySubject {
    void addObserver(SubscriberObserver observer);
    void removeObserver (SubscriberObserver observer);
    void notifyObservers (String news);
}
