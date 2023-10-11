package uz.qubemelon.pdf;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MundarijaActivity extends AppCompatActivity implements View.OnClickListener{

    private CardView card_view_lessons, card_view_laboratory, card_view_literature, card_view_test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mundarija);
//         top_view=(View) findViewById(R.id.top_view);

        init_view();

//         btn_laboratory=(CardView) findViewById(R.id.btn_laboratory);
//         btn_literature=(CardView) findViewById(R.id.btn_literature);
//         btn_intenert=(CardView) findViewById(R.id.btn_internet);
//         btn_interesting_facts=(CardView) findViewById(R.id.btn_interesting_fact);



    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case R.id.card_view_lessons:

                Intent lesson_intent = new Intent(getApplicationContext(), BirActivity.class);

                startActivity(lesson_intent);
                break;

            case R.id.card_view_laboratory:

                Intent laboratory_intent=new Intent(getApplicationContext(),IkkiActivity.class);

                startActivity(laboratory_intent);
                break;

            case R.id.card_view_literature:

                Intent literature_intent=new Intent(getApplicationContext(),UcActivity.class);

                startActivity(literature_intent);
                break;

            case R.id.card_view_test:

                Intent test_intent=new Intent(getApplicationContext(),TurtActivity.class);

                startActivity(test_intent);
                break;


        }

    }

    public void init_view(){
        card_view_lessons = findViewById(R.id.card_view_lessons);
        card_view_laboratory=findViewById(R.id.card_view_laboratory);
        card_view_literature=findViewById(R.id.card_view_literature);
        card_view_test=findViewById(R.id.card_view_test);

        card_view_lessons.setOnClickListener(this);
        card_view_laboratory.setOnClickListener(this);
        card_view_literature.setOnClickListener(this);
        card_view_test.setOnClickListener(this);

    }
}