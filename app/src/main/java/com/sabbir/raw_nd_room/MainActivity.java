package com.sabbir.raw_nd_room;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private WordlistDatabase mDbase;
    private TextView mTextView;



    @SuppressLint("DefaultLocale")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = findViewById(R.id.text_view);
        mDbase = new WordlistDatabase(this);

        List<Word>  words = mDbase.getAllWords();
        StringBuilder output = new StringBuilder();
        for(Word word : words){
            output.append(String.format("%d %s %s\n",word.getId(),word.getWord(),word.getDefinition()));
        }

        Word word2 = mDbase.getWordById(22);
        if(word2 != null){
            output.append("\n Found word:\n ");
            output.append(String.format("%d %s %s\n", word2.getId(),word2.getWord(),word2.getDefinition()));
        }
        else {
            output.append("\nWord not found\n");
        }

        mTextView.setText(output);

    }
}