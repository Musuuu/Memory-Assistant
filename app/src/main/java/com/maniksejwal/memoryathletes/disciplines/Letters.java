package com.maniksejwal.memoryathletes.disciplines;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

import com.maniksejwal.memoryathletes.R;

import java.util.Random;

public class Letters extends Disciplines {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ((EditText) findViewById(R.id.no_of_values)).setHint(getString(R.string.enter) + " " + getString(R.string.st));
        Log.i(TAG, "Activity Created");
    }

    @Override
    protected String background() {
        //String textString = "";
        StringBuilder stringBuilder = new StringBuilder();
        Random rand = new Random();
        int n;

        for (int i = 0; i < a.get(1); i++) {
            for (int j = 0; j < a.get(0); j++) {
                n = rand.nextInt(26) + 97;
                stringBuilder.append((char) n).append(getString(R.string.tab));;
                if (a.get(2) == 0) break;
            }
            stringBuilder.append("   ");
        }
        Log.v(TAG, stringBuilder.toString());
        return stringBuilder.toString();
    }
}