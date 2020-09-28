package com.corona.coronazp20;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText username = findViewById(R.id.username); //identifikuoja username R-resource (grazinanti funkcija)

        Button login = findViewById(R.id.login);
        final Button register = finViewById(R.id.register);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // čia bus vykdomas kodas, kai paspaudžiamas mygtukas
                Toast.makeText(LoginActivity.this,
                        username.getText().toString(),
                        Toast.LENGTH_SHORT).show();

                username.setError(null);
                if (Validation.isValidUsername(username.getText().toString())) {
                    Intent goToSearchActivity = new Intent(LoginActivity.this, SearchActivity.class);
                    startActivity(goToSearchActivity);
                } else { // jeigu username neteisingas
                    username.setError("Error! Wrong username");
                    username.requestFocus();
                }


            }
        }); //baigiasi logika su login mygtuku

        register.setOnClickListener(new View.sentOnClickListener() (
        @Override
                public void onClick (View v)(
                    Intent goToRegistryActivity = new Intent (LoginActivity.class);
                    startAtivity (goToRegisterActivity);
    } //funkcijos pabaiga

} //uzdaro klase
