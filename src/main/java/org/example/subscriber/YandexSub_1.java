package org.example.subscriber;

public class YandexSub_1 implements Subscriber {
    private final String name;

    public YandexSub_1(String name) {
        this.name = name;
    }

    @Override
    public void receivingNews(String news) {
        System.out.println("Подписчик "+ name + " узнал новость: " + news);

    }
}
