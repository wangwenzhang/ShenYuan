package com.wangshen.shenyuan.base;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by Administrator on 2017/8/17.
 */

public  class BaseActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getView());
        initData();
        initLinstner();
        initView();
    }
    public void initData(){
        Log.i("baseActivity","inidata");
    }
    protected void initLinstner(){}
    protected void initView(){}
    protected  int getView(){
        return 0;
    }

}
