package com.example.recyclerviewbexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerContactAdapter extends RecyclerView.Adapter<RecyclerContactAdapter.VeiwHolder> {
    Context context;
    ArrayList<Contact_Structure> arr;
    RecyclerContactAdapter(Context contact_Context, ArrayList<Contact_Structure> arr){
        this.context = contact_Context;
        this.arr = arr;

    }

    @NonNull
    @Override
    public VeiwHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.contact_row, parent, false);
        VeiwHolder viewholder = new VeiwHolder(v);
        return viewholder;
    }

    @Override
    public void onBindViewHolder(@NonNull VeiwHolder holder, int position) {
        holder.img.setImageResource(arr.get(position).img);
        holder.txtNumber.setText(arr.get(position).ctNR);
        holder.txtName.setText(arr.get(position).ctNM);

    }

    @Override
    public int getItemCount() {
        return arr.size();
    }

    public class VeiwHolder extends RecyclerView.ViewHolder{           // we can give any name because it holds reference of viewholder so we give it name as viewholder
        TextView txtName , txtNumber;
        ImageView img;
        public VeiwHolder(@NonNull View itemView) {
            super(itemView);

            img = itemView.findViewById(R.id.imgv);
            txtName = itemView.findViewById(R.id.cnctnam);
            txtNumber = itemView.findViewById(R.id.cnctnum);


        }

    }
}
