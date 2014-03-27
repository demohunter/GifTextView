package cn.demohunter.demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    static final String TAG = "+++++++++++++++MainActivity+++++++++++++++";
    
    
    private MyTextView mTv1, mTv2;

    Button mBtnGo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findView();
        
        mTv1.setMyText("dfds[顶]fdsfds");
        mTv2.setMyText("哇哈哈哈[顶]的范德萨发kkjkjkjjj范[哈哈]德萨fdsf[笑]dsfdsf");
    }

    void findView() {
        mBtnGo = (Button) findViewById(R.id.btn_go);
        
        mTv1 = (MyTextView) findViewById(R.id.tv_test1);
        mTv2 = (MyTextView) findViewById(R.id.tv_test2);
    }
    
    
    @Override
    protected void onPause() {
        super.onPause();
        
        mTv1.setRuning(false);
        mTv2.setRuning(false);
    }
    
    @Override
    protected void onResume() {
        super.onResume();
        mTv1.setRuning(true);
        mTv2.setRuning(true);
    }
    
    @Override
    protected void onDestroy() {
        super.onDestroy();
        mTv1.setRuning(false);
        mTv2.setRuning(false);
    }

}
