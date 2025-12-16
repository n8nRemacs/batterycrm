package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes8.dex */
public final class k11 {
    public static boolean a(@j.N Context context) {
        try {
            return context.getPackageManager().hasSystemFeature("android.hardware.touchscreen");
        } catch (Throwable unused) {
            return false;
        }
    }
}
