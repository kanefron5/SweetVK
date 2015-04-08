package com.kanefron5.vktest;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Роман on 08.04.2015.
 */
public class Messages extends ActionBarActivity {
    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        {
            setContentView(R.layout.dialogs);
            ListView lv = (ListView) findViewById(R.id.list1);
            final String[] nav = {
                    getResources().getString(R.string.Mes),
                    getResources().getString(R.string.Mes),
                    getResources().getString(R.string.Mes),
                    getResources().getString(R.string.Mes),
                    getResources().getString(R.string.Mes),
                    getResources().getString(R.string.Mes),
                    getResources().getString(R.string.Mes),
                    getResources().getString(R.string.Mes),
                    getResources().getString(R.string.Mes),
                    getResources().getString(R.string.Mes),

            };

            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.lst, nav);
            lv.setAdapter(adapter);
        }
    }
}