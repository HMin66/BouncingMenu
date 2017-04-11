package com.huangmin66.bouncingmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private BouncingMenu bouncingMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
//            Toast.makeText(this, "todo", Toast.LENGTH_SHORT).show();
            if (bouncingMenu != null) {
                bouncingMenu.dismiss();
                bouncingMenu = null;
            } else {
                List<String> list = new ArrayList();
                for (int i = 0; i < 50; i++) {
                    list.add("item" + i);
                }
                MyRecyclerViewAdapter adapter = new MyRecyclerViewAdapter(list);

                bouncingMenu = BouncingMenu.makeMenu(findViewById(R.id.rl), R.layout.layout_rv_sweet, adapter).show();
            }

            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
