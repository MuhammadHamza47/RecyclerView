package com.example.recyclerview.MyAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.Models.FoodModel;
import com.example.recyclerview.R;

import java.util.ArrayList;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.ViewHolder> {

    ArrayList<FoodModel> arrayList;
    Context context;

    public FoodAdapter(ArrayList<FoodModel> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Inflate the layout for a single food item view
        View itemView = LayoutInflater.from(context).inflate(R.layout.recyclerview1, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        // Get the data for the current position
        FoodModel foodModel = arrayList.get(position);

        // Set the image and text for the food item
        holder.imageView.setImageResource(foodModel.getImages1());
        holder.textView.setText(foodModel.getText());

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            // Initialize the views
            imageView = itemView.findViewById(R.id.imageView2);
            textView = itemView.findViewById(R.id.textView);

        }
    }
}
