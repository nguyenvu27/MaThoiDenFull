package com.example.mathoidenfull.adapter;

public class Face {
    private String mName ;
    private int mResId ;

    public Face(String name, int resId) {
        this.mName = name;
        this.mResId = resId;
    }

    public String getName() {
        return mName;
    }

    public int getResId() {
        return mResId;
    }
}
