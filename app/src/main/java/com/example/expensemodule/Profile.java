package com.example.expensemodule;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigator);
        bottomNavigationView.setSelectedItemId(R.id.profile);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.expenseModule:
                        startActivity(new Intent(getApplicationContext(), YourExpenses.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.income:
                        startActivity(new Intent(getApplicationContext(), IncomeModule.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.budget:
                        startActivity(new Intent(getApplicationContext(), MainActivity.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.reporting:
                        startActivity(new Intent(getApplicationContext(), ReportingModule.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.profile:
                        return true;
                }
                return false;
            }
        });
    }
}