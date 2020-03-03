package com.example.tpmpertemuan4;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class AdapterPahlawan extends RecyclerView.Adapter<AdapterPahlawan.ViewHolder> {
    private ArrayList<modelPahlawan> modelPahlawans;
    private Context context;

    public AdapterPahlawan(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemRow= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_pahlawan,parent,false);
        return new ViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        Glide.with(context).load(getModelPahlawans().get(position).heroImages).into(holder.ivPahlawan);
        holder.tvNama.setText(getModelPahlawans().get(position).heroNames);
        holder.tvDetail.setText(getModelPahlawans().get(position).heroDetails);
        holder.itemLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Main2Activity.class);
                intent.putExtra("nama",getModelPahlawans().get(position).heroNames);
                intent.putExtra("detail",getModelPahlawans().get(position).heroDetails);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return getModelPahlawans().size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView ivPahlawan;
        private TextView tvNama, tvDetail;
        LinearLayout itemLayout;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ivPahlawan= itemView.findViewById(R.id.ivPahlawan);
            tvNama=itemView.findViewById(R.id.tvNama);
            tvDetail=itemView.findViewById(R.id.tvDetail);
            itemLayout=itemView.findViewById(R.id.Item);
        }
    }

    public ArrayList<modelPahlawan> getModelPahlawans() {
        return modelPahlawans;
    }

    public void setModelPahlawans(ArrayList<modelPahlawan> modelPahlawans) {
        this.modelPahlawans = modelPahlawans;
    }
}
