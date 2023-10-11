package uz.qubemelon.pdf;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class TurtActivity extends AppCompatActivity implements View.OnClickListener{

    private ImageView btn_arrow_back;
    private CardView lesson_one, lesson_two,lesson_third,lesson_four, lesson_five, lesson_six, lesson_seven,lesson_eigthn, lesson_nine,lesson_ten,lesson_bir,lesson_ikki,lesson_uch,lesson_turt,lesson_besh,lesson_olti;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turt);


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

        lesson_nine=(CardView) findViewById(R.id.lesson_nine);
        lesson_nine.setOnClickListener(this);
        lesson_ten=(CardView) findViewById(R.id.lesson_ten);
        lesson_ten.setOnClickListener(this);
        lesson_bir=(CardView) findViewById(R.id.lesson_bir);
        lesson_bir.setOnClickListener(this);
        lesson_ikki=(CardView) findViewById(R.id.lesson_ikki);
        lesson_ikki.setOnClickListener(this);
        lesson_uch=(CardView) findViewById(R.id.lesson_uch);
        lesson_uch.setOnClickListener(this);
        lesson_turt=(CardView)findViewById(R.id.lesson_turt);
        lesson_turt.setOnClickListener(this);
        lesson_besh=(CardView) findViewById(R.id.lesson_besh);
        lesson_besh.setOnClickListener(this);
        lesson_olti=(CardView) findViewById(R.id.lesson_olti);
        lesson_olti.setOnClickListener(this);


    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.lesson_one:

                String lesson_one = "turt/bir.pdf";
                Intent question_intent = new Intent(getApplicationContext(),FileDisplayActivity.class);
                question_intent.putExtra("file", lesson_one);
                startActivity(question_intent);
                break;


            case R.id.lesson_two:
                String  lesson_two="turt/ikki.pdf";
                Intent lesson_two_intent=new Intent(getApplicationContext(),FileDisplayActivity.class);
                lesson_two_intent.putExtra("file", lesson_two);
                startActivity(lesson_two_intent);
                break;

            case R.id.lesson_third:

                String  lesson_third_name="turt/uch.pdf";
                Intent lesson_third_name_intent=new Intent(getApplicationContext(),FileDisplayActivity.class);
                lesson_third_name_intent.putExtra("file", lesson_third_name);
                startActivity(lesson_third_name_intent);
                break;

            case R.id.lesson_four:

                String  lesson_four_name="turt/turt.pdf";
                Intent lesson_four_name_intent=new Intent(getApplicationContext(),FileDisplayActivity.class);
                lesson_four_name_intent.putExtra("file", lesson_four_name);
                startActivity(lesson_four_name_intent);
                break;
            case R.id.lesson_five:

                String  lesson_five_name="turt/besh.pdf";
                Intent lesson_five_name_intent=new Intent(getApplicationContext(),FileDisplayActivity.class);
                lesson_five_name_intent.putExtra("file", lesson_five_name);
                startActivity(lesson_five_name_intent);
                break;


            case R.id.lesson_six:

                String lesson_six_name = "turt/olti.pdf";
                Intent lesson_six_intent = new Intent(getApplicationContext(),FileDisplayActivity.class);
                lesson_six_intent.putExtra("file", lesson_six_name);
                startActivity(lesson_six_intent);
                break;


            case R.id.lesson_seven:
                String lesson_seven = "turt/yetti.pdf";
                Intent lesson_seven_intent=new Intent(getApplicationContext(),FileDisplayActivity.class);
                lesson_seven_intent.putExtra("file", lesson_seven);
                startActivity(lesson_seven_intent);
                break;

            case R.id.lesson_eigthn:

                String  lesson_eigth_name="turt/sakkiz.pdf";
                Intent lesson_eigth_name_intent=new Intent(getApplicationContext(),FileDisplayActivity.class);
                lesson_eigth_name_intent.putExtra("file", lesson_eigth_name);
                startActivity(lesson_eigth_name_intent);
                break;

            case R.id.lesson_nine:

                String lesson_nine = "turt/tuqqiz.pdf";
                Intent question_nine_intent = new Intent(getApplicationContext(),FileDisplayActivity.class);
                question_nine_intent.putExtra("file", lesson_nine);
                startActivity(question_nine_intent);
                break;


            case R.id.lesson_ten:
                String  lesson_ten="turt/un.pdf";
                Intent lesson_ten_intent=new Intent(getApplicationContext(),FileDisplayActivity.class);
                lesson_ten_intent.putExtra("file", lesson_ten);
                startActivity(lesson_ten_intent);
                break;

            case R.id.lesson_bir:

                String  lesson_bir_name="turt/unb.pdf";
                Intent lesson_bir_name_intent=new Intent(getApplicationContext(),FileDisplayActivity.class);
                lesson_bir_name_intent.putExtra("file", lesson_bir_name);
                startActivity(lesson_bir_name_intent);
                break;

            case R.id.lesson_ikki:

                String lesson_ikki_name="turt/uni.pdf";
                Intent lesson_ikki_name_intent=new Intent(getApplicationContext(),FileDisplayActivity.class);
                lesson_ikki_name_intent.putExtra("file", lesson_ikki_name);
                startActivity(lesson_ikki_name_intent);
                break;
            case R.id.lesson_uch:

                String  lesson_uch_name="turt/unu.pdf";
                Intent lesson_uch_name_intent=new Intent(getApplicationContext(),FileDisplayActivity.class);
                lesson_uch_name_intent.putExtra("file", lesson_uch_name);
                startActivity(lesson_uch_name_intent);
                break;


            case R.id.lesson_turt:

                String lesson_turt_name = "turt/unt.pdf";
                Intent lesson_turt_intent = new Intent(getApplicationContext(),FileDisplayActivity.class);
                lesson_turt_intent.putExtra("file", lesson_turt_name);
                startActivity(lesson_turt_intent);
                break;


            case R.id.lesson_besh:
                String lesson_besh = "turt/unbesh.pdf";
                Intent lesson_besh_intent=new Intent(getApplicationContext(),FileDisplayActivity.class);
                lesson_besh_intent.putExtra("file", lesson_besh);
                startActivity(lesson_besh_intent);
                break;

            case R.id.lesson_olti:

                String  lesson_olti_name="turt/uno.pdf";
                Intent lesson_olti_name_intent=new Intent(getApplicationContext(),FileDisplayActivity.class);
                lesson_olti_name_intent.putExtra("file", lesson_olti_name);
                startActivity(lesson_olti_name_intent);
                break;







        }
    }

}
