package com.cibertec.grupomartes01;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class LibroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_libro);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_activity, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.idAlumno){
            Intent intent = new Intent(this,AlumnoActivity.class);
            startActivity(intent);
            return true;
        }
        if (id == R.id.idAutor){
            Intent intent = new Intent(this,AutorActivity.class);
            startActivity(intent);
            return true;
        }
        if (id == R.id.idLibro){
            Intent intent = new Intent(this,LibroActivity.class);
            startActivity(intent);
            return true;
        }

        if (id == R.id.idProveedor){
            Intent intent = new Intent(this,ProveedorActivity.class);
            startActivity(intent);
            return true;
        }

        if (id == R.id.idSala){
            Intent intent = new Intent(this,SalaActivity.class);
            startActivity(intent);
            return true;
        }

        if (id == R.id.idUsuario){
            Intent intent = new Intent(this,UsuarioActivity.class);
            startActivity(intent);
            return true;
        }

        if (id == R.id.idEditorial){
            Intent intent = new Intent(this,EditorialActivity.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}