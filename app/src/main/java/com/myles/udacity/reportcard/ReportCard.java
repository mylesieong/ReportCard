package com.myles.udacity.reportcard;

import android.util.Log;

/**
 * Report Card Class stores a student's scores of 5 different classes of a certain year.
 * The scoring system is 1-100 out of full score 100.
 * Created by myles on 5/11/2016.
 */

public class ReportCard {
    public static final int SUBJECT_MTH = 1;
    public static final int SUBJECT_PHY = 2;
    public static final int SUBJECT_CHM = 3;
    public static final int SUBJECT_BIO = 4;
    public static final int SUBJECT_ART = 5;
    public void getScore(int subject){
        Log.v("Report card", "Invoke getScore ("+subject+").");
    }
    public void setScore(int subject, int score){
        Log.v("Report card", "Invoke setScore ("+subject+","+score+").");
    }
    public String toString(){
        Log.v("Report card", "Invoke toString()");
        return null;
    }
}
