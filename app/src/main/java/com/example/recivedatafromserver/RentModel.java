package com.example.recivedatafromserver;

import android.net.Uri;

public class RentModel {


    private String title;
    private String image;
//
//    public RentModel(String title, Uri image) {
//        this.title = title;
//        this.image = image;
//    }


    public RentModel(String title) {
        this.title = title;
    }
    public RentModel(){

    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getImage() {
        return image;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
