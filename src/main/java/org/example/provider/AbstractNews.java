package org.example.provider;

import org.example.subscriber.Subscriber;

import java.util.ArrayList;

import java.util.List;

public abstract class  AbstractNews implements Newspaper {
    List<Subscriber> subscribers = new ArrayList<>();
    @Override
    public void subscription(Subscriber subscriber) {
        subscribers.add(subscriber);

    }

    @Override
    public void notification(String news) {
        for (Subscriber subscriber : subscribers){
            subscriber.receivingNews(news);
        }

    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);

    }
}
