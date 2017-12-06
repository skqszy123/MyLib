package com.halobear.found;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.mingle.entity.MenuEntity;
import com.mingle.sweetpick.BlurEffect;
import com.mingle.sweetpick.RecyclerViewDelegate;
import com.mingle.sweetpick.SweetSheet;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
//        Log.e("ArrayEmail",getResources().getStringArray(android.R.array.emailAddressTypes).toString());
//        Log.e("ArrayEmail","222222");
        // SweetSheet 控件,根据 rl 确认位置
        List<MenuEntity> list= new ArrayList<>();
        list.add(new SweetBean("QQQ"));
        list.add(new SweetBean("QQQ"));
        list.add(new SweetBean("QQQ"));
        list.add(new SweetBean("QQQ"));
        list.add(new SweetBean("QQQ"));
        list.add(new SweetBean("QQQ"));
        list.add(new SweetBean("QQQ"));
        list.add(new SweetBean("QQQ"));
        list.add(new SweetBean("QQQ"));
        list.add(new SweetBean("QQQ"));
        final SweetSheet mSweetSheet = new SweetSheet((RelativeLayout) findViewById(R.id.rl_content));

//设置数据源 (数据源支持设置 list 数组,也支持从menu 资源中获取)
        mSweetSheet.setMenuList(list);
//根据设置不同的 Delegate 来显示不同的风格.
        mSweetSheet.setDelegate(new RecyclerViewDelegate(true));
//根据设置不同Effect来设置背景效果:BlurEffect 模糊效果.DimEffect 变暗效果,NoneEffect 没有效果.
        mSweetSheet.setBackgroundEffect(new BlurEffect(8));
//设置菜单点击事件
        mSweetSheet.setOnMenuItemClickListener(new SweetSheet.OnMenuItemClickListener() {
            @Override
            public boolean onItemClick(int position, MenuEntity menuEntity1) {

                //根据返回值, true 会关闭 SweetSheet ,false 则不会.
                Toast.makeText(MainActivity.this, menuEntity1.title + "  " + position, Toast.LENGTH_SHORT).show();
                return true;
            }
        });
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mSweetSheet.show();
            }
        });
    }

}
