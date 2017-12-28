package com.example.nitinmehta.news;

import java.util.ArrayList;

/**
 * Created by NitinMehta on 25/12/2017.
 */

public class JSONResponse {

    private ArrayList<AndroidVersion> android;

    public JSONResponse(ArrayList<AndroidVersion> android) {
        this.android = android;
    }

    public ArrayList<AndroidVersion> getAndroid() {
        return android;
    }

    @Override
    public String toString() {
        return "JSONResponse{" +
                "android=" + android +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        JSONResponse that = (JSONResponse) o;

        return android != null ? android.equals(that.android) : that.android == null;
    }

    @Override
    public int hashCode() {
        return android != null ? android.hashCode() : 0;
    }
}
