package au.edu.jcu.cp3406.guesstheceleb;

import android.content.res.AssetManager;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    ImageManager imageManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        AssetManager manager = getAssets();
//        try {
//            String[] names = manager.list("celebs");
//            System.out.println(Arrays.toString(names));
        imageManager = new ImageManager(this.getAssets(), "celebs");
        ImageView imageView = findViewById(R.id.image);
//
//            InputStream stream = manager.open("celebs/" + names[0]);
//            Bitmap bitmap = BitmapFactory.decodeStream(stream);

        imageView.setImageBitmap(imageManager.get(0));
//    } catch(
//    IOException e)

//        {
//            System.out.println("failed to get names");
//        }
    }
}