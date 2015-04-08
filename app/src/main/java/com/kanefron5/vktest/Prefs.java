package com.kanefron5.vktest;

import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.view.View;

/**
 * Created by Роман on 08.04.2015.
 */
public class Prefs extends PreferenceActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.pref);
    }
    public void onPreferenceClick(View view){
        Intent pref = new Intent(Prefs.this, Easter.class);
        startActivity(pref);
    }
}
