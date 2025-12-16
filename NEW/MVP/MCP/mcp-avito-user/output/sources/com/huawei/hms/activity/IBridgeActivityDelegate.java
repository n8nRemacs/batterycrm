package com.huawei.hms.activity;

import android.app.Activity;
import android.content.Intent;
import android.view.KeyEvent;

/* loaded from: classes7.dex */
public interface IBridgeActivityDelegate {
    int getRequestCode();

    void onBridgeActivityCreate(Activity activity);

    void onBridgeActivityDestroy();

    boolean onBridgeActivityResult(int i12, int i13, Intent intent);

    void onBridgeConfigurationChanged();

    void onKeyUp(int i12, KeyEvent keyEvent);
}
