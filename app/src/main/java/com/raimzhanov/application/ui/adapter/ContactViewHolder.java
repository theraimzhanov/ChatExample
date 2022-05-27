package com.raimzhanov.application.ui.adapter;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.raimzhanov.application.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class ContactViewHolder extends RecyclerView.ViewHolder {
    TextView textViewContactName;
    TextView textViewLastMessage;
    TextView textViewTimeOfLAstMessage;
    CircleImageView imageViewContact;
    public ContactViewHolder(@NonNull View itemView) {
        super(itemView);
        textViewContactName = itemView.findViewById(R.id.textViewContactName);
        textViewLastMessage = itemView.findViewById(R.id.textViewLastMessage);
        textViewTimeOfLAstMessage = itemView.findViewById(R.id.textViewTimeOfLastMessage);
        imageViewContact = itemView.findViewById(R.id.imageContact);
    }
}
