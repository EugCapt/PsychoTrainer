package com.human_vs_ai.trainer_client;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TaskActivity extends AppCompatActivity {
    private TextView taskDiplay;//инициализируем вывод приветсвия и заданий
    private  String transportedName;//переменная для нашего перемещенного имени

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task);
        taskDiplay = findViewById(R.id.taskView);//получаем доступ

        Intent transporterIntent = getIntent();  //материализуемся , получем интент
        transportedName = transporterIntent.getStringExtra("transporterBuffer");//Энтерпрайз , я на месте . Интент с переменной получены
        String Greetings = String.format(getString(R.string.start_text),transportedName); //переменная для приветствия , используем наше имя по назначению
        taskDiplay.setText(Greetings);//выводим имя



    }
    /*
    метод дляобработки нажатий
     */
    public void cleanOnClick(View view) {
    }
}
