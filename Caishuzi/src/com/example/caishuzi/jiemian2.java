package com.example.caishuzi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class jiemian2 extends Activity {
	TextView tv1;
	int num,j1,j2;
	Button b2;
	Intent intent;
	Bundle bundle;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.jiemian2);
		
		tv1=(TextView )findViewById(R.id.textView1);
		b2=(Button)findViewById(R.id.button2);
		intent=getIntent();
		
		bundle=intent.getExtras();
		j1=bundle.getInt("shu");
		j2=bundle.getInt("cishu");
		num=bundle.getInt("shu2");
//		String f=intent.getStringExtra("shu");
/*		if(j2==0){
			tv1.setText("��Ϸ"+j1+"����"+j2+"�أ�");
			num=(int)(Math.random()*100);
			b2.setText("���¿�ʼ");
			Intent intent1=new Intent(jiemian2.this,jiemain3.class);
			startActivity(intent1);
		}*/
		if(j2==0&&num!=j1){
//			tv1.setText("��ϲ"+j1+"��"+j2+"�أ�"+num+"");
			Intent intent1=new Intent(jiemian2.this,jiemain3.class);
			startActivity(intent1);
		}
		if(num>j1){
			tv1.setText("��µ�"+j1+"̫С�ˣ����²�"+j2+"һ�ΰ�"+num+"");
		}else if(num<j1){
			tv1.setText("��µ�"+j1+"̫���ˣ����²�"+j2+"һ�ΰ�"+num+"");
		}else{
			//			c1=5;
			//			num1=(int)(Math.random()*100);
			tv1.setText("��ϲ"+j1+"��"+j2+"�أ�"+num+"");
			b2.setText("����һ��");
		b2.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent intent2=new Intent(jiemian2.this,MainActivity.class);
					startActivity(intent2);
					finish();
				}
			});
			}
			b2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
		//		j2=j2-1;
		//		Intent intent1=new Intent(jiemian2.this,MainActivity.class);
		//		Intent intent1=new Intent();
		//		Bundle bundle2=new Bundle();
		///		bundle.putInt("shu1", num);
				bundle.putInt("cishu1", j2);
				intent.putExtras(bundle);
		//		startActivity(intent1);
				setResult(RESULT_OK, intent);
				finish();
			}
		});
		
		
	}
	

}
