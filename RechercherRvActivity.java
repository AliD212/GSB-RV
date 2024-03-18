package fr.gsb;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import fr.gsb.rv.models.ModeleGsb ;

import androidx.appcompat.app.AppCompatActivity;

public class RechercherRvActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private static final String [] lesmois = {"janvier", "février", "mars","avril","mai","juin","juillet", "août","septembre","octobre","novembre", "decembre"} ;
    private static final String [] lesannee = {"2024", "2023", "2022","2021","2020","2019","2018", "2017","2016","2015"} ;
Spinner selectmois ;
Spinner selectannee ;

TextView tvmois ;
TextView tvannee ;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rechercher_rv_activity);
        tvmois = (TextView) findViewById(R.id.tvmois) ;
        tvannee = (TextView) findViewById(R.id.tvannee);
        tvmois.setText("Mois :");
        tvannee.setText("Annee :");

        selectmois = (Spinner) findViewById(R.id.mois) ;
        selectannee = (Spinner) findViewById(R.id.annee) ;
        ArrayAdapter<String> aamois = new ArrayAdapter<String>( this , android.R.layout.simple_spinner_item , lesmois) ;
        ArrayAdapter<String> aanne = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item , lesannee) ;
        aamois.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        aanne.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        selectmois.setAdapter( aamois);
        selectannee.setAdapter(aanne);



    }
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        String  selectmois = parent.getItemAtPosition(position).toString();


    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    public void afficherrv(View vue) {
        Intent intention = new Intent(this, VisuRvActivity.class) ;
        startActivity( intention);
    }

}
