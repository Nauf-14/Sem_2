package org.example.subscriber;

public class YandexSub_2 implements Subscriber {
    private final String name;

    public YandexSub_2(String name) {
        this.name = name;
    }

    @Override
    public void receivingNews(String news) {
        System.out.println("Подписчик "+ name + " узнал новость: " + news);

    }
}
