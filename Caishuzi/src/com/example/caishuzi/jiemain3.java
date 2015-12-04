package com.example.caishuzi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class jiemain3 extends Activity{
	TextView tv3;
	Button b3;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.jiemian3);
		tv3=(TextView)findViewById(R.id.textView3);
		b3=(Button)findViewById(R.id.button3);
		tv3.setText("game   over");
		b3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent=new Intent(jiemain3.this,MainActivity.class);
				startActivity(intent);
			}
		});
	}
	
}
