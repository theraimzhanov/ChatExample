package com.raimzhanov.application.ui.adapter;

import static com.raimzhanov.application.R.drawable.person;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.raimzhanov.application.R;
import com.raimzhanov.application.model.ContactItem;

import java.util.ArrayList;
import java.util.List;

public class ContactAdapter extends RecyclerView.Adapter<ContactViewHolder> {

    private ArrayList<ContactItem>list;
    Context context;

    public ContactAdapter(Context context,ArrayList<ContactItem> list) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ContactViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.contact_item,parent,false);
        return new ContactViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactViewHolder holder, int position) {
    ContactItem item = list.get(position);
    holder.textViewContactName.setText(item.getNameContact());
    holder.textViewLastMessage.setText(item.getLastMessage());
    holder.textViewTimeOfLAstMessage.setText(item.getTimeOfLastMessage());
    if (item.getUriImage() == null){
        holder.imageViewContact.setImageDrawable(
                ContextCompat.getDrawable(context, person));

    } else {
        holder.imageViewContact.setImageURI(item.getUriImage());
    }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
