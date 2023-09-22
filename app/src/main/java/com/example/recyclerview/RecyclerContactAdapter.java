package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerContactAdapter extends RecyclerView.Adapter<RecyclerContactAdapter.ViewHolder> {
    Context context;
    ArrayList<Contact_Model> arrcontact;
    public RecyclerContactAdapter (Context context , ArrayList<Contact_Model> arrcontact) {
        this.context = context;
        this.arrcontact = arrcontact;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.card_view, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.card_image.setImageResource(arrcontact.get(position).img);
        holder.card_name.setText(arrcontact.get(position).name);
        holder.card_number.setText(arrcontact.get(position).number);
    }

    @Override
    public int getItemCount() {
        return arrcontact.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView card_name , card_number;
        ImageView card_image;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            card_name = itemView.findViewById(R.id.card_name);
            card_number = itemView.findViewById(R.id.card_number);
            card_image = itemView.findViewById(R.id.card_image);
        }
    }
}
