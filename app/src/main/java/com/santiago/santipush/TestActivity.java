package com.santiago.santipush;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Administrator on 2016/12/28.
 */

public class TestActivity extends AppCompatActivity {
    @BindView(R.id.recycler_view_grid_add_btn)
    Button recyclerViewGridAddBtn;
    @BindView(R.id.recycler_view_grid_rv)
    RecyclerView recyclerViewGridRv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_view_grid);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.recycler_view_grid_add_btn)
    public void onClick() {
    }
}
