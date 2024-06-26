package com.example.taskwan;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
//        ImageButton previousBtn = (ImageButton) findViewById(R.id.previous_btn);
//        previousBtn.setVisibility(View.GONE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {

            // Add the fragment to the fragment_container_view
            getSupportFragmentManager().beginTransaction()
                    .setReorderingAllowed(true)
                    .add(R.id.fragment_container_view, LoginForm.class, null)
                    .commit();
        }
    }


}

