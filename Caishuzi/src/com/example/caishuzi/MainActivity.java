package com.example.caishuzi;

import android.R.integer;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	EditText et1;
	TextView tv2;
	Button b1;
	int c1=5,num1;
	

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		num1=(int)(Math.random()*100);
		et1=(EditText)findViewById(R.id.editText1);
		tv2=(TextView)findViewById(R.id.textView2);
		b1=(Button)findViewById(R.id.button1);
//		Intent intent1=getIntent();
//		Bundle bundle1=intent1.getExtras();
//		num1=bundle1.getInt("shu1");
//		c1=bundle1.getInt("cishu1");
		tv2.setText("随机数为"+num1+",次数为"+c1+"");
		b1.setOnClickListener(new OnClickListener() {
				
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String s=et1.getText().toString();
				int i1=Integer.parseInt(s);
				c1=c1-1;
				
					Intent intent=new Intent(MainActivity.this,jiemian2.class);
					Bundle bundle=new Bundle();
					bundle.putInt("shu",i1);
					bundle.putInt("cishu", c1);
					bundle.putInt("shu2", num1);
					intent.putExtras(bundle);
					startActivityForResult(intent, 0);
				
		//		if(num>i1){
		//			intent.putExtra("shu",i1);
		//		startActivityForResult(intent, 0);
		//		}else if(num<i1){
		//			intent.putExtra("shu","你猜大了，重新猜一个吧"+num+"");
		//			startActivity(intent);
		//		}else{
		//			intent.putExtra("shu","你猜对了"+num+"");
		//		startActivity(intent);
		//		}
				
			}
		});
	}@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
		super.onActivityResult(requestCode, resultCode, data);
		switch (requestCode) {
		case 0:
			if(resultCode==RESULT_OK){
	//			Intent intent1=getIntent();
				Bundle bundle=data.getExtras();
			//    num1=bundle.getInt("shu1");
				c1=bundle.getInt("cishu1");
			}
			break;

		default:
			break;
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
