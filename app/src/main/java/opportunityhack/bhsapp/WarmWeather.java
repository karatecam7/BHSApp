package opportunityhack.bhsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class WarmWeather extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.change_dog_name);
    }

    public void goToActivitymain(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
