package com.example.criminalintent;

import java.util.UUID;

/**
 * Created by Lenovo on 2016/9/25.
 */

class Crime {

    private String mTitle;

    private UUID mId;

    public Crime() {
        mId = UUID.randomUUID();
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public UUID getId() {
        return mId;
    }

    public void setId(UUID id) {
        mId = id;
    }
}
