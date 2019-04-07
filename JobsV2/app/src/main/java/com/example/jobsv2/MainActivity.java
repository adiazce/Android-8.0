package com.example.jobsv2;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bnMenu ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bnMenu = findViewById(R.id.bnMenu);

        bnMenu.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.action_search :
                       // Toast.makeText(MainActivity.this,"1",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.action_favorites :
                       // Toast.makeText(MainActivity.this,"2",Toast.LENGTH_SHORT).show();
                        break;
                        default:
                            return  false;
                }

                return true;
            }
        });
    }




}