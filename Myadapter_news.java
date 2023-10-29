package com.example.work1;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.List;
import java.util.Map;


class MyAdapter_news extends RecyclerView.Adapter<MyAdapter_news.MyViewHolder2> {
    private View itemView2;
    private Context context;
    private List<Map<String,Object>> items2;
    private Intent intent1;
    public MyAdapter_news(List<Map<String,Object>> items2, Context context) {
        this.context=context;
        this.items2=items2;
    }

    @NonNull
    @Override
    public MyViewHolder2 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        itemView2= LayoutInflater.from(context).inflate(R.layout.item2,parent,false);
        MyViewHolder2 myViewHolder2=new MyAdapter_news.MyViewHolder2(itemView2);
        return myViewHolder2;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder2 holder, int position) {
        holder.name.setText(items2.get(position).get("User").toString());
        holder.message.setText(items2.get(position).get("Message").toString());
        holder.imageView.setImageResource(Integer.parseInt(items2.get(position).get("Picture").toString()));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, MainActivity2.class);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return items2.size();
    }

    public class MyViewHolder2 extends RecyclerView.ViewHolder {
        TextView name;
        TextView message;
        ImageView imageView;

        public MyViewHolder2(View itemView2) {
            super(itemView2);
            name = itemView2.findViewById(R.id.name);
            message = itemView2.findViewById(R.id.message);
            imageView = itemView2.findViewById(R.id.image2);
        }
    }

}
