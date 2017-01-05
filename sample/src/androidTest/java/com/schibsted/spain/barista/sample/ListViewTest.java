package com.schibsted.spain.barista.sample;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static com.schibsted.spain.barista.BaristaAssertions.assertTextIsDisplayed;
import static com.schibsted.spain.barista.BaristaListViewActions.clickListViewItem;

@RunWith(AndroidJUnit4.class)
public class ListViewTest {

    @Rule
    public ActivityTestRule<ListViewActivity> activityRule = new ActivityTestRule<>(ListViewActivity.class);

    @Test
    public void checkClickListViewItem_withFirstItem() {
        clickListViewItem(R.id.listview, String.class, 0);
        assertTextIsDisplayed("Banana");
    }

    @Test
    public void checkClickListViewItem_withFourthItem() {
        clickListViewItem(R.id.listview, String.class, 3);
        assertTextIsDisplayed("Raspberry");
    }
}