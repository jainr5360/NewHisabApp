package com.example.rahuljain.hisabdaily;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.example.rahuljain.hisabdaily.fragment.AddDailyByCalnder;
import com.example.rahuljain.hisabdaily.fragment.CalculationFragment;
import com.example.rahuljain.hisabdaily.fragment.SeenMonthlyInvest;

public class MainActivity extends AppCompatActivity {

//    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
//                    mTextMessage.setText(R.string.title_home);

                    FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                    CalculationFragment calculationFragment = new CalculationFragment();
                    fragmentTransaction.add(R.id.content, calculationFragment);
                    fragmentTransaction.commit();

                    return true;
                case R.id.navigation_dashboard:
                    FragmentTransaction fragmentTransaction1 = getSupportFragmentManager().beginTransaction();
                    AddDailyByCalnder addDailyByCalnder = new AddDailyByCalnder();
                    fragmentTransaction1.add(R.id.content, addDailyByCalnder);
                    fragmentTransaction1.commit();

                    return true;
                case R.id.navigation_notifications:

                    FragmentTransaction fragmentTransaction2 = getSupportFragmentManager().beginTransaction();
                    SeenMonthlyInvest seenMonthlyInvest = new SeenMonthlyInvest();
                    fragmentTransaction2.add(R.id.content, seenMonthlyInvest);
                    fragmentTransaction2.commit();

                    return true;
            }
            return false;
        }

    };

    FrameLayout frameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        frameLayout = (FrameLayout) findViewById(R.id.content);

    }

}
