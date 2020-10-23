package com.example.fro;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.app.Notification;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Base64;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.FirebaseAuth;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

public class TelaInicial extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;

    FirebaseAuth mFirebaseAuth;
    private FirebaseAuth.AuthStateListener mAuthStateListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_inicial);

        /* Hooks */
        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);
        toolbar = findViewById(R.id.customToolbar);

        /* Toolbar */
        setSupportActionBar(toolbar);
        setTitle(" ");

        /* Menu de navegação Drawer */
        navigationView.bringToFront();
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigationDrawerOpen, R.string.navigationDrawerClose);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(this);
        setNavigationViewListener();

        // Deixa seleção verdinha
        navigationView.setCheckedItem(R.id.itInicio);
    }

    public void funcLogout(){

    }

    @Override
    public void onBackPressed() {
        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }
        else{
            super.onBackPressed();
        }
    }

    public void abrirTelaCadastroPlanta(View view){
        Intent intent = new Intent(this, TipoCadastroPlanta.class);
        startActivity(intent);
    }

    private void setNavigationViewListener() {
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        // Handle navigation view item clicks here.
        switch (item.getItemId()) {

            case R.id.itInicio: {
                Intent intent = new Intent(this, TelaInicial.class);
                startActivity(intent);

                break;
            }

            case R.id.itTarefas: {
                Intent intent = new Intent(this, TelaTarefas.class);
                startActivity(intent);

                break;
            }

            case R.id.itDoacoes: {
                Intent intent = new Intent(this, TelaDoacoes.class);
                startActivity(intent);

                break;
            }

            case R.id.itNotifAtiva: {
                Intent intent = new Intent(this, TelaNotificacoes.class);
                startActivity(intent);

                break;
            }

            case R.id.itAboutUs: {
                Intent intent = new Intent(this, TelaSobre.class);
                startActivity(intent);

                break;
            }

            case R.id.itAmigos: {
                Intent intent = new Intent(this, TelaAmigos.class);
                startActivity(intent);

                break;
            }

            case R.id.itPerfil: {
                Intent intent = new Intent(this, TelaPerfil.class);
                startActivity(intent);

                break;
            }

            case R.id.itPlantas: {
                Intent intent = new Intent(this, TelaPlantas.class);
                startActivity(intent);

                break;
            }

            case R.id.itLogout: {
                FirebaseAuth.getInstance().signOut();

                Intent intToLoginPage = new Intent(TelaInicial.this, MainActivity.class);
                startActivity(intToLoginPage);

                break;
            }

        }
        //close navigation drawer
        drawerLayout.closeDrawer(GravityCompat.START);

        return true;
    }



    public void abrirPerfil(){
        Intent intent = new Intent(this, TelaPerfil.class);
        startActivity(intent);
    }
}