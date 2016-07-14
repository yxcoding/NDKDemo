package net.yxcoding.ndkdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import net.yxcoding.ndkutil.NDKUtil;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvName = (TextView) findViewById(R.id.tvName);
        tvName.setText(NDKUtil.getString());
    }
}
