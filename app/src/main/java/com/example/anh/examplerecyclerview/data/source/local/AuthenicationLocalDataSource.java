package com.example.anh.examplerecyclerview.data.source.local;

import com.example.anh.examplerecyclerview.data.AuthenicationDataSource;
import com.example.anh.examplerecyclerview.data.model.User;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by anh on 11/09/2017.
 */

public class AuthenicationLocalDataSource implements AuthenicationDataSource {

    @Override
    public void getUsers(Callback<List<User>> callback) {
        int i = new Random().nextInt();
        List<User> users = new ArrayList<>();
        if(i>0) {
            for (int j = 0; j < i; j++) {
                users.add(new User(new Random().nextLong(), j + "",
                        "https://avatars2.githubusercontent.com/u/17908390?v=4"));
            }
            callback.onSuccess(users);
        }else{
            callback.onFailure("no item");
        }

    }
}
