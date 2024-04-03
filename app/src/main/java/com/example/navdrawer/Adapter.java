package com.example.navdrawer;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder_Kuliner> {

    private Context context;
    private List<items> itemsList;

    public Adapter(Context context, List<items> itemsList) {
        this.context = context;
        this.itemsList = itemsList;
    }

    @NonNull
    @Override
    public ViewHolder_Kuliner onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_view, parent, false);
        return new ViewHolder_Kuliner(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder_Kuliner holder, int position) {
        holder.bind(itemsList.get(position));
    }

    @Override
    public int getItemCount() {
        return itemsList.size();
    }

    public class ViewHolder_Kuliner extends RecyclerView.ViewHolder implements View.OnClickListener {

        private ImageView imageView;
        private TextView nama;
        private items currentItem;

        public ViewHolder_Kuliner(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.gambar);
            nama = itemView.findViewById(R.id.name_text_view);
            itemView.setOnClickListener(this);
        }

        public void bind(items item) {
            currentItem = item;
            nama.setText(item.getNama());
            Glide.with(itemView.getContext())
                    .load(item.getImage())
                    .placeholder(R.drawable.baseline_autorenew_24)
                    .error(R.drawable.baseline_question_mark_24)
                    .into(imageView);
        }

        @Override
        public void onClick(View v) {
            Intent intent = new Intent(context, khas.class);
            intent.putExtra("nama", currentItem.getNama());
            intent.putExtra("img", currentItem.getImage());
            intent.putExtra("deskripsi", currentItem.getDeskripsi());
            context.startActivity(intent); // Memulai aktivitas baru dengan konteks yang benar
        }
    }
}
