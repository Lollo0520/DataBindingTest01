package com.lollo.databindingtest01;

import android.databinding.ObservableField;

/**
 * Created by Jet Wang on 2016/10/12.
 */

public class User {
    public final ObservableField<String> name = new ObservableField<>();

    public User(String name) {
        this.name.set(name);
    }
}
