package edu.indwes.cis.caleblight.tinyversenotifier;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ReplyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reply);
        textView = (TextView) findViewById(R.id.textView);

        Intent intent = getIntent();
        textView.setText(getMessageText(intent));
    }
    @TargetApi(Build.VERSION_CODES.KITKAT_WATCH)
    private CharSequence getMessageText(Intent intent) {
        Bundle remoteInput = RemoteInput.getResultsFromIntent(intent);
        if (remoteInput != null) {
            return remoteInput.getCharSequence(EXTRA_VOICE_REPLY);
        }
        return null;
    }
}