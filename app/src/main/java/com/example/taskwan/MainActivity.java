package com.example.taskwan;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

//public class MainActivity extends AppCompatActivity {
//    ImageButton previousBtn;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        previousBtn = (ImageButton) findViewById(R.id.previous_btn);
////        previousBtn.setVisibility(View.GONE);
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//
//        if (savedInstanceState == null) {
//
//            // Add the fragment to the fragment_container_view
//            getSupportFragmentManager().beginTransaction()
//                    .setReorderingAllowed(true)
//                    .add(R.id.fragment_container_view, LoginForm.class, null)
//                    .commit();
//        }
//    }
//
//    private void switchFragmentBasedOnCondition() {
//        // Example condition: if FragmentOne is visible, show the button; otherwise hide it
//        Fragment currentFragment = getSupportFragmentManager().findFragmentById(R.id.fragment_container_view);
//        Fragment loginForm = getSupportFragmentManager().findFragmentById(R.id.login_form);
//        if (currentFragment instanceof loginForm) {
//            previousBtn.setVisibility(View.GONE);
//        } else {
//            previousBtn.setVisibility(View.VISIBLE);
//        }
//    }
//
//}

public class MainActivity extends AppCompatActivity {
    private ImageButton previousBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        previousBtn = findViewById(R.id.previous_btn);

        // Check if the loginForm fragment is already added
        Fragment loginFormFragment = getSupportFragmentManager().findFragmentById(R.id.login_form);
        System.out.println("visible: " + previousBtn.getVisibility());
        System.out.println("Login: " + loginFormFragment);
        switchFragmentBasedOnCondition();
        if (loginFormFragment == null) {
            // Add the LoginForm fragment to the fragment_container_view if it's not already added
            getSupportFragmentManager().beginTransaction()
                    .setReorderingAllowed(true)
                    .add(R.id.fragment_container_view, LoginForm.class, null)
                    .commit();
        }

        // Call the method to switch button visibility based on current fragment
    }

    private void switchFragmentBasedOnCondition() {
        // Check which fragment is currently attached
        Fragment currentFragment = getSupportFragmentManager().findFragmentById(R.id.fragment_container_view);
        System.out.println(currentFragment);
        if (currentFragment instanceof LoginForm) {
            previousBtn.setVisibility(View.GONE);
        } else {
            previousBtn.setVisibility(View.VISIBLE);
        }
    }
}

