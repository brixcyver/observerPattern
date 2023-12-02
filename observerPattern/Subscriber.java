package observerPattern;

public class Subscriber implements SubscriberObserver {
    private String subName;

    public Subscriber (String name) {
        this.subName = name;
    }

    @Override
    public void update(String news) {
        System.out.println(subName + " received news: " + news);
    }
}
