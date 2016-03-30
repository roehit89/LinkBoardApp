package com.example.rohit.linkboardapp.NetworkOperations;

import com.example.rohit.linkboardapp.Model.Model;
import com.example.rohit.linkboardapp.Model.UserLoginModel;

import java.util.HashMap;
import java.util.List;

import retrofit.Call;
import retrofit.http.Body;
import retrofit.http.GET;
import retrofit.http.Headers;
import retrofit.http.POST;
import retrofit.http.Path;

/**
 * Created by Rohit on 3/27/2016.
 */
public interface LinkboardClient {

    @Headers({"Username: root", "Password: $2y$10$nxrghfKzU5uyJMoNcz22Y.TRNWllLHtEXnZhMSOiRLaSEaquZMLeq"})
    @POST("user")
    Call <Model> createUser(@Body HashMap map);

    //Model createUser(@Body FetchApiData.UserBody userBody);

    @Headers({"Username: root", "Password: $2y$10$nxrghfKzU5uyJMoNcz22Y.TRNWllLHtEXnZhMSOiRLaSEaquZMLeq"})
    @POST("login")
    Call <UserLoginModel> loginUser(@Body HashMap map);

}
