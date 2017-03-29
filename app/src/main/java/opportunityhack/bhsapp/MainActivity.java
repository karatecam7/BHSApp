package opportunityhack.bhsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void goToFirstAid(View view) {
        Intent intent = new Intent(this, FirstAid.class);
        startActivity(intent);
    }

    public void goToMain(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void goToFoodToAvoid(View view) {
        Intent intent = new Intent(this, FoodToAvoid.class);
        startActivity(intent);
    }

    public void goToFourth(View view) {
        Intent intent = new Intent(this, FourthOfJuly.class);
        startActivity(intent);
    }

    public void goToSidewalks(View view) {
        Intent intent = new Intent(this, HotSidewalk.class);
        startActivity(intent);
    }

    public void goToHouseHazards(View view) {
        Intent intent = new Intent(this, HouseHazard.class);
        startActivity(intent);
    }

    public void goToSwim(View view) {
        Intent intent = new Intent(this, Swim.class);
        startActivity(intent);
    }

    public void goToLitter(View view) {
        Intent intent = new Intent(this, LitterBox.class);
        startActivity(intent);
    }

    public void goToLost(View view) {
        Intent intent = new Intent(this, LostPet.class);
        startActivity(intent);
    }

    public void goToWarmWeather(View view) {
        Intent intent = new Intent(this, WarmWeather.class);
        startActivity(intent);
    }

    public void goToColdWeather(View view) {
        Intent intent = new Intent(this, ColdWeather.class);
        startActivity(intent);
    }

    public void goToChangeName(View view) {
        Intent intent = new Intent(this, ChangeDogName.class);
        startActivity(intent);
    }

    public void goToCatSeperation(View view) {
        Intent intent = new Intent(this, CatSepAnx.class);
        startActivity(intent);

    }

}
