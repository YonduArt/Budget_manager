package com.example.emanager.views.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import com.anychart.AnyChart;
import com.anychart.AnyChartView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;
import com.example.emanager.R;

public class SettingsFragment extends Fragment {

    private LinearLayout linearLayout;
    private TextView incomeBtn;
    private TextView expenseBtn;
    private ImageView emptyState;
    private TabLayout tabLayout;
    private AnyChartView anyChartView;
    private FloatingActionButton floatingActionButton;

    public SettingsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_categories, container, false);

        linearLayout = view.findViewById(R.id.linearLayout4);
        incomeBtn = view.findViewById(R.id.incomeBtn);
        expenseBtn = view.findViewById(R.id.expenseBtn);
        emptyState = view.findViewById(R.id.emptyState);
        tabLayout = view.findViewById(R.id.tabLayout);
        anyChartView = view.findViewById(R.id.anyChart);
        floatingActionButton = view.findViewById(R.id.floatingActionButton);

        // Your code for handling button clicks, tab selection, AnyChart configuration, etc.

        return view;
    }
}
