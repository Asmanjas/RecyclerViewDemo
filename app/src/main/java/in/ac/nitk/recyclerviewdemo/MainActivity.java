package in.ac.nitk.recyclerviewdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private RecyclerView recyclerView;
    private ArrayList<UserDetail> mList = new ArrayList<>();
    MyRecyclerAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);
        mList.add(new UserDetail("Asmanjas","android developers"));
        mList.add(new UserDetail("Avinash", "web developer"));
        mList.add(new UserDetail("Khagpati","Python developer"));
        mList.add(new UserDetail("Asmanjas","android developers"));
        mList.add(new UserDetail("Avinash", "web developer"));
        mList.add(new UserDetail("Khagpati","Python developer"));
        mList.add(new UserDetail("Asmanjas","android developers"));
        mList.add(new UserDetail("Avinash", "web developer"));
        mList.add(new UserDetail("Khagpati","Python developer"));
        mList.add(new UserDetail("Asmanjas","android developers"));
        mList.add(new UserDetail("Avinash", "web developer"));
        mList.add(new UserDetail("Khagpati","Python developer"));

        adapter  = new MyRecyclerAdapter(getApplicationContext(),mList);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

    }
}
