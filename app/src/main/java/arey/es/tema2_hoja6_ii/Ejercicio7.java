package arey.es.tema2_hoja6_ii;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class Ejercicio7 extends AppCompatActivity {

    public static final String TAG = "Ejercicio7";

    private ImageView anImageView1;
    private ImageView anImageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio7);

        anImageView1 = (ImageView)findViewById(R.id.imageView1Ej7);
        anImageView2 = (ImageView)findViewById(R.id.imageView2Ej7);

        // Ambos elementos comparten el menú contextual
        registerForContextMenu(anImageView1);
        registerForContextMenu(anImageView2);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.menu_ejercicio7, menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.item1Ej7: Log.i(TAG, "Se ha pulsado el primer botón"); break;
            case R.id.item2Ej7: Log.i(TAG, "Se ha pulsado el segundo botón"); break;
            case R.id.item3Ej7: Log.i(TAG, "Se ha pulsado el tercer botón"); break;

        }
        return super.onContextItemSelected(item);
    }
}
