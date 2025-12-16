package com.yandex.mobile.ads.impl;

import android.os.Environment;

/* loaded from: classes8.dex */
public final class yv {
    public static boolean a() {
        String externalStorageState = Environment.getExternalStorageState();
        return "mounted".equals(externalStorageState) || !(Environment.isExternalStorageRemovable() || "mounted_ro".equals(externalStorageState));
    }
}
