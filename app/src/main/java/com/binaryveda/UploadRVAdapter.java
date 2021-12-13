package com.binaryveda;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.binaryveda.model.Upload;

import java.util.List;

public class UploadRVAdapter extends RecyclerView.Adapter<UploadRVAdapter.UploadViewHolder> {

    private List<Upload> uploads;

    public UploadRVAdapter(List<Upload> uploads) {
        this.uploads = uploads;
    }

    @NonNull
    @Override
    public UploadViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.upload_item_layout, parent, false);
        return new UploadViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UploadViewHolder holder, int position) {
        holder.onBind(uploads.get(position));
    }

    @Override
    public int getItemCount() {
        return uploads.size();
    }

    public static class UploadViewHolder extends RecyclerView.ViewHolder {

        private ImageView imageView;

        public UploadViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.item_upload_image);
        }

        public void onBind(Upload upload) {
            imageView.setImageDrawable(itemView.getResources().getDrawable(upload.getImageId()));
        }
    }
}
