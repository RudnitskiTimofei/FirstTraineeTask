package by.it.trudnitski.traineeapplication;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerMain extends AppCompatActivity {
    private RecyclerView recyclerView;
    DataAdapter adapter;
    private List<Phone> phones;
    LinearLayoutManager manager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_main);
        intializeData();

        recyclerView = findViewById(R.id.list);
        adapter = new DataAdapter(phones);
        manager = new LinearLayoutManager(this);

        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(adapter);
    }

    private void intializeData() {
        phones = new ArrayList<>();
        phones.add(new Phone("Iphone Xs", R.drawable.iphone));
        phones.add(new Phone("Samsung Note 9", R.drawable.note9));
        phones.add(new Phone("Nokia 3310", R.drawable.nokia3310));
        phones.add(new Phone("Huawei P20", R.drawable.huaweip20));
        phones.add(new Phone("Iphone 5", R.drawable.iphone5));
        phones.add(new Phone("Sony Erricson K750i", R.drawable.k750i));
        phones.add(new Phone("Nokia 8800", R.drawable.slaider));
        phones.add(new Phone("Motorola Razr v3" +
                "", R.drawable.razrv3));
        phones.add(new Phone("Motorola MPX200", R.drawable.mpx200_front_open));
        phones.add(new Phone("BlackBerry Bold", R.drawable.blackberry));
    }
}
