package com.example.jokeactivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    public static final String EXTRA_TEXT = "EXTRA_TEXT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        ActionBar actionBar = getSupportActionBar();

        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        TextView contentView = (TextView) findViewById(R.id.content);

        Intent intent = getIntent();

        if (intent.hasExtra(EXTRA_TEXT)) {
            String text = intent.getStringExtra(EXTRA_TEXT);

            contentView.setText(text);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();

                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
