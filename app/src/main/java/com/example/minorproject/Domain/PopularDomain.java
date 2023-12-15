package com.example.minorproject.Domain;

import java.io.Serializable;

public class PopularDomain implements Serializable {
    public String title;
    public String description;
    public String picUrl;
    public int review;
    public int numberInCart;

    public int getNumberInCart() {
        return numberInCart;
    }

    public void setNumberInCart(int numberInCart) {
        this.numberInCart = numberInCart;
    }

    public double score;
    public double price;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public void setReview(int review) {
        this.review = review;
    }

    public void setScore(double score) {
        this.score = score;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public int getReview() {
        return review;
    }

    public double getScore() {
        return score;
    }


    public double getPrice() {
        return price;
    }

    public PopularDomain(String title, String description, String picUrl, int review, double score, double price) {
        this.title = title;
        this.description = description;
        this.picUrl = picUrl;
        this.review = review;
        this.score = score;
        this.price = price;
    }
}
