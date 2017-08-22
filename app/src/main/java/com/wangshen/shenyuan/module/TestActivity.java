package com.wangshen.shenyuan.module;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.util.Log;

import com.wangshen.shenyuan.R;
import com.wangshen.shenyuan.base.BaseActivity;
import com.wangshen.shenyuan.content.StringContent;
import com.wangshen.shenyuan.databinding.TextBinding;
import com.wangshen.shenyuan.model.User;

/**
 * Created by Administrator on 2017/8/18.
 */

public class TestActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextBinding activityMainBinding=DataBindingUtil.setContentView(this,getView());
        activityMainBinding.setUser(new User("张三","南",12, StringContent.image));
    }

    @Override
    public void initData() {
        //super.initData();
        Log.i("TestActivity","inidata");
    }
    @Override
    protected int getView() {
        return R.layout.text;
    }
}
