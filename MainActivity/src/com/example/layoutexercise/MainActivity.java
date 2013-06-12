package com.example.layoutexercise;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		for (int i = 1; i < 4; i++) {
			final int j = i;
			
			int id = getResources().getIdentifier("exercise" + i , "id" , this.getPackageName());
			Button exercise1Button = (Button) findViewById(id);
			exercise1Button.setOnClickListener(new View.OnClickListener() {
			
				@Override
				public void onClick(View v) {
					Context context = MainActivity.this;
					
					Intent intent = new Intent(context, DisplayLayoutActivity.class);
					System.out.println(context.getResources().getIdentifier("activity_exercise" + j, "layout", context.getPackageName()));
					intent.putExtra("layout_id", context.getResources().getIdentifier("activity_exercise" + j, "layout", context.getPackageName()));
					intent.putExtra("title", "Exercise " + j);
					
					context.startActivity(intent);
				}
			});
		}
	}

}
