package com.example.dell.test;

import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import java.util.List;

public class Recycler
    extends RecyclerView.Adapter<
                    Recycler.StudentViewHolder> {

    private static final String TAG = Recycler.class.getName();

    private final ListItemClickListener itemClickListener;

    private static int viewHolderCount;

    private List<Student> student2ArrayList;

    public interface ListItemClickListener {
        void onListItemClickListener(int clickedItemIndex);
    }

    public Recycler(List<Student> student2ArrayList,
                    ListItemClickListener itemClickListener) {
        this.student2ArrayList = student2ArrayList;
        this.itemClickListener = itemClickListener;
        viewHolderCount = 0;
    }

    public StudentViewHolder onCreateViewHolder(@NonNull ViewGroup parent,
                                                int viewType) {

        LayoutInflater inflater =
                LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.recycler_number, parent, false);

        StudentViewHolder studentViewHolder =
                new StudentViewHolder(view);
        studentViewHolder.recyclerNumber.setText("" + viewHolderCount);

        viewHolderCount = viewHolderCount + 1;

        return studentViewHolder;
    }

    public void onBindViewHolder(@NonNull Recycler.StudentViewHolder holder,
                                 int position) {


        Student student = student2ArrayList.get(position);
        holder.name.setText("Name is: " + student.getName());
        holder.collegeName.setText("College is: " + student.getCollegeName());
        holder.phoneNumber.setText("Contact number is: " + student.getPhoneNumber());
        holder.fees.setText("fees is: " + student.getFees());
    }

    public int getItemCount() {
        return student2ArrayList.size();
    }

    public class StudentViewHolder extends RecyclerView.ViewHolder
            implements View.OnClickListener {

        TextView name,collegeName,phoneNumber,fees;
        TextView recyclerNumber;

        public StudentViewHolder(View itemView) {
            super(itemView);
            recyclerNumber = itemView.findViewById(R.id.text_view1);
            name = itemView.findViewById(R.id.text_view2);
            collegeName=itemView.findViewById(R.id.text_view3);
            phoneNumber=itemView.findViewById(R.id.text_view4);
            fees=itemView.findViewById(R.id.text_view5);



            itemView.setOnClickListener(this);
        }

        public void onClick(View v) {
            int clickedPosition = getAdapterPosition();
            itemClickListener.onListItemClickListener(clickedPosition);
        }


    }
}
