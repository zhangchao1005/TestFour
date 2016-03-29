package com.lanou.dllo.testfour;

import android.graphics.Color;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;


/**
 * Created by dllo on 16/3/28.
 */
public class OtherActivity extends BaseActivity implements View.OnClickListener {
    private LinearLayout one,two,three,four,five,six,seven,eight;
    private TextView tvOne,tvTwo;
    private View viewOne,viewTwo;
    @Override
    protected void initData() {
        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
        eight.setOnClickListener(this);

    }

    @Override
    protected void initView() {
        one = bindView(R.id.other_one);
        two = bindView(R.id.other_two);
        three = bindView(R.id.other_three);
        four = bindView(R.id.other_four);
        five = bindView(R.id.other_five);
        six = bindView(R.id.other_six);
        seven = bindView(R.id.other_seven);
        eight = bindView(R.id.other_eight);

        tvOne = bindView(R.id.other_tv_one);
        tvTwo = bindView(R.id.other_tv_two);

        viewOne = bindView(R.id.other_v_one);
        viewTwo = bindView(R.id.other_v_two);

    }

    @Override
    protected int getLayout() {
        return R.layout.activity_other;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.other_one:
                tvOne.setTextColor(Color.WHITE);
                viewOne.setVisibility(View.VISIBLE);
                break;
            case R.id.other_two:
                tvTwo.setTextColor(Color.WHITE);
                viewTwo.setVisibility(View.VISIBLE);
                break;
            case R.id.other_three:
                break;
            case R.id.other_four:
                break;
            case R.id.other_five:
                break;
            case R.id.other_six:
                break;
            case R.id.other_seven:
                break;
            case R.id.other_eight:
                break;
        }
    }
}
