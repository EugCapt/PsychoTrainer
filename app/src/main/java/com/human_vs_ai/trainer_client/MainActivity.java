/*
     Стартовая активность приложения
 */

package com.human_vs_ai.trainer_client;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
//здесь импортируются бибилиотеки

public class MainActivity extends AppCompatActivity {

    private EditText nameField; //создаем переменную для имени

    //генерируется на старте , при нужде дополняется
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameField = findViewById(R.id.editText);


    }
    //этот метод создан для обработки нажатия кнопки и перехода на следущую активность
    public void onClickProceed(View view) {
        /*
         здесь мы создаем нечто , которое называется интент
         это пакет данных , который указывает андроиду о необходимости открыть новую активность, новый экран
         есть интент явный и неявный
         неявный позволяет передавать данные между несколькими приложениями, но нам это не нужно
         значит берем явный
         */
        String nameTransporter = nameField.getText().toString().trim(); //переменная становится на площадку транспортера)) переменная для переноса
        Intent intent = new Intent(this , TaskActivity.class);//выставляем координаты для телепортации , создаем явный интент
        intent.putExtra("transporterBuffer", nameTransporter);//сканируем на наличие жизненных форм , вкладываем в интент наши данные
        startActivity(intent);// scotty , energise !  коммандуем запускать следущую активность
    }
}
