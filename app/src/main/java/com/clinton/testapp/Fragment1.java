package com.clinton.testapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class Fragment1 extends Fragment {

    View view;

    private RecyclerView recyclerView;
    private List<item> listFragment1;

    public Fragment1() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment1,container,false);
        recyclerView = view.findViewById(R.id.frag1_rv);

        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(getContext(),listFragment1);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(recyclerViewAdapter);

        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        listFragment1 = new ArrayList<>();
        listFragment1.add(new item("num1","This is the 1 among the many details"));
        listFragment1.add(new item("num2","This is the 2 among the many details"));
        listFragment1.add(new item("num3","This is the 3 among the many details"));
        listFragment1.add(new item("num4","This is the 4 among the many details"));
        listFragment1.add(new item("num5","This is the 5 among the many details"));
        listFragment1.add(new item("num6","This is the 6 among the many details"));
        listFragment1.add(new item("num7","This is the 7 among the many details"));
        listFragment1.add(new item("num8","This is the 8 among the many details"));
        listFragment1.add(new item("num9","This is the 9 among the many details"));
        listFragment1.add(new item("num10","This is the 10 among the many details"));
        listFragment1.add(new item("num11","This is the 11 among the many details"));
        listFragment1.add(new item("num12","This is the 12 among the many details"));
        listFragment1.add(new item("num13","This is the 13 among the many details"));
        listFragment1.add(new item("num14","This is the 14 among the many details"));
        listFragment1.add(new item("num15","This is the 15 among the many details"));

    }
}
