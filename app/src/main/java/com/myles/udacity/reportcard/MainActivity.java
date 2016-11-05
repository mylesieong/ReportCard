package com.myles.udacity.reportcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //debug
        ReportCard mReportCard = new ReportCard();
        mReportCard.getScore(ReportCard.SUBJECT_ART);
        mReportCard.setScore(ReportCard.SUBJECT_ART, 95);
        mReportCard.toString();
    }
}
