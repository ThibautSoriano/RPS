package ihm.rps;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

    Button btNext;
    EditText tv_heure, tv_nom, tv_categorie, tv_suivant;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btNext = (Button) findViewById(R.id.bt_terminee);
        btNext.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ReportActivity.class));
            }
        });


        /*tv_heure = (EditText) findViewById(R.id.tv_heure);
        tv_heure.setEnabled(false);*/
    }
}
