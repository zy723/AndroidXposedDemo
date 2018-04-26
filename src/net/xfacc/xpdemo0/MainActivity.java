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
					hintTxt.setText("备份完成...");
				}if(isCall && !isAll){
					hintTxt.setText("调用方法备份完成...");
				}if(!isCall && isAll){
					hintTxt.setText("全部方法备份完成...");
				}else{
					hintTxt.setText("备份失败...");
				}
			}});
    }


}
