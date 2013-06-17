package com.example.mytest;

import com.example.mytest.R;
import android.app.Activity;

import android.widget.TextView;
import android.os.Bundle;

public class MyActivity2 extends Activity {
	public MyActivity2() { }
	
	@Override
	public void onCreate(Bundle savedInstanceState) { 
		super.onCreate(savedInstanceState);
		setContentView(R.layout.myactivity2);
	}

}
