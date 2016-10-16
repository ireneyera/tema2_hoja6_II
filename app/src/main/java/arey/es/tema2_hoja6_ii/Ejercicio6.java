package arey.es.tema2_hoja6_ii;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class Ejercicio6 extends AppCompatActivity {

    private ImageView anImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio6);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        anImageView = (ImageView)findViewById(R.id.imageViewEj6);
        registerForContextMenu(anImageView);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.menu_ejercicio6, menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        int id = item.getItemId();

        Intent anIntent;
        Uri anUri = null;
        switch (id) {
            case R.id.GoogleAccess: anUri = Uri.parse("http://www.google.com");
                break;
            case R.id.CNNAccess: anUri = Uri.parse("http://www.cnn.com");
                break;
            case R.id.LosEnlacesAccess: anUri = Uri.parse("http://www.cpilosenlaces.com");
                break;
        }

        anIntent = new Intent(Intent.ACTION_VIEW);
        anIntent.setData(anUri);
        startActivity(anIntent);
        return super.onContextItemSelected(item);
    }
}
