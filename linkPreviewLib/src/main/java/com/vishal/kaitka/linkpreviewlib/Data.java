package com.vishal.kaitka.linkpreviewlib;

/**
 * Created by Vishal on 14,November,2021
 */
public class Data {
    private String imageUrl, title, siteUrl, description;


    public Data() {
    }

    public String getImageUrl() {
        return imageUrl;
    }

    protected void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getTitle() {
        return title;
    }

    protected void setTitle(String title) {
        this.title = title;
    }

    public String getSiteUrl() {
        return siteUrl;
    }

    protected void setSiteUrl(String siteUrl) {
        this.siteUrl = siteUrl;
    }

    public String getDescription() {
        return description;
    }

    protected void setDescription(String description) {
        this.description = description;
    }
}
