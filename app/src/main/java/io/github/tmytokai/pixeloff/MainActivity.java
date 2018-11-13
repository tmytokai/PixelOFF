package io.github.tmytokai.pixeloff;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LockAccessibilityService.Lock();
        finish();
    }
}
