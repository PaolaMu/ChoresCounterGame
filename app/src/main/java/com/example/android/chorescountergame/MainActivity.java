package com.example.android.chorescountergame;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // Tracks the score for Parents
    int scoreParents = 0 ;

    // Tracks the score for Kids
    int scoreKids = 0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increase the score for Parents by 1 point.
     */
    public void addOneForParents(View v) {
        scoreParents = scoreParents + 1 ;
        displayForParents (scoreParents);
    }

    /**
     * Increase the score for Parents by 2 points.
     */
    public void addTwoForParents(View v) {
        scoreParents = scoreParents + 2;
        displayForParents (scoreParents);
    }

    /**
     * Increase the score for Parents2 by 2 points.
     */
    public void addTwoForParents2(View v) {
        scoreParents = scoreParents + 2 ;
        displayForParents (scoreParents);
    }
    /**
     * Increase the score for Parents by 3 points.
     */
    public void addThreeForParents(View v) {
        scoreParents = scoreParents + 3;
        displayForParents (scoreParents);
    }

    /**
     * Increase the score for Parents3 by 3 points.
     */
    public void addThreeForParents3(View v) {
        scoreParents = scoreParents + 3 ;
        displayForParents (scoreParents);
    }
    /**
     * Displays the given score for Parents.
     */
    public void displayForParents(int scoreParents) {
        TextView scoreView = findViewById(R.id.parents_score);
        scoreView.setText(String.valueOf(scoreParents));
    }
    /**
     * Increase the score for Kids by 1 point.
     */
    public void addOneForKids(View v) {
        scoreKids = scoreKids + 1 ;
        displayForKids (scoreKids);
    }

    /**
     * Increase the score for Kids by 2 points.
     */
    public void addTwoForKids(View v) {
        scoreKids = scoreKids + 2;
        displayForKids (scoreKids);
    }

    /**
     * Increase the score for Kids2 by 2 points.
     */
    public void addTwoForKids2(View v) {
        scoreKids = scoreKids + 2 ;
        displayForKids (scoreKids);
    }
    /**
     * Increase the score for Kids by 3 points.
     */
    public void addThreeForKids(View v) {
        scoreKids = scoreKids + 3;
        displayForKids (scoreKids);
    }

    /**
     * Increase the score for Kids3 by 3 points.
     */
    public void addThreeForKids3(View v) {
        scoreKids = scoreKids + 3 ;
        displayForKids (scoreKids);
    }
    /**
     * Displays the given score for Kids.
     */
    public void displayForKids(int scoreKids) {
        TextView scoreView = findViewById(R.id.kids_score);
        scoreView.setText(String.valueOf(scoreKids));
    }

    //Reset the Score for both teams back to 0
    public void resetScore (View v) {
        scoreParents = 0 ;
        scoreKids = 0 ;
        displayForParents (scoreParents);
        displayForKids (scoreKids);
    }
}


