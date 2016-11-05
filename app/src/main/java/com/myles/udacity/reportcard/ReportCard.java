package com.myles.udacity.reportcard;

import android.content.Intent;
import android.util.Log;

import java.util.ArrayList;

/**
 * Report Card Class stores a student's scores of 5 different classes of a certain year.
 * The scoring system is 1-100 out of full score 100.
 * Created by myles on 5/11/2016.
 */

public class ReportCard {

    /**
     * List of subjects static definition
     */
    public static final int SUBJECT_MTH = 0;
    public static final int SUBJECT_PHY = 1;
    public static final int SUBJECT_CHM = 2;
    public static final int SUBJECT_BIO = 3;
    public static final int SUBJECT_ART = 4;

    /**
     * fix length array to store scores
     */
    private int[] scores;

    /**
     * constructor
     */
    public ReportCard(){
        this.scores = new int[5];
        this.scores[ReportCard.SUBJECT_MTH]=-1;
        this.scores[ReportCard.SUBJECT_PHY]=-1;
        this.scores[ReportCard.SUBJECT_CHM]=-1;
        this.scores[ReportCard.SUBJECT_BIO]=-1;
        this.scores[ReportCard.SUBJECT_ART]=-1;
    }

    /**
     * Get score by subject publc method
     * @param subject
     * @return score of subject
     */
    public int getScore(int subject){
        if(subject != ReportCard.SUBJECT_MTH &&
                subject != ReportCard.SUBJECT_PHY &&
                subject != ReportCard.SUBJECT_CHM &&
                subject != ReportCard.SUBJECT_BIO &&
                subject != ReportCard.SUBJECT_ART){
            return -1;
        }
        return this.scores[subject];
    }

    /**
     * Set score by subject and score
     * @param subject
     * @param score
     */
    public void setScore(int subject, int score){
        if(subject != ReportCard.SUBJECT_MTH &&
                subject != ReportCard.SUBJECT_PHY &&
                subject != ReportCard.SUBJECT_CHM &&
                subject != ReportCard.SUBJECT_BIO &&
                subject != ReportCard.SUBJECT_ART){
            return;
        }
        if (score > 100 || score < 0){
            return;
        }
        this.scores[subject] = score;
    }

    /**
     * Get the report card info written into a string
     * @return flatten ReportCard
     */
    public String toString(){
        String s = "Report Card:\n";
        if(this.scores[ReportCard.SUBJECT_MTH]<0){
            s = s + "Score of Mathematics - N/A\n";
        }else{
            s = s + "Score of Mathematics - " + this.scores[ReportCard.SUBJECT_MTH] + "\n";
        }
        if(this.scores[ReportCard.SUBJECT_PHY]<0){
            s = s + "Score of Physics - N/A\n";
        }else{
            s = s + "Score of Physics - " + this.scores[ReportCard.SUBJECT_PHY] + "\n";
        }
        if(this.scores[ReportCard.SUBJECT_CHM]<0){
            s = s + "Score of Chemistry - N/A\n";
        }else{
            s = s + "Score of Chemistry - " + this.scores[ReportCard.SUBJECT_CHM] + "\n";
        }
        if(this.scores[ReportCard.SUBJECT_BIO]<0){
            s = s + "Score of Biology - N/A\n";
        }else{
            s = s + "Score of Biology - " + this.scores[ReportCard.SUBJECT_BIO] + "\n";
        }
        if(this.scores[ReportCard.SUBJECT_ART]<0){
            s = s + "Score of Art - N/A\n";
        }else{
            s = s + "Score of Art - " + this.scores[ReportCard.SUBJECT_ART] + "\n";
        }
        return s;
    }
}
