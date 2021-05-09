package com.electroteach.datepredictor;
// Thu Jul 09 22:45:15 AEST 2020
// Saturday 10 April  14:03:12 AEST 2021
// DatePredictor

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.bottomnavigation.BottomNavigationView;
/*
TODO    java.lang.RuntimeException:
    Unable to start activity ComponentInfo{com.electroteach.datepredictor/com.electroteach.datepredictor.MainActivity}:
     java.lang.IllegalStateException:
      Activity com.electroteach.datepredictor.MainActivity@ff6aab7 does not have a NavController set on 2131230987

 */
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(navView, navController);
    }

}
