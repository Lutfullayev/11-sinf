package uz.qubemelon.pdf;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

  private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

            case R.id.button:
                Intent button = new Intent(getApplicationContext(), MundarijaActivity.class);
                startActivity(button);
                break;
        }

    }

    public void init_view(){
        button=(Button) findViewById(R.id.button);
        button.setOnClickListener(this);

    }
}