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

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import ihm.rps.metier.Intervention;

/**
 * Provides UI for the view with Cards.
 */
public class TechnicienContentFragment extends Fragment {
    Button btNext;
    TextView tvNext, tvHeure, tvNom, tvCategorie;

    public static List<Intervention> interventions;
    public static int indiceCourant = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        return inflater.inflate(R.layout.item_technicien, null);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initList();
        btNext = (Button) getView().findViewById(R.id.bt_terminee);
        btNext.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), ReportActivity.class));
            }
        });
    }

    private void initList() {

        interventions = new ArrayList<>();
        interventions.add(new Intervention("27/10/2016 - 13H", "M. DUPONT", "Machine à laver", "15H"));
        interventions.add(new Intervention("27/10/2016 - 15H", "M. SANTOS", "Frigo", "Aucun"));
    }

    @Override
    public void onResume() {
        super.onResume();

        Intervention interventionCourante = interventions.get(indiceCourant);

        tvNext = (TextView) getView().findViewById(R.id.tv_next);
        tvHeure = (TextView) getView().findViewById(R.id.tv_heure);
        tvCategorie = (TextView) getView().findViewById(R.id.tv_categorie);
        tvNom = (TextView) getView().findViewById(R.id.tv_nom);



        tvNext.setText("Suivant : " + interventionCourante.getHeureSuivant());
        tvHeure.setText(interventionCourante.getDateHeure());
        tvCategorie.setText(interventionCourante.getCategorie());
        tvNom.setText(interventionCourante.getNomClient());
    }
}

