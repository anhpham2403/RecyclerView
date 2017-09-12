package com.example.anh.examplerecyclerview.data;

import com.example.anh.examplerecyclerview.data.model.User;
import java.util.List;

/**
 * Created by anh on 11/09/2017.
 */

public interface AuthenicationDataSource {
    void getUsers(Callback<List<User>> callback);

    interface Callback<T> {
        void onSuccess(T data);

        void onFailure(String msg);
    }
}
