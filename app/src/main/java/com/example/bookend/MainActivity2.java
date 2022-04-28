package com.example.bookend;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

   public class MainActivity2 extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private ListView listView;
    //把需要适配的数据以数组形式展示
    private String[] names = {"西游记" + "\n价格：40" + "\n作者：吴承恩" + "\n出版社：人民教育出版社",
            "红楼梦" + "\n价格：45" + "\n作者：曹雪芹" + "\n出版社：人民教育出版社",
            "三国演义" + "\n价格：30" + "\n作者：罗贯中" + "\n出版社：人民教育出版社",
            "水浒传" + "\n价格：40" + "\n作者：施耐庵" + "\n出版社：人民教育出版社",
            "儒林外史" + "\n价格：26" + "\n作者：吴敬梓" + "\n出版社：人民教育出版社"};
    private int[] icons = {R.drawable.xiyou, R.drawable.hong, R.drawable.sang, R.drawable.shui, R.drawable.wai};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initView();
    }

    private void initView() {
        listView = (ListView)findViewById(R.id.lv_main2);
        List<Map<String,Object>> userList = new ArrayList<>();
        for (int i = 0;i<names.length;i++){
            HashMap user = new HashMap();
            user.put("icon",icons[i]);
            user.put("name",names[i]);
            userList.add(user);
        }
        SimpleAdapter adapter = new SimpleAdapter(this,
                userList,
                R.layout.item_list,
                new String[]{"icon","name"},
                new int[]{R.id.itme_img,R.id.itme_tv});
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Map user = (Map) parent.getItemAtPosition(position);
        String name = (String)user.get("name");
        Toast.makeText(this,"这本书的详细信息是：\n",Toast.LENGTH_LONG).show();
    }
}