package com.example.getready;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private StatusAdapter statusAdapter;
    private List<StatusItem> statusItemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        recyclerView = findViewById(R.id.recycler_view_status);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        statusItemList = new ArrayList<>();
        statusItemList.add(new StatusItem(R.drawable.not_validated, "Belum Divalidasi"));
        statusItemList.add(new StatusItem(R.drawable.in_progress, "Sedang Proses"));
        statusItemList.add(new StatusItem(R.drawable.validated, "Selesai Diverifikasi"));

        statusAdapter = new StatusAdapter(statusItemList);
        recyclerView.setAdapter(statusAdapter);
    }
}
