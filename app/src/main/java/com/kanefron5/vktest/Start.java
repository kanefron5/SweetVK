package com.kanefron5.vktest;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Start extends Activity {
    private int x;
    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        {
            setContentView(R.layout.start);
        }
    }
    @Override
    public void onBackPressed()
    {

        new AlertDialog.Builder(this)
                //создания диалога
                .setMessage(R.string.dialog)
                .setCancelable(false)
                .setPositiveButton(R.string.Yes , new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int id) {
                        finish();

                    }
                }).setNegativeButton(R.string.No, null).show();
    }



    public void onClick(View view) {
        Intent login = new Intent(Start.this, MainActivity.class);
        startActivity(login);
        Toast toast = Toast.makeText(this, "Добавить аккаунт!", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void onImgCkick(View view){
        x++;
       if (x>5){
           x=0;
           Intent easter = new Intent(Start.this, Easter.class);
           startActivity(easter);
       }


    }
}