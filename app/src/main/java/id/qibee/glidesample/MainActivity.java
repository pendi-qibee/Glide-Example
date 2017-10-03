package id.qibee.glidesample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    private String URL_IMAGE = "https://cdn-images-1.medium.com/max/800/1*8CMQ8mBe8BknsVk0fpJqqg.png";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageViewOveride = (ImageView) findViewById(R.id.ivOveride);
        ImageView imageViewCropcenter = (ImageView) findViewById(R.id.ivCropCenter);
        ImageView imageViewFit = (ImageView) findViewById(R.id.ivFit);
        ImageView imageViewThumbnail = (ImageView) findViewById(R.id.ivThumbnail);


        Glide
                .with(this)
                .load(URL_IMAGE)
                .override(300,200)
                .into(imageViewOveride);

        Glide
                .with(this)
                .load(URL_IMAGE)
                .centerCrop()
                .into(imageViewCropcenter);

        Glide
                .with(this)
                .load(URL_IMAGE)
                .fitCenter()
                .into(imageViewFit);

        Glide
                .with(this)
                .load(URL_IMAGE)
                .thumbnail(1)
                .into(imageViewThumbnail);


    }

}
