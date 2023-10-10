package com.example.a2709;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonCliked1(View view) {
        Toast myToast =Toast.makeText(getApplicationContext(),"Первая фотография", Toast.LENGTH_LONG);
        myToast.show();
    }
    public void buttonCliked2(View view) {
        Toast myToast =Toast.makeText(getApplicationContext(),"Вторая фотография", Toast.LENGTH_LONG);
        myToast.show();
    }
    public void buttonCliked3(View view) {
        Toast myToast =Toast.makeText(getApplicationContext(),"Третья фотография", Toast.LENGTH_LONG);
        myToast.show();
    }
    public void buttonClikedDialog(View view) {
        AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Вывод из приложения")
                .setIcon(R.drawable.icons8__96)
                .setMessage("Вы уверены что хотите закрыть приложения")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                }).setNegativeButton("Отмена", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
        AlertDialog alert=builder.create();
        alert.show();
    }
    public void onclikedSpisok(View view){
        String[] stroka={"Томаты","Курица","Морковь"};
        final boolean [] mSelectedIntegredients = {false,false,false};

        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Выберите ингридеенты для своей пиццы")
                .setIcon(R.drawable.icons8__30)
                .setCancelable(false)
                .setMultiChoiceItems(stroka,null,new DialogInterface.OnMultiChoiceClickListener(){
                    @Override
                    public void onClick(DialogInterface dialog,int which, boolean isChecked){
                        mSelectedIntegredients[which]=isChecked;
                    }
                })
                .setPositiveButton("ok",
                        new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            dialog.cancel();
                    }
                });
    }
}