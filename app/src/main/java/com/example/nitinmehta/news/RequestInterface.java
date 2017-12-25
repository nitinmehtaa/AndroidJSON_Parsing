package com.example.nitinmehta.news;


import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by NitinMehta on 25/12/2017.
 */

public interface RequestInterface {

    @GET("android/jsonandroid")
    Call<JSONResponse> getJSON();
}
