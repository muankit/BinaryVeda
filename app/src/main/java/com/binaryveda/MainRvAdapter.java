package com.binaryveda;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.binaryveda.model.Home;

import java.util.List;

public class MainRvAdapter extends RecyclerView.Adapter<MainRvAdapter.MainViewHolder> {

    private List<Home> homeList;

    public MainRvAdapter(List<Home> homeList) {
        this.homeList = homeList;
    }

    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.main_item_layout, parent, false);
        return new MainViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
        holder.onBind(homeList.get(position));
    }

    @Override
    public int getItemCount() {
        return homeList.size();
    }

    public static class MainViewHolder extends RecyclerView.ViewHolder {

        private ImageView mImage;
        private TextView mTitle, mSubTitle;

        public MainViewHolder(@NonNull View itemView) {
            super(itemView);

            mImage = itemView.findViewById(R.id.item_image_vector);
            mTitle = itemView.findViewById(R.id.item_image_title);
            mSubTitle = itemView.findViewById(R.id.item_image_sub_title);
        }

        @SuppressLint("UseCompatLoadingForDrawables")
        public void onBind(Home home) {
            mTitle.setText(home.getTitle());
            mSubTitle.setText(home.getSubtitle());
            mImage.setImageDrawable(itemView.getResources().getDrawable(home.getImageId()));
        }
    }
}
