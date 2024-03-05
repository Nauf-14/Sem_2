package org.example.provider;

import org.example.subscriber.Subscriber;

import java.util.ArrayList;
import java.util.List;


public class NewBishkek extends AbstractNews {
    @Override
    public void notification(String news) {
        for (Subscriber subscriber : subscribers){
            subscriber.receivingNews(news + " от газеты Бишкек");
        }

    }

}
