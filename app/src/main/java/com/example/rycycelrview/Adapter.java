package com.example.rycycelrview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    private Context mcontext;
    private ArrayList<Model> mlist;
    Adapter(Context context, ArrayList<Model> list){
        mcontext = context;
        mlist = list;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(mcontext);
        View view = layoutInflater.inflate(R.layout.cardview,parent,false);
        ViewHolder viewHolder =  new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Model model = mlist.get(position);
        ImageView img = holder.img;

        img.setImageResource(model.getImg());

    }

    @Override
    public int getItemCount() {
        return mlist.size();
    }

    public class ViewHolder  extends  RecyclerView.ViewHolder{

        ImageView img;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.a);
        }
    }

}
