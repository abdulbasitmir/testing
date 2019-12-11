package com.example.simpleapp;

import android.widget.Button;

import androidx.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule=new ActivityTestRule<MainActivity>(MainActivity.class);
    private MainActivity mActivity=null;

    @Before
    public void setUp() throws Exception {
        mActivity=mActivityTestRule.getActivity();
    }
    @Test
    public void inserButtonTest(){
        Button btn=mActivity.findViewById(R.id.Rollno);
        assertNotNull(btn);


    }
    @Test
    public void insertButtonTest(){
        Button btn=mActivity.findViewById(R.id.Delete);
        assertNotNull(btn);


    }
    @Test
    public void deleteButtonTest(){
        Button btn=mActivity.findViewById(R.id.Update);
        assertNotNull(btn);


    }
    @Test
    public void updateButtonTest(){
        Button btn=mActivity.findViewById(R.id.View);
        assertNotNull(btn);


    }
    @Test
    public void viewButtonTest(){
        Button btn=mActivity.findViewById(R.id.ViewAll);
        assertNotNull(btn);


    }
    @Test
    public void viewAllButtonTest(){
        Button btn=mActivity.findViewById(R.id.Rollno);
        assertNotNull(btn);


    }

    @After
    public void tearDown() throws Exception {
        mActivity=null;
    }
}