package com.mjolnir.textscanningapp;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.hololo.tutorial.library.Step;
import com.hololo.tutorial.library.TutorialActivity;

public class onBoardingScreen extends TutorialActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        addFragment(new Step.Builder().setTitle("Image to Text Scanner")
                .setContent("Recognize Text in Images with ML Kit on Android")
                .setBackgroundColor(Color.parseColor("#6C63FF")) // int background color
                .setDrawable(R.drawable.onboard_scan) // int top drawable
                .setSummary("Captures images, recognizes text using ML Kit's text recognition, and displays the recognized text on the screen.")
                .build());

        addFragment(new Step.Builder().setTitle("Copy Text to Clipboard")
                .setContent("Copy text to ClipBoard")
                .setBackgroundColor(Color.parseColor("#6C63FF")) // int background color
                .setDrawable(R.drawable.onboard_copy) // int top drawable
                .setSummary("To copy data to the clipboard, get a handle to the global ClipboardManager object, create a ClipData object, and add a ClipDescription and one or more ClipData")
                .build());

        addFragment(new Step.Builder().setTitle("Save the Copied Text")
                .setContent("Save the Copied Text")
                .setBackgroundColor(Color.parseColor("#6C63FF")) // int background color
                .setDrawable(R.drawable.onboard_save) // int top drawable
                .setSummary("Save copied text from the app to a file for future reference.")
                .build());
    }


    @Override
    public void finishTutorial() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }


    @Override
    public void currentFragmentPosition(int position) {

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }
}