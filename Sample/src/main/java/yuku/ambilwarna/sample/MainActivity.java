package yuku.ambilwarna.sample;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import yuku.ambilwarna.AmbilWarnaDialog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn).setOnClickListener(v -> {

            AmbilWarnaDialog dialog = new AmbilWarnaDialog(v.getContext(), Color.BLUE, new AmbilWarnaDialog.OnAmbilWarnaListener() {
                @Override
                public void onCancel(AmbilWarnaDialog dialog) {

                }

                @Override
                public void onOk(AmbilWarnaDialog dialog, int color) {
                    Toast.makeText(MainActivity.this, "" + color, Toast.LENGTH_SHORT).show();
                }
            }, "确定", "取消");

            dialog.show();

        });

    }
}