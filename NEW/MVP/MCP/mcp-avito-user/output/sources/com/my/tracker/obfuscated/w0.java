package com.my.tracker.obfuscated;

import android.content.Context;
import android.os.Build;

/* loaded from: classes7.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f365847a;

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f365848b;

    static {
        int i12 = Build.VERSION.SDK_INT;
        boolean z12 = false;
        f365847a = i12 <= 30;
        if (i12 <= 30 && !Build.MODEL.equals("Pixel 5")) {
            z12 = true;
        }
        f365848b = z12;
    }

    public static boolean a() {
        return false;
    }

    public static boolean a(String str, Context context) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }
}
