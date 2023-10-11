package uz.qubemelon.pdf;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class UcActivity extends AppCompatActivity implements View.OnClickListener{

    private ImageView btn_arrow_back;
    private CardView lesson_one, lesson_two,lesson_third,lesson_four, lesson_five, lesson_six, lesson_seven,lesson_eigthn;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uc);


        lesson_one=(CardView) findViewById(R.id.lesson_one);
        lesson_one.setOnClickListener(this);
        lesson_two=(CardView) findViewById(R.id.lesson_two);
        lesson_two.setOnClickListener(this);
        lesson_third=(CardView) findViewById(R.id.lesson_third);
        lesson_third.setOnClickListener(this);
        lesson_four=(CardView) findViewById(R.id.lesson_four);
        lesson_four.setOnClickListener(this);
        lesson_five=(CardView) findViewById(R.id.lesson_five);
        lesson_five.setOnClickListener(this);
        lesson_six=(CardView)findViewById(R.id.lesson_six);
        lesson_six.setOnClickListener(this);
        lesson_seven=(CardView) findViewById(R.id.lesson_seven);
        lesson_seven.setOnClickListener(this);
        lesson_eigthn=(CardView) findViewById(R.id.lesson_eigthn);
        lesson_eigthn.setOnClickListener(this);


    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.lesson_one:

                String lesson_one = "uch/bir.pdf";
                Intent question_intent = new Intent(getApplicationContext(),FileDisplayActivity.class);
                question_intent.putExtra("file", lesson_one);
                startActivity(question_intent);
                break;


            case R.id.lesson_two:
                String  lesson_two="uch/ikki.pdf";
                Intent lesson_two_intent=new Intent(getApplicationContext(),FileDisplayActivity.class);
                lesson_two_intent.putExtra("file", lesson_two);
                startActivity(lesson_two_intent);
                break;

            case R.id.lesson_third:

                String  lesson_third_name="uch/uch.pdf";
                Intent lesson_third_name_intent=new Intent(getApplicationContext(),FileDisplayActivity.class);
                lesson_third_name_intent.putExtra("file", lesson_third_name);
                startActivity(lesson_third_name_intent);
                break;

            case R.id.lesson_four:

                String  lesson_four_name="uch/turt.pdf";
                Intent lesson_four_name_intent=new Intent(getApplicationContext(),FileDisplayActivity.class);
                lesson_four_name_intent.putExtra("file", lesson_four_name);
                startActivity(lesson_four_name_intent);
                break;
            case R.id.lesson_five:

                String  lesson_five_name="uch/besh.pdf";
                Intent lesson_five_name_intent=new Intent(getApplicationContext(),FileDisplayActivity.class);
                lesson_five_name_intent.putExtra("file", lesson_five_name);
                startActivity(lesson_five_name_intent);
                break;


            case R.id.lesson_six:

                String lesson_six_name = "uch/olti.pdf";
                Intent lesson_six_intent = new Intent(getApplicationContext(),FileDisplayActivity.class);
                lesson_six_intent.putExtra("file", lesson_six_name);
                startActivity(lesson_six_intent);
                break;


            case R.id.lesson_seven:
                String lesson_seven = "uch/yetti.pdf";
                Intent lesson_seven_intent=new Intent(getApplicationContext(),FileDisplayActivity.class);
                lesson_seven_intent.putExtra("file", lesson_seven);
                startActivity(lesson_seven_intent);
                break;



            case R.id.lesson_eigthn:

                String  lesson_eigth_name="uch/sakkiz.pdf";
                Intent lesson_eigth_name_intent=new Intent(getApplicationContext(),FileDisplayActivity.class);
                lesson_eigth_name_intent.putExtra("file", lesson_eigth_name);
                startActivity(lesson_eigth_name_intent);
                break;







        }
    }

}
