package com.yunus.retrofit2;

import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class NewsViewHolder extends RecyclerView.ViewHolder {

    public TextView title;
    public TextView description;

    public NewsViewHolder(View itemView) {
        super(itemView);
        title = itemView.findViewById(R.id.post_title);
        description = itemView.findViewById(R.id.post_description);
    }
}
