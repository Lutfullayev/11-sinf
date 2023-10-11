package uz.qubemelon.pdf;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle;

public class FileDisplayActivity extends AppCompatActivity {
    private ImageView btn_arrow_back;
    private PDFView file_reader;
    private String file_name = null;
    private int position = -1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reader);

        init_view();
        file_name = getIntent().getStringExtra("file");
        view_content(file_name);
    }

    private void init_view() {
        btn_arrow_back = (ImageView) findViewById(R.id.btn_arrow_back);
        file_reader = (PDFView) findViewById(R.id.file_viewer);
        position = getIntent().getIntExtra("position",-1);
        btn_arrow_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    private void view_content(String file) {
        file_reader.fromAsset(file)
                .enableSwipe(true)
                .enableAnnotationRendering(true)
                .scrollHandle(new DefaultScrollHandle(this))
                .load();
    }
}
