package com.xxxlu.toolbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    private Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mToolbar = (Toolbar) findViewById(R.id.main_bar);
        mToolbar.setTitle("标题");
        mToolbar.setSubtitle("副标题");
        //应用logo
        mToolbar.setLogo(R.drawable.logo);
        //左上角的菜单图标
        mToolbar.setNavigationIcon(R.drawable.navigation_bar);

        //设置右侧菜单
        mToolbar.inflateMenu(R.menu.toolbar_menu);
//        菜单的点击事件
        mToolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                return false;
            }
        });
    }
}
