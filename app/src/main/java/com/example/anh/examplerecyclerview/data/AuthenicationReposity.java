package com.example.anh.examplerecyclerview.data;

import com.example.anh.examplerecyclerview.data.model.User;
import com.example.anh.examplerecyclerview.data.source.local.AuthenicationLocalDataSource;
import java.util.List;

/**
 * Created by anh on 11/09/2017.
 */

public class AuthenicationReposity implements AuthenicationDataSource {
    private AuthenicationLocalDataSource mLocalDataSource;

    public AuthenicationReposity(AuthenicationLocalDataSource localDataSource) {
        mLocalDataSource = localDataSource;
    }

    @Override
    public void getUsers(Callback<List<User>> callback) {
        mLocalDataSource.getUsers(callback);
    }
}
