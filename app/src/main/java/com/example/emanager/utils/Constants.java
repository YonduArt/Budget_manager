package com.example.emanager.utils;

import com.example.emanager.R;
import com.example.emanager.models.Category;

import java.util.ArrayList;

public class Constants {
    public static String INCOME = "INCOME";
    public static String EXPENSE = "EXPENSE";

    public static ArrayList<Category> categoriesIncome;
    public static ArrayList<Category> categoriesExpense;
    public static ArrayList<Category> categories;


    public static int DAILY = 0;
    public static int MONTHLY = 1;
    public static int CALENDAR = 2;
    public static int SUMMARY = 3;
    public static int NOTES = 4;

    public static int SELECTED_TAB = 0;
    public static int SELECTED_TAB_STATS = 0;
    public static String SELECTED_STATS_TYPE = Constants.INCOME;

    public static void setCategoriesIncome() {
        categoriesIncome = new ArrayList<>();
        categoriesIncome.add(new Category("Заплата", R.drawable.ic_salary, R.color.category1));
        categoriesIncome.add(new Category("Стипендия", R.drawable.ic_scholarship, R.color.category2));
        categoriesIncome.add(new Category("Бизнес", R.drawable.ic_business, R.color.category3));
        categoriesIncome.add(new Category("Инвестиции", R.drawable.ic_investment, R.color.category5));
        categoriesIncome.add(new Category("Кэшбек", R.drawable.ic_cashback, R.color.category6));
        categoriesIncome.add(new Category("Прочее", R.drawable.ic_other, R.color.category6));
    }


    public static void setCategories() {
        categories = new ArrayList<>();
        categories.add(new Category("Рестораны", R.drawable.ic_restaurant, R.color.category1));
        categories.add(new Category("Заплата", R.drawable.ic_salary, R.color.category2));
        categories.add(new Category("Развлечения", R.drawable.ic_entertainment, R.color.category2));
        categories.add(new Category("Транспорт", R.drawable.ic_transport, R.color.category2));
        categories.add(new Category("Здоровье", R.drawable.ic_health, R.color.category2));
        categories.add(new Category("Стипендия", R.drawable.ic_scholarship, R.color.category3));
        categories.add(new Category("Бизнес", R.drawable.ic_business, R.color.category3));
        categories.add(new Category("Инвестиции", R.drawable.ic_investment, R.color.category5));
        categories.add(new Category("Еда", R.drawable.ic_food, R.color.category6));
        categories.add(new Category("Кэшбек", R.drawable.ic_cashback, R.color.category6));
        categories.add(new Category("Прочее", R.drawable.ic_other, R.color.category6));
    }
    public static void setCategoriesExpense() {
        categoriesExpense = new ArrayList<>();
        categoriesExpense.add(new Category("Еда", R.drawable.ic_food, R.color.category1));
        categoriesExpense.add(new Category("Рестораны", R.drawable.ic_restaurant, R.color.category2));
        categoriesExpense.add(new Category("Транспорт", R.drawable.ic_transport, R.color.category3));
        categoriesExpense.add(new Category("Развлечения", R.drawable.ic_entertainment, R.color.category5));
        categoriesExpense.add(new Category("Здоровье", R.drawable.ic_health, R.color.category6));
        categoriesExpense.add(new Category("Прочее", R.drawable.ic_other, R.color.category6));
    }


    public static Category getCategoryDetails(String categoryName) {
        for (Category cat :
                categories) {
            if (cat.getCategoryName().equals(categoryName)) {
                return cat;
            }
        }
        return null;
    }


    public static int getAccountsColor(String accountName) {
        switch (accountName) {
            case "Bank":
                return R.color.bank_color;
            case "Cash":
                return R.color.cash_color;
            case "Card":
                return R.color.card_color;
            default:
                return R.color.default_color;
        }
    }
}
