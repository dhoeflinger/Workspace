package com.example.layoutexercise;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;

public class DisplayLayoutActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		Intent intent = getIntent();
		int layoutId = intent.getIntExtra("layout_id", 0);
		String title = intent.getStringExtra("title");
		
		setContentView(layoutId);
		setTitle(title);
	}
}
