package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


public class BlankFragment extends Fragment {
    Button btn;
    MyMonth[] makeMonth() {
        MyMonth[] arr = new MyMonth[52];

// Названия месяцев
        int[] monthArr = {101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,201,202,203,204,205,206,207,208,209,210,211,212,213,214,215,216,217,301,302,303,304,305,306,307,308,309,310,311,312,313,314,315,316,317};
// Среднесуточная температура
        String[] tempArr = {"5A","5B","5V","6A","6B","6V","7A","7B","7V","8A","8B","8V","9A","9B","9V","10A","10B","10V","11A","11B","11V"};
// Количество дней
        String[] dayArr = {"MATH","CHEMISTRY","PHYSICS","ART","RUSSIAN","ENGLISH","PE","C++","OBH"};

// Сборка месяцев
        for (int i = 0; i < arr.length; i++) {
            MyMonth month = new MyMonth();
            month.month = monthArr[i];
            month.temp = "";
            month.days = "";
            arr[i] = month;
        }
        return arr;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_blank, container, false);
        MyMonthAdapter adapter = new MyMonthAdapter(getContext(), makeMonth());
        ListView lv = view.findViewById(R.id.list);
        lv.setAdapter(adapter);

        return view;
    }
}