package com.example.rohit.linkboardapp.NetworkOperations;

import com.squareup.okhttp.OkHttpClient;

import retrofit.GsonConverterFactory;

import retrofit.Retrofit;


/**
 * Created by Rohit on 3/27/2016.
 */
public class ServiceGenerator {

    static final String API_BASE_URL = "http://release.linkboard.com/";

    private static OkHttpClient httpClient = new OkHttpClient();
    private static Retrofit.Builder builder =
            new Retrofit.Builder()
                    .baseUrl(API_BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create());

    public static <S> S createService(Class<S> serviceClass) {
        Retrofit retrofit = builder.client(httpClient).build();
        return retrofit.create(serviceClass);


    }
}