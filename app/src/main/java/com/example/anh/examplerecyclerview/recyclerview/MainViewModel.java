package com.example.anh.examplerecyclerview.recyclerview;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.widget.Toast;
import com.example.anh.examplerecyclerview.ApplicationLogin;
import com.example.anh.examplerecyclerview.data.AuthenicationDataSource;
import com.example.anh.examplerecyclerview.data.AuthenicationReposity;
import com.example.anh.examplerecyclerview.data.model.User;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by anh on 12/09/2017.
 */

public class MainViewModel extends BaseObservable {
    private List<User> mUsers;
    private AuthenicationReposity mAuthenicationReposity;
    private UserAdapter mUserAdapter;

    public MainViewModel(AuthenicationReposity authenicationReposity) {
        mAuthenicationReposity = authenicationReposity;
        mAuthenicationReposity.getUsers(new AuthenicationDataSource.Callback<List<User>>() {
            @Override
            public void onSuccess(List<User> data) {
                mUsers = data;
            }

            @Override
            public void onFailure(String msg) {
                mUsers = new ArrayList<User>();
                Toast.makeText(ApplicationLogin.getContext(), msg, Toast.LENGTH_LONG).show();
            }
        });
        mUserAdapter = new UserAdapter(mUsers);
    }

    @Bindable
    public UserAdapter getUserAdapter() {
        return mUserAdapter;
    }
}
