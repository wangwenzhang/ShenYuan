package com.wangshen.shenyuan.model;

import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.wangshen.shenyuan.R;

/**
 * Created by Administrator on 2017/8/19.
 */

public class User {
    private String name;
    private String gender;
    private int age;
    private String image;
    public User(String name, String gender, int age,String image) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.image=image;
    }
    @BindingAdapter("image")
    public static void getInternetImage(ImageView iv, String image) {
        Glide.with(iv.getContext()).load(image).asBitmap().placeholder(R.mipmap.ic_launcher).into(iv);
    }
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
