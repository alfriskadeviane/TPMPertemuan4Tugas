package com.example.tpmpertemuan4;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {
    private BottomNavigationView bnvMain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bnvMain= findViewById(R.id.bnvMain);
        bnvMain.setOnNavigationItemSelectedListener(this);
        setLayout(new PahlawanFragment());
    }

     public void setLayout(Fragment fragment)
     {
        getSupportFragmentManager().beginTransaction().replace(R.id.flMain, fragment).commit();
     }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId())
        {
            case R.id.iPahlawan:
            setLayout(new PahlawanFragment());
            return true;

            case R.id.iBiodata:
                setLayout(new BiodataFragment());
                return true;
        }

        return false;
    }
}
