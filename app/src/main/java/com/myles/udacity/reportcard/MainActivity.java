package com.myles.udacity.reportcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //demonstrate class ReportCard functionality
        ReportCard mReportCard = new ReportCard();
        mReportCard.setScore(ReportCard.SUBJECT_ART, 95);
        mReportCard.setScore(ReportCard.SUBJECT_PHY, 88);
        mReportCard.setScore(ReportCard.SUBJECT_CHM, 85);
        Log.v("Myles", mReportCard.toString());
    }
}
