package androidr.example.com.rantidwitaputri_1202154298_studycase4;

import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.io.InputStream;
import java.net.URL;

public class CariGambar extends AppCompatActivity {

    ImageView gambar;
    EditText sumber;


    @Override
    protected void onCreate(Bundle state) {
        super.onCreate(state);
        setContentView(R.layout.activity_cari_gambar);
        setTitle("AsyncTask"); //set title pada tampilan

        //memanggil variabel yang ada pada layout
        gambar = (ImageView)findViewById(R.id.tampilGambar);
        sumber = (EditText)findViewById(R.id.inputLink);
    }
    //method saat button ditekan
    public void klikCari(View view) {
        //loading gambar dari internet ke imageview
        Picasso.with(CariGambar.this).load(sumber.getText().toString())
                .placeholder(R.mipmap.ic_launcher_round)
                .error(R.mipmap.ic_launcher)
                .into(gambar);
    }
}
