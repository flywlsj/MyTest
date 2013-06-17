package com.example.mytest;

import com.example.mytest.R;
import android.app.Activity; // 引入包含的包
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.graphics.Color;
import android.view.View;
import android.view.View.OnClickListener;


public class MyActivity1 extends Activity {
	public MyActivity1() { }
	
	@Override
	public void onCreate(Bundle savedInstanceState) { 
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.myactivity1);
		
		final TextView Text = (TextView) findViewById(R.id.text1); // 获得句柄
		final Button Button1 = (Button) findViewById(R.id.button1);
		
		Button1.setOnClickListener(new OnClickListener() { // 实现行为功能
			public void onClick(View v) {
				Text.setBackgroundColor(Color.RED);
				Intent intent = new Intent(); // 建立Intent
				intent.setClass(MyActivity1.this, MyActivity2.class); // 设置活动
				startActivity(intent);
				onPause();
			}
			});
		
	}
	
	
	
}

