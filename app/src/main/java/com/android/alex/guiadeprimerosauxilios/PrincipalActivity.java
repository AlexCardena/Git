package com.android.alex.guiadeprimerosauxilios;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;

public class PrincipalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    public void salir(View v)
    {
        finish();
    }

    public void quemadura(View view)
    {
        Intent intent = new Intent(PrincipalActivity.this,QuemaduraActivity.class);
        startActivity(intent);
    }
    public void cardiaco(View view)
    {
        Intent intent = new Intent(PrincipalActivity.this,AtaqueCardiacoActivity.class);
        startActivity(intent);
    }
    public void exploracion(View view)
    {
        Intent intent = new Intent(PrincipalActivity.this,ExploracionActivity.class);
        startActivity(intent);
    }
    public void desmayo(View view)
    {
        Intent intent = new Intent(PrincipalActivity.this,DesmayoActivity.class);
        startActivity(intent);
    }
    public void envenenamiento(View view)
    {
        Intent intent = new Intent(PrincipalActivity.this,EnvenenamientoActivity.class);
        startActivity(intent);
    }
    public void herida(View view)
    {
        Intent intent = new Intent(PrincipalActivity.this,HeridasProfundasActivity.class);
        startActivity(intent);
    }
    public void alergia(View view)
    {
        Intent intent = new Intent(PrincipalActivity.this,ReaccionesAlergicasActivity.class);
        startActivity(intent);
    }
    public void sofocacion(View view)
    {
        Intent intent = new Intent(PrincipalActivity.this,SofocacionActivity.class);
        startActivity(intent);
    }
    public void dentales(View view)
    {
        Intent intent = new Intent(PrincipalActivity.this,ProblemasDentalesActivity.class);
        startActivity(intent);
    }
    public void esguince(View view)
    {
        Intent intent = new Intent(PrincipalActivity.this,EsguinceActivity.class);
        startActivity(intent);
    }
    public void electrocucion(View view)
    {
        Intent intent = new Intent(PrincipalActivity.this,ElectrocucionActivity.class);
        startActivity(intent);
    }
    public void venda(View view)
    {
        Intent intent = new Intent(PrincipalActivity.this,VendasActivity.class);
        startActivity(intent);
    }
    public void mordedura(View view)
    {
        Intent intent = new Intent(PrincipalActivity.this,MordeduraActivity.class);
        startActivity(intent);
    }
    public void respiracion(View view)
    {
        Intent intent = new Intent(PrincipalActivity.this,BocaABocaActivity.class);
        startActivity(intent);
    }
    public void rcp(View view)
    {
        Intent intent = new Intent(PrincipalActivity.this,RCPActivity.class);
        startActivity(intent);
    }
    public void oftalmologica(View view)
    {
        Intent intent = new Intent(PrincipalActivity.this,OftalmologicaActivity.class);
        startActivity(intent);
    }
    public void botiquin(View view)
    {
        Intent intent = new Intent(PrincipalActivity.this,BotiquinActivity.class);
        startActivity(intent);
    }

}

