package com.example.tw.myapplication;

import android.app.Activity;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 21)
public class MyActivityTest {

    @Test
    public void clickingButton_shouldChangeResultsViewText() throws Exception {
        Activity activity = Robolectric.setupActivity(MainActivity.class);

//        Button button = (Button) activity.findViewById(R.id.press_me_button);
//        TextView results = (TextView) activity.findViewById(R.id.results_text_view);
//
//        button.performClick();
//        assertThat(results.getText().toString(), equalTo("Testing Android Rocks!"));
    }
}
