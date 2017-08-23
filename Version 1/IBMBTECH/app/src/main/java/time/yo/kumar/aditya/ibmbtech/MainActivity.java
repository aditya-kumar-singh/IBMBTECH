package time.yo.kumar.aditya.ibmbtech;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    ArrayAdapter ad;
    String ls[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView) findViewById(R.id.list);
        ls = getResources().getStringArray(R.array.Subjects);
        ad = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1, ls);
        lv.setAdapter(ad);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Intent i1=new Intent(view.getContext(),Main2Activity.class);
                    startActivity(i1);

                }
                if(position==1){
                    Intent i2=new Intent(view.getContext(),Main3Activity.class);
                    startActivity(i2);

                }
                if(position==2){
                    Intent i3=new Intent(view.getContext(),Main4Activity.class);
                    startActivity(i3);

                }
                if(position==3){
                    Intent i4=new Intent(view.getContext(),Main6Activity.class);
                    startActivity(i4);

                }
                if(position==4){
                    Intent i5=new Intent(view.getContext(),Main5Activity.class);
                    startActivity(i5);

                }




            }
        });

    }
}
