/*
 * Copyright (C) 2015 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ihm.rps;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

/**
 * Provides UI for the view with List.
 */
public class AdminContentFragment extends Fragment {
    final String [] col1 = {"8H - 10H","10H - 12H", "", "13H - 15H","15H - 17H"};
    final String [] col2 = {"Libre","Libre","","Intervention","Intervention"};

    TableLayout table; // on prend le tableau défini dans le layout
    TableRow row; // création d'un élément : ligne
    TextView tv1,tv2; // création des cellules
    Button bt;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.item_admin, null);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        table = (TableLayout) getView().findViewById(R.id.idTable);
        initTab();
    }

    private void initTab() {

        for(int i=0;i<col1.length;i++) {
            row = new TableRow(getActivity()); // création d'une nouvelle ligne

            tv1 = new TextView(getActivity()); // création cellule
            tv1.setText(col1[i]); // ajout du texte
            tv1.setGravity(Gravity.CENTER); // centrage dans la cellule
            // adaptation de la largeur de colonne à l'écran :
            tv1.setLayoutParams( new TableRow.LayoutParams( 0, android.view.ViewGroup.LayoutParams.WRAP_CONTENT, 1 ) );
            //tv1.setWidth(1);
            /*tv1.setWidth(50);
            tv1.setHeight(150);
            tv1.setBackgroundColor(Color.BLUE);*/

            tv1.setTextSize(20);



            // idem 2ème cellule

            tv2 = new TextView(getActivity());
            tv2.setText(col2[i]);
            tv2.setGravity(Gravity.CENTER);
            tv2.setWidth(100);
            tv2.setHeight(100);

            tv2.setLayoutParams( new TableRow.LayoutParams( 0, android.view.ViewGroup.LayoutParams.WRAP_CONTENT, 1 ) );

            /*bt = new Button(getActivity());
            bt.setText(col2[i]);
            bt.setHeight(100);
            bt.setLayoutParams(new TableRow.LayoutParams( 0, android.view.ViewGroup.LayoutParams.WRAP_CONTENT, 1 ));

            bt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog alertDialog = new AlertDialog.Builder(getView().getContext()).create();
                    alertDialog.setTitle("Alert");
                    alertDialog.setMessage("Alert message to be shown");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    alertDialog.show();
                }
            });*/



            // ajout des cellules à la ligne
            row.addView(tv1);
            //row.addView(bt);
            row.addView(tv2);



            // ajout de la ligne au tableau
            table.addView(row);
        }
    }
}
