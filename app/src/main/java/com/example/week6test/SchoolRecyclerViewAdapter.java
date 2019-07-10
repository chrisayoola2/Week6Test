package com.example.week6test;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SchoolRecyclerViewAdapter extends RecyclerView.Adapter<SchoolRecyclerViewAdapter.ViewHolder> {
List<SchoolResponse> listofItems;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_list_item,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
    final SchoolResponse listItems = listofItems.get(position);

    final String schoolName = listItems.getSchoolName();
    holder.tvSchoolName.setText(schoolName);



    }

    @Override
    public int getItemCount() {
        return listofItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvSchoolName;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvSchoolName = itemView.findViewById(R.id.tvSchoolName);
        }
    }
}
