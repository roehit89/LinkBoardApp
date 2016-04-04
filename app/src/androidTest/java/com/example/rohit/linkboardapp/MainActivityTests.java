package com.example.rohit.linkboardapp;

import android.test.ActivityInstrumentationTestCase2;
import android.test.TouchUtils;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Rohit on 4/3/2016.
 */
public class MainActivityTests extends ActivityInstrumentationTestCase2<MainActivity> {

    public MainActivityTests() {
        super(MainActivity.class);
    }

    public void testActivityExists(){
        MainActivity mainActivity = getActivity();
        assertNotNull(mainActivity);
    }


    public void testButtonCreateUser(){
        MainActivity activity = getActivity();
        Button button = (Button) activity.findViewById(R.id.create_user);
        final EditText editText = (EditText) activity.findViewById(R.id.create_user_textView);

        getInstrumentation().runOnMainSync(new Runnable() {
            @Override
            public void run() {
                editText.requestFocus();

            }
        });




        getInstrumentation().waitForIdleSync();
        getInstrumentation().sendStringSync("Jake");
        getInstrumentation().waitForIdleSync();
        TouchUtils.clickView(this, button);
        assertEquals(editText.getText().toString(), "asd");
    }
}
