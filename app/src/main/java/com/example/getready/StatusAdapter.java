package com.example.getready;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class StatusAdapter extends RecyclerView.Adapter<StatusAdapter.StatusViewHolder> {

    private List<StatusItem> statusItemList;

    public StatusAdapter(List<StatusItem> statusItemList) {
        this.statusItemList = statusItemList;
    }

    @NonNull
    @Override
    public StatusViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.status_item, parent, false);
        return new StatusViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StatusViewHolder holder, int position) {
        StatusItem statusItem = statusItemList.get(position);
        holder.icon.setImageResource(statusItem.getIcon());
        holder.status.setText(statusItem.getStatus());
    }

    @Override
    public int getItemCount() {
        return statusItemList.size();
    }

    static class StatusViewHolder extends RecyclerView.ViewHolder {
        ImageView icon;
        TextView status;

        public StatusViewHolder(@NonNull View itemView) {
            super(itemView);
            icon = itemView.findViewById(R.id.status_icon);
            status = itemView.findViewById(R.id.status_text);
        }
    }
}
