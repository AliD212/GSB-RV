package fr.gsb;
import fr.gsb.rv.models.ModeleGsb ;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import fr.gsb.rv.entites.Visiteur;
import fr.gsb.rv.technique.Session ;

import android.util.Log;


public class MainActivity extends AppCompatActivity {

    TextView tvMsg;
    EditText etMatricule;
    EditText etMdp;
    ModeleGsb modele;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvMsg = findViewById(R.id.tvMsg);
        tvMsg.setText("");
        etMatricule = findViewById(R.id.etMatricule);
        etMatricule.setText("");
        etMdp = findViewById(R.id.etMdp);
        etMdp.setText("");

    }

    private static final String TAG = "GSB_MAIN_ACTIVITY";

    public void seConnecter(View view) {
        String matricule = etMatricule.getText().toString();
        String mdp = etMdp.getText().toString();

        Visiteur visiteur = ModeleGsb.getInstance().seConnecter(matricule, mdp);

        if (visiteur != null) {
            tvMsg.setText("Connexion réussie : " + visiteur.getPrenom() + " " + visiteur.getNom());
            Log.i(TAG, "Connexion réussie : " + visiteur.getPrenom() + " " + visiteur.getNom());
            String nom = visiteur.getNom();
            String prenom = visiteur.getPrenom();
            Bundle paquetNom = new Bundle();
            Bundle paquetPrenom = new Bundle();
            paquetNom.putString("nom", nom);
            paquetPrenom.putString("prenom", prenom);
            Intent intention = new Intent(this, ActiviteSecondaire.class) ;
            intention.putExtras( paquetNom);
            intention.putExtras(paquetPrenom) ;
            startActivity( intention);

        } else {
            tvMsg.setText("Échec de la connexion.");
            Log.i(TAG, "Échec de la connexion.");
        }
    }

    public void annuler(View view) {
        etMatricule.setText("");
        etMdp.setText("");
    }
}
