package com.bitcode.recyclerview;

import android.graphics.Color;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CitiesAdapter extends RecyclerView.Adapter<CitiesAdapter.CityViewHolder> {

    private ArrayList<String> cities;

    public CitiesAdapter(ArrayList<String> cities){
        this.cities = cities;
    }

    class CityViewHolder extends RecyclerView.ViewHolder{

        public TextView txtCity;
        public CityViewHolder(@NonNull View itemView) {
            super(itemView);
            txtCity = (TextView) itemView;
        }
    }

    @NonNull
    @Override
    public CitiesAdapter.CityViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Log.e("tag","onCreateViewHolder");
        TextView txtCity = new TextView(parent.getContext());
        txtCity.setTextSize(30);
        txtCity.setLayoutParams(new ViewGroup.LayoutParams
                        (ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT));
        txtCity.setPadding(30,10,10,10);
        txtCity.setTextColor(Color.BLACK);
        return new CityViewHolder(txtCity);
    }

    @Override
    public void onBindViewHolder(@NonNull CitiesAdapter.CityViewHolder holder, int position) {
        Log.e("tag","onBindViewHolder" + position);
        holder.txtCity.setText(cities.get(position));
    }

    @Override
    public int getItemCount() {
        Log.e("tag","getItemCount" + cities.size());
        return cities.size();
    }
}
