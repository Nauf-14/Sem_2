package org.example;

import org.example.provider.NewBishkek;
import org.example.provider.Newspaper;
import org.example.provider.Yandex;
import org.example.subscriber.Subscriber;
import org.example.subscriber.YandexSub_1;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Newspaper newspaper = new Yandex();
        Subscriber yandex1 = new YandexSub_1("Naufal");
        Subscriber yandex2 = new YandexSub_1("Dilnoza");
        newspaper.subscription(yandex1);
        newspaper.subscription(yandex2);
        newspaper.notification("Пришла весна!");
        newspaper.unsubscribe(yandex2);
        newspaper.notification("Скоро Праздник весны-8 марта!");
        Newspaper bishkek = new NewBishkek();
        bishkek.subscription(yandex1);
        bishkek.subscription(yandex2);
        bishkek.notification("В Бишкеке наканец-то потеплело!");
        newspaper.notification("Сегодня в мир пришел Мир!");
    }
}