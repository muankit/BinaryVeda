package com.binaryveda;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.binaryveda.model.Upload;

import java.util.ArrayList;
import java.util.List;

public class UploadFragment extends Fragment {

    private RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_upload, container, false);

        recyclerView = root.findViewById(R.id.upload_rv);

        createDataSet();

        return root;
    }

    private void createDataSet() {

        Upload upload1 = new Upload(R.drawable.image_upload);
        Upload upload2 = new Upload(R.drawable.image_upload);
        Upload upload3 = new Upload(R.drawable.image_upload);
        Upload upload4 = new Upload(R.drawable.image_upload);
        Upload upload5 = new Upload(R.drawable.image_upload);
        Upload upload6 = new Upload(R.drawable.image_upload);
        Upload upload7 = new Upload(R.drawable.image_upload);
        Upload upload8 = new Upload(R.drawable.image_upload);

        List<Upload> uploadList = new ArrayList<>();
        uploadList.add(upload1);
        uploadList.add(upload2);
        uploadList.add(upload3);
        uploadList.add(upload4);
        uploadList.add(upload5);
        uploadList.add(upload6);
        uploadList.add(upload7);
        uploadList.add(upload8);

        UploadRVAdapter adapter = new UploadRVAdapter(uploadList);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);
    }
}