package com.stylingandroid.smoothscrolling;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends Activity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getActionBar().setDisplayHomeAsUpEnabled(true);
        getActionBar().setTitle("FastScroller");
        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        recyclerView.setAdapter(LargeAdapter.newInstance(this));
        int duration = getResources().getInteger(R.integer.scroll_duration);
        recyclerView.setLayoutManager(new ScrollingLinearLayoutManager(this, LinearLayoutManager.VERTICAL, false, duration));
        FastScroller fastScroller = (FastScroller) findViewById(R.id.fastscroller);
        fastScroller.setRecyclerView(recyclerView);
    }
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.main_menu, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        int id = item.getItemId();
//
//        if (id == R.id.action_top) {
//            recyclerView.smoothScrollToPosition(0);
//            return true;
//        } else if (id == R.id.action_bottom) {
//            recyclerView.smoothScrollToPosition(recyclerView.getAdapter().getItemCount());
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }
}
