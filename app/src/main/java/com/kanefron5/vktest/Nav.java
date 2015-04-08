package com.kanefron5.vktest;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by Роман on 08.04.2015.
 */
public class Nav extends ActionBarActivity {
    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        {
            setContentView(R.layout.nav);
            ListView lv = (ListView) findViewById(R.id.nav);
            final String[] nav = {
                    getResources().getString(R.string.Профиль),
                    getResources().getString(R.string.Новости),
                    getResources().getString(R.string.Ответы),
                    getResources().getString(R.string.Сообщения),
                    getResources().getString(R.string.Друзья),
                    getResources().getString(R.string.Группы),
                    getResources().getString(R.string.Фотографии),
                    getResources().getString(R.string.Видео),
                    getResources().getString(R.string.Музыка),
                    getResources().getString(R.string.Настройки),

            };

            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, nav);
            lv.setAdapter(adapter);


            lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View itemClicked, int position,
                                        long id) {
                    TextView textView = (TextView) itemClicked;
                    String strText = textView.getText().toString(); // получаем текст нажатого элемента

                    if (strText.equalsIgnoreCase(getResources().getString(R.string.Профиль))) {
                        // Запускаем активность, связанную с определенным именем кота
                        Intent i = new Intent(Nav.this, Dd.class);
                        startActivity(i);
                    }
                    if (strText.equalsIgnoreCase(getResources().getString(R.string.Новости))) {
                        // Запускаем активность, связанную с определенным именем кота
                        Intent i = new Intent(Nav.this, Dd.class);
                        startActivity(i);
                    }
                    if (strText.equalsIgnoreCase(getResources().getString(R.string.Ответы))) {
                        // Запускаем активность, связанную с определенным именем кота
                        Intent i = new Intent(Nav.this, Dd.class);
                        startActivity(i);
                    }
                    if (strText.equalsIgnoreCase(getResources().getString(R.string.Сообщения))) {
                        // Запускаем активность, связанную с определенным именем кота
                        Intent i = new Intent(Nav.this, Dd.class);
                        startActivity(i);
                    }
                    if (strText.equalsIgnoreCase(getResources().getString(R.string.Друзья))) {
                        // Запускаем активность, связанную с определенным именем кота
                        Intent i = new Intent(Nav.this, MainActivity.class);
                        startActivity(i);
                    }
                    if (strText.equalsIgnoreCase(getResources().getString(R.string.Группы))) {
                        // Запускаем активность, связанную с определенным именем кота
                        Intent i = new Intent(Nav.this, Dd.class);
                        startActivity(i);
                    }
                    if (strText.equalsIgnoreCase(getResources().getString(R.string.Фотографии))) {
                        // Запускаем активность, связанную с определенным именем кота
                        Intent i = new Intent(Nav.this, Dd.class);
                        startActivity(i);
                    }
                    if (strText.equalsIgnoreCase(getResources().getString(R.string.Видео))) {
                        // Запускаем активность, связанную с определенным именем кота
                        Intent i = new Intent(Nav.this, Dd.class);
                        startActivity(i);
                    }
                    if (strText.equalsIgnoreCase(getResources().getString(R.string.Музыка))) {
                        // Запускаем активность, связанную с определенным именем кота
                        Intent i = new Intent(Nav.this, Dd.class);
                        startActivity(i);
                    }
                    if (strText.equalsIgnoreCase(getResources().getString(R.string.Настройки))) {
                        // Запускаем активность, связанную с определенным именем кота
                        Intent i = new Intent(Nav.this, Dd.class);
                        startActivity(i);
                    }
                }
            });
        }}



}
