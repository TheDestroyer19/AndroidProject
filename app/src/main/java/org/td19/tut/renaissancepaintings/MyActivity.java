package org.td19.tut.renaissancepaintings;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MyActivity extends AppCompatActivity {

    private LinearLayout myPhotoList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        //et reference to linear layout
        myPhotoList = (LinearLayout) findViewById(R.id.linearLayout1);

        //Fill the photo gallery
        fillPaintingGallery();
    }

    private void fillPaintingGallery()
    {
        //Populate the gallery
        ImageButton buttonItem;

        for(int i = 0; i < RenaissanceDataBase.description.length; i++) {
            buttonItem = new ImageButton(this);

            Painting painting = new Painting(RenaissanceDataBase.description[i],
                    RenaissanceDataBase.id[i]);

            buttonItem.setContentDescription(painting.getDescription());

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                buttonItem.setImageDrawable(getResources().getDrawable(painting.getId(), null));
            } else
                //For older devices
                //noinspection deprecation
                buttonItem.setImageDrawable(getResources().getDrawable(painting.getId()));

            buttonItem.setOnClickListener(displayPaintingInformation);

            myPhotoList.addView(buttonItem);
        }
    }

    private final View.OnClickListener displayPaintingInformation =
            new View.OnClickListener() {
                public void onClick(View btn) {
                    String paintingDescription = (String) btn.getContentDescription();
                    displayToast(paintingDescription);
                }
            };

    private void displayToast(String paintingDescription)
    {
        Toast.makeText(this, paintingDescription,
        Toast.LENGTH_SHORT).show();
    }


}
