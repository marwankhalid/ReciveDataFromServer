package com.example.recivedatafromserver;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.List;

public class RentAdapter extends RecyclerView.Adapter<RentAdapter.myViewHolder> {
    private List<RentModel> mData;
    private Context mContext;
    RequestOptions options;

    public RentAdapter(List<RentModel> mData, Context mContext) {
        this.mData = mData;
        this.mContext = mContext;
        options = new RequestOptions()
                .centerCrop()
                .placeholder(R.drawable.ic_launcher_background);
    }


    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.rentitems,parent,false);
        return new myViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {
        holder.RentTitle.setText(mData.get(position).getTitle());

        Glide.with(mContext).load(mData.get(position).getImage()).apply(options).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }


    public class myViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView RentTitle;

        public myViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.rentImage);
            RentTitle = itemView.findViewById(R.id.rentTitle);
        }
    }

}
