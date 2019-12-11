package com.example.simpleapp;


import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.MediumTest;
import androidx.test.filters.SmallTest;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
@MediumTest
public class MainActivityTestDisplayEspresso {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule=new ActivityTestRule<MainActivity>(MainActivity.class);

    @Test
    @SmallTest
    public void is_RollNumber_Text_Displayed(){
        onView(withId(R.id.text1)).check(matches(isDisplayed()));

    }

    @Test
    @SmallTest
    public void is_RollNumber_Text_Matches(){
        onView(withId(R.id.text1)).check(matches(withText("Enter Rollno:")));

    }
    @Test
    @SmallTest
    public void is_Name_Text_Displayed(){
        onView(withId(R.id.text2)).check(matches(isDisplayed()));

    }
    @Test
    @SmallTest
    public void is_Name_Text_Matches(){
        onView(withId(R.id.text2)).check(matches(withText("Enter Name:")));

    }
    @Test
    @SmallTest
    public void is_Marks_Text_Displayed(){
        onView(withId(R.id.text3)).check(matches(isDisplayed()));

    }
    @Test
    @SmallTest
    public void is_Marks_Text_Matches(){
        onView(withId(R.id.text3)).check(matches(withText("Enter Marks:")));

    }

    //fields arepresent or not
    @Test
    @SmallTest
    public void Display_rollno_TextField(){
        onView(withId(R.id.Rollno)).check(matches(isDisplayed()));


    }
    @Test
    @SmallTest
    public void Display_Name_TextField(){
        onView(withId(R.id.Name)).check(matches(isDisplayed()));


    }

    @Test
    @SmallTest
    public void Display_Marks_TextField(){
        onView(withId(R.id.Marks)).check(matches(isDisplayed()));

    }
    //Buttons are available on Screen or not
    @Test
    @SmallTest
    public void insert_button(){
        onView(withId(R.id.Insert)).check(matches(isDisplayed()));

    }

    @Test
    @SmallTest
    public void delete_button(){
        onView(withId(R.id.Delete)).check(matches(isDisplayed()));

    }
    @Test
    @SmallTest
    public void update_button(){
        onView(withId(R.id.Update)).check(matches(isDisplayed()));

    }
    @Test
    @SmallTest
    public void view_button(){
        onView(withId(R.id.View)).check(matches(isDisplayed()));

    }
    @Test
    @SmallTest
    public void viewAll_button(){
        onView(withId(R.id.ViewAll)).check(matches(isDisplayed()));

    }
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

}
