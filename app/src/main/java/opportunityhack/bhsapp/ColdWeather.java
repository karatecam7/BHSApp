package opportunityhack.bhsapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class ColdWeather extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cold_weather);
    }

    public void goToActivitymain(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}

