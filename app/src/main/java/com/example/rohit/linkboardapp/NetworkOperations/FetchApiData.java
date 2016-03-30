package com.example.rohit.linkboardapp.NetworkOperations;

import android.text.Annotation;
import android.util.Log;

import com.example.rohit.linkboardapp.Model.Model;
import com.example.rohit.linkboardapp.Model.UserLoginModel;
import com.squareup.okhttp.ResponseBody;

import java.io.IOException;

import java.util.HashMap;
import java.util.List;

import retrofit.Call;
import retrofit.Callback;
import retrofit.Converter;
import retrofit.Response;
import retrofit.Retrofit;

/**
 * Created by Rohit on 3/27/2016.
 */
public class FetchApiData {

    String Tag = "FetchedData";

    Model userModelObject;
    UserLoginModel userLoginModelObject;

//    String username = "testuseruser";
//    String org_id = "1";
//    String email = "rbk8@njit.edu";

    HashMap<String, String> newUserMap = new HashMap<>();


    public Model createUser(HashMap map) {

        LinkboardClient client = ServiceGenerator.createService(LinkboardClient.class);



        Call<Model> call = client.createUser(map);
        try {
            userModelObject = call.execute().body();
            Log.i("usenme",userModelObject.data.getEmail());
        } catch (IOException e) {
            Log.i(Tag + " myError", e.toString());
        }
        if(userModelObject == null)
            return null;
        else
            return userModelObject;
    }

    public UserLoginModel loginUser(HashMap map){

        LinkboardClient client = ServiceGenerator.createService(LinkboardClient.class);

        Call<UserLoginModel> call = client.loginUser(map);
        try {
            userLoginModelObject = call.execute().body();
        } catch (IOException e) {
            Log.i(Tag + " myError", e.toString());
        }
        if(userLoginModelObject == null)
            return null;
        else
            return userLoginModelObject;
    }

    }

