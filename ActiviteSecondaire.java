package fr.gsb;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ActiviteSecondaire extends AppCompatActivity {

    TextView tvClient ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activite_seconde);
        tvClient = findViewById(R.id.tvClient);
        tvClient.setText("");
        Bundle paquetNom = this.getIntent().getExtras();
        String nom = paquetNom.getString("nom");
        Bundle paquetPrenom = this.getIntent().getExtras();
        String prenom = paquetNom.getString("prenom");
        tvClient.setText(nom + " " + prenom);
    }


    public void nextview(View vue) {
        Intent intention = new Intent(this, RechercherRvActivity.class) ;
        startActivity( intention);
    }
}
