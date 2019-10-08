package in.ac.nitk.recyclerviewdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyRecyclerAdapter extends RecyclerView.Adapter<MyRecyclerAdapter.MyOwnHolder> {


    Context context;
    ArrayList<UserDetail> mList = new ArrayList<>();

    MyRecyclerAdapter(){

    }

    public MyRecyclerAdapter(Context context, ArrayList<UserDetail> mList) {
        this.context = context;
        this.mList = mList;
    }


    @NonNull
    @Override
    public MyOwnHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.my_card,parent,false);
        return new MyOwnHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyOwnHolder holder, final int position) {
        holder.nameTextView.setText(mList.get(position).getUserName());
        holder.descTextView.setText(mList.get(position).getUserDesc());


        holder.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,"  i clicked card " + mList.get(position).getUserName(),Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class MyOwnHolder extends RecyclerView.ViewHolder {

        TextView nameTextView;
        TextView descTextView;
        Button button;

        public MyOwnHolder(@NonNull View itemView) {
            super(itemView);
            nameTextView = itemView.findViewById(R.id.name_textview);
            descTextView = itemView.findViewById(R.id.desc_textview);
            button = itemView.findViewById(R.id.button_xx);
        }
    }
}
