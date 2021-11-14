package com.vishal.kaitka.linkpreviewlib;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

import io.reactivex.rxjava3.core.Observable;

/**
 * Created by Vishal on 14,November,2021
 */
public class DataUtility {
    public static Observable<Document> getJSoupContent(String url) {
        return Observable.fromCallable(() -> {
            try {
                Document document = Jsoup.connect(url).timeout(0)
                        .get();
                return document;
            } catch (IOException exception) {
                throw new RuntimeException(exception);
            }
        });
    }
}
