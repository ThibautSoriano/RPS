package ihm.rps;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ReportActivity extends Activity {

    boolean status = false;
    Button bn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);

        bn = (Button) findViewById(R.id.bn);

        bn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                if (!status) {
                    FragmentTwo bf = new FragmentTwo();

                    fragmentManager.beginTransaction().replace(R.id.fragment_container, ).commit();


                }
            }
        });
    }
}
