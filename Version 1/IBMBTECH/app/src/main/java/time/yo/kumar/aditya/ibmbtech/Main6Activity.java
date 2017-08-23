package time.yo.kumar.aditya.ibmbtech;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Main6Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        PDFView pd=(PDFView)findViewById(R.id.pdfView);
        pd.fromAsset("CSE320 Software Engineering.pdf").load();
    }
}
