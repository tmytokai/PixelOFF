package io.github.tmytokai.pixeloff;

import android.accessibilityservice.AccessibilityService;
import android.view.accessibility.AccessibilityEvent;
import android.content.Intent;

public class LockAccessibilityService extends AccessibilityService {

    private static LockAccessibilityService instance = null;

    public static void Lock(){
        if( instance != null ) instance.lock_impl();
    }

    @Override
    protected void onServiceConnected() {
        super.onServiceConnected();
        instance = this;
    }

    @Override
    public boolean onUnbind( Intent intent) {
        instance = null;
        return super.onUnbind(intent);
    }

    @Override
    public void onAccessibilityEvent(AccessibilityEvent event) {
    }

    @Override
    public void onInterrupt() {
    }

    public void lock_impl(){
        performGlobalAction(AccessibilityService.GLOBAL_ACTION_LOCK_SCREEN);
    }
}
