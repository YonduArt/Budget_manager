package com.example.emanager.views.fragments;

import static com.example.emanager.utils.Constants.SELECTED_STATS_TYPE;

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
import com.example.emanager.databinding.FragmentCategoriesBinding;
import com.example.emanager.databinding.FragmentStatsBinding;
import com.example.emanager.utils.Constants;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;
import com.example.emanager.R;

public class CategoriesFragment extends Fragment {

    public FragmentCategoriesBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentCategoriesBinding.inflate(inflater);
        View rootView = binding.getRoot(); // Получение корневого вида

        binding.incomeBtn.setOnClickListener(view -> {
            binding.incomeBtn.setBackground(getContext().getDrawable(R.drawable.income_selector));
            binding.expenseBtn.setBackground(getContext().getDrawable(R.drawable.default_selector));
            binding.expenseBtn.setTextColor(getContext().getColor(R.color.textColor));
            binding.incomeBtn.setTextColor(getContext().getColor(R.color.greenColor));

            // Предполагается, что у вас уже есть объявление SELECTED_STATS_TYPE в вашем классе
            SELECTED_STATS_TYPE = Constants.INCOME;
        });

        binding.expenseBtn.setOnClickListener(view -> {
            binding.incomeBtn.setBackground(getContext().getDrawable(R.drawable.default_selector));
            binding.expenseBtn.setBackground(getContext().getDrawable(R.drawable.expense_selector));
            binding.incomeBtn.setTextColor(getContext().getColor(R.color.textColor));
            binding.expenseBtn.setTextColor(getContext().getColor(R.color.redColor));

            // Предполагается, что у вас уже есть объявление SELECTED_STATS_TYPE в вашем классе
            SELECTED_STATS_TYPE = Constants.EXPENSE;
        });

        return rootView; // Возвращаем корневой вид
    }
}

