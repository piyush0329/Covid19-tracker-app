package com.example.covid19;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class Adapter extends ArrayAdapter<Model> {
    private Context context;
    private List<Model> modelList;

    public Adapter(Context context, List<Model> modelList) {
        super(context, R.layout.testing, modelList);

        this.context = context;
        this.modelList = modelList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.testing, null,true);

        // Hooks
        TextView state = view.findViewById(R.id.cityname);
        TextView active = view.findViewById(R.id.active);
        TextView confirmed = view.findViewById(R.id.confirm);
        TextView deceased = view.findViewById(R.id.deceased);
        TextView recovered = view.findViewById(R.id.recovered);

        TextView dconfirmed = view.findViewById(R.id.dconfirm);
        TextView ddeceased = view.findViewById(R.id.ddeceased);
        TextView drecovered = view.findViewById(R.id.drecovered);

        // Adding Data to modelList
        state.setText(modelList.get(position).getName());
        active.setText(modelList.get(position).getActive());
        confirmed.setText(modelList.get(position).getConfirmed());
        deceased.setText(modelList.get(position).getDeceased());
        recovered.setText(modelList.get(position).getRecovered());

        dconfirmed.setText(modelList.get(position).getDconfirmed());
        ddeceased.setText(modelList.get(position).getDdeceased());
        drecovered.setText(modelList.get(position).getDrecovered());

        return view;
    }
}