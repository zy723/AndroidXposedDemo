package net.xfacc.xpdemo0;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
	private TextView hintTxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
		hintTxt = (TextView)findViewById(R.id.hinttxt);
		
		findViewById(R.id.savemethod).setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				boolean isAll = HookAppAllMethod.dumpAllMethodInfo();
				boolean isCall = HookAppAllMethod.dumpCallMethodInfo();
				if(isAll && isCall){
					hintTxt.setText("�������...");
				}if(isCall && !isAll){
					hintTxt.setText("���÷����������...");
				}if(!isCall && isAll){
					hintTxt.setText("ȫ�������������...");
				}else{
					hintTxt.setText("����ʧ��...");
				}
			}});
    }


}
