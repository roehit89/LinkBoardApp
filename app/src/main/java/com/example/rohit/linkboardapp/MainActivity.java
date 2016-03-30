package com.example.rohit.linkboardapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

import com.example.rohit.linkboardapp.Model.Model;
import com.example.rohit.linkboardapp.Model.UserLoginModel;
import com.example.rohit.linkboardapp.NetworkOperations.FetchApiData;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    FetchApiData fetchApiData;
    HashMap<String, String> newUserMap = new HashMap<>();
    HashMap<String, String> loginUserMap = new HashMap<>();
    Model userModelObject;
    UserLoginModel userLoginModelObject;
    String Tag = "MainActivity";
    Button createUserButton;
    Button loginUserButton;
    EditText createUserText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        loginUserButton = (Button) findViewById(R.id.login_button);
        createUserButton = (Button) findViewById(R.id.create_user);
        createUserText = (EditText) findViewById(R.id.create_user_textView);



        fetchApiData = new FetchApiData();

        createUserButton.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    new Thread(new Runnable() {
                                                        @Override
                                                        public void run() {
                                                            String username = String.valueOf(createUserText.getText());

                                                            newUserMap.put("username", username);
                                                            newUserMap.put("email", "rbk8@njit.edu");
                                                            newUserMap.put("password", "$2y$10$nxrghfKzU5uyJMoNcz22Y.TRNWllLHtEXnZhMSOiRLaSEaquZMLeq");
                                                            newUserMap.put("organization_id", "1");
                                                            newUserMap.put("role_id", "2");

                                                            userModelObject = fetchApiData.createUser(newUserMap);

                                                            if (userModelObject != null) {
                                                                Log.i(Tag + " user result fname", String.valueOf(userModelObject.data.getUsername()));
                                                                Log.i(Tag + " user result name", String.valueOf(userModelObject.data.getCreated_at()));
                                                                Log.i(Tag + " user result created", String.valueOf(userModelObject.data.getId()));
                                                            } else {
                                                                Log.i("user already in use", "user already in use");
                                                            }
                                                        }
                                                    }).start();
                                                }
                                            });

        loginUserButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        String username = String.valueOf(createUserText.getText());

                        loginUserMap.put("username", username);
                        loginUserMap.put("password", "$2y$10$nxrghfKzU5uyJMoNcz22Y.TRNWllLHtEXnZhMSOiRLaSEaquZMLeq");

                        userLoginModelObject = fetchApiData.loginUser(loginUserMap);

                        Log.i(Tag + "user email", userLoginModelObject.getData().getEmail());
                        Log.i(Tag + "user id", userLoginModelObject.getData().getId());
                    }
                }).start();
            }
        });
    }
}

