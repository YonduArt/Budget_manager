package com.example.emanager.views.activites;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.emanager.utils.Constants;
import com.example.emanager.viewmodels.MainViewModel;
import com.example.emanager.R;
import com.example.emanager.databinding.ActivityMainBinding;
import com.example.emanager.views.fragments.StatsFragment;
import com.example.emanager.views.fragments.TransactionsFragment;
import com.example.emanager.views.fragments.CategoriesFragment;
import com.example.emanager.views.fragments.SettingsFragment;
import com.google.android.material.navigation.NavigationBarView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    Calendar calendar;
    /*
    0 = Daily
    1 = Monthly
    2 = Calendar
    3 = Summary
    4 = Notes
     */


    public MainViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        viewModel = new ViewModelProvider(this).get(MainViewModel.class);



        setSupportActionBar(binding.toolBar);
        getSupportActionBar().setTitle("Операции");


        Constants.setCategories();
        Constants.setCategoriesExpense();
        Constants.setCategoriesIncome();

        calendar = Calendar.getInstance();

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.content, new TransactionsFragment());
        transaction.commit();

        binding.bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

                Fragment currentFragment = getSupportFragmentManager().findFragmentById(R.id.content);

                if (item.getItemId() == R.id.transactions) {
                    if (!(currentFragment instanceof TransactionsFragment)) {
                        transaction.replace(R.id.content, new TransactionsFragment());
                    }
                } else if (item.getItemId() == R.id.stats) {
                    if (!(currentFragment instanceof StatsFragment)) {
                        transaction.replace(R.id.content, new StatsFragment());
                        transaction.addToBackStack(null);
                    }
                }

                transaction.commit();
                return true;
            }
        });


    }

    public void getTransactions() {
        viewModel.getTransactions(calendar);
    }





    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.top_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }
}