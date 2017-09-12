package com.example.anh.examplerecyclerview.recyclerview;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.example.anh.examplerecyclerview.R;
import com.example.anh.examplerecyclerview.data.AuthenicationReposity;
import com.example.anh.examplerecyclerview.data.source.local.AuthenicationLocalDataSource;
import com.example.anh.examplerecyclerview.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AuthenicationReposity authenicationReposity =
                new AuthenicationReposity(new AuthenicationLocalDataSource());
        MainViewModel mainViewModel = new MainViewModel(authenicationReposity);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mBinding.setViewModel(mainViewModel);
    }
}
