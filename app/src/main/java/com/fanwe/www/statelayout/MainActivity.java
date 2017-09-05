package com.fanwe.www.statelayout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.fanwe.lib.statelayout.SDStateLayout;


public class MainActivity extends AppCompatActivity
{
    private SDStateLayout mStatesLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mStatesLayout = SDStateLayout.wrap(findViewById(R.id.ll_content));
        mStatesLayout.getErrorView().setContentView(R.layout.layout_state_error);
        mStatesLayout.setCallback(new SDStateLayout.Callback()
        {
            @Override
            public void onClickErrorView(View view)
            {
                Toast.makeText(MainActivity.this, "onClickErrorView", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onClickEmptyView(View view)
            {
                Toast.makeText(MainActivity.this, "onClickEmptyView", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void onClickBtn(View view)
    {
        mStatesLayout.showError();
    }
}