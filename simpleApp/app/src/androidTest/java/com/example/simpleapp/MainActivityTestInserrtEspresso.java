package com.example.simpleapp;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.MediumTest;
import androidx.test.filters.SmallTest;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
@MediumTest
public class MainActivityTestInserrtEspresso {
    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule=new ActivityTestRule<MainActivity>(MainActivity.class);

    @Test
    @SmallTest
    public void TextView_Test1(){
        onView(withId(R.id.title)).check(matches(isDisplayed()));

    }

    @Test
    @SmallTest
    public void TextView_Test2(){
        onView(withId(R.id.title)).check(matches(withText("Student Details")));

    }

    @Test
    @SmallTest
    public void enter_rollNumber(){
        onView(withId(R.id.Rollno)).perform(typeText("144197"));

    }
    @Test
    @SmallTest
    public void enter_Name(){
        onView(withId(R.id.Name)).perform(typeText("Bullah Shah"));

    }
    @Test
    @SmallTest
    public void enter_Marks(){
        onView(withId(R.id.Marks)).perform(typeText("405"));

    }

    @Test
    @SmallTest
    public void insert(){
        onView(withId(R.id.Insert)).perform(click()).check(matches(isDisplayed()));

    }
    @Test
    @SmallTest
    public void enter_rollNumber1(){
        onView(withId(R.id.Rollno)).perform(typeText("144197"));

    }
    @Test
    @SmallTest
    public void view(){
        onView(withId(R.id.Rollno)).perform(typeText("144197"));
        onView(withId(R.id.Name)).perform(typeText("Shahid Afridi"));
        onView(withId(R.id.Marks)).perform(typeText("556"));
        onView(withId(R.id.Insert)).perform(click()).check(matches(isDisplayed()));
        onView(withId(R.id.Rollno)).perform(typeText("144197"));
        onView(withId(R.id.View)).perform(click()).check(matches(isDisplayed()));

    }







}
