package com.example.work1;
import android.os.Bundle;
import androidx.fragment.app.Fragment;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class fragment1 extends Fragment{
    private View view;
    private Myadapter myadapter;
    private RecyclerView recyclerView;
    private List<String> list1;

    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.tab1, container, false);
        recyclerView = view.findViewById(R.id.recycleview);
        list1 = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            list1.add("这是第" + i + "行数据");
        }
        myadapter = new Myadapter(view.getContext(), list1);
        LinearLayoutManager manager = new LinearLayoutManager(view.getContext());
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(myadapter);
        return view;
    }
}