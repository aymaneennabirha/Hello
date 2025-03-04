package com.example.hello;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DisplayInfoActivity extends AppCompatActivity {

    private TextView textViewInfo;
    private Button buttonRetour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_info);

        textViewInfo = findViewById(R.id.textViewInfo);
        buttonRetour = findViewById(R.id.buttonRetour);

        Intent intent = getIntent();
        String nom = intent.getStringExtra("NOM");
        String prenom = intent.getStringExtra("PRENOM");
        String email = intent.getStringExtra("EMAIL");
        String phone = intent.getStringExtra("PHONE");
        String adresse = intent.getStringExtra("ADRESSE");
        String ville = intent.getStringExtra("VILLE");

        String info = "Nom : " + nom + "\n"
                + "Prénom : " + prenom + "\n"
                + "Email : " + email + "\n"
                + "Téléphone : " + phone + "\n"
                + "Adresse : " + adresse + "\n"
                + "Ville : " + ville;
        textViewInfo.setText(info);

        buttonRetour.setOnClickListener(v -> finish());
    }
}