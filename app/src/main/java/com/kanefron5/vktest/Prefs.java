package com.kanefron5.vktest;

import android.os.Bundle;
import android.preference.PreferenceActivity;

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

}
