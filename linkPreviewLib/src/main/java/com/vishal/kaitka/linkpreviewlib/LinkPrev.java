package com.vishal.kaitka.linkpreviewlib;

import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.schedulers.Schedulers;

/**
 * Created by Vishal on 14,November,2021
 */
public class LinkPrev {
    public static void getUrlDetails(String urlOfSite, ResultListener resultListener) {
        DataUtility.getJSoupContent(urlOfSite)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(result -> {
                    if (result != null) {
                        Elements metaTags = result.getElementsByTag("meta");
                        Data data = new Data();
                        for (Element element : metaTags) {
                            if (element.attr("property").equals("og:image"))
                                data.setImageUrl(element.attr("content"));
                            else if (element.attr("name").equals("title"))
                                data.setTitle(element.attr("content"));
                            else if (element.attr("name").equals("description"))
                                data.setDescription(element.attr("content"));
                            else if (element.attr("property").equals("og:url"))
                                data.setSiteUrl(element.attr("content"));
                        }
                        resultListener.onResultSuccess(data);
                    }

                }, resultListener::onResultFailed);
    }

    public interface ResultListener {
        void onResultSuccess(Data urlData);

        void onResultFailed(Throwable e);
    }


}
