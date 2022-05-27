package com.raimzhanov.application.model;

import android.net.Uri;

public class ContactItem {
    private int id;
    private String nameContact;
    private String lastMessage;
    private String timeOfLastMessage;
    private Uri uriImage;


    public ContactItem(String nameContact, String lastMessage, String timeOfLastMessage, Uri uriImage) {
        this.nameContact = nameContact;
        this.lastMessage = lastMessage;
        this.timeOfLastMessage = timeOfLastMessage;
        this.uriImage = uriImage;
    }

    public int getId() {
        return id;
    }

    public String getNameContact() {
        return nameContact;
    }

    public String getLastMessage() {
        return lastMessage;
    }

    public String getTimeOfLastMessage() {
        return timeOfLastMessage;
    }

    public Uri getUriImage() {
        return uriImage;
    }

    @Override
    public String toString() {
        return "ContactItem{" +
                "id=" + id +
                ", nameContact='" + nameContact + '\'' +
                ", lastMessage='" + lastMessage + '\'' +
                ", timeOfLastMessage='" + timeOfLastMessage + '\'' +
                ", uriImage=" + uriImage +
                '}';
    }
}
