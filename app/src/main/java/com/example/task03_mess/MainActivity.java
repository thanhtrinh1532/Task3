package com.example.task03_mess;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            FragmentManager fragmentManager = getSupportFragmentManager();

            // Thêm HeaderFragment
            fragmentManager.beginTransaction()
                    .replace(R.id.header_fragment, new HeaderFragment())
                    .commit();

            // Thêm TabNavigationFragment
            fragmentManager.beginTransaction()
                    .replace(R.id.tab_navigation_fragment, new TabNavigationFragment())
                    .commit();

            // Thêm ContentFragment
            fragmentManager.beginTransaction()
                    .replace(R.id.content_fragment, new ContentFragment())
                    .commit();
        }
    }
}