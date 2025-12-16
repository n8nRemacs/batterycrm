package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

/* renamed from: com.yandex.metrica.impl.ob.mn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38987mn {
    @j.P
    public ApplicationInfo a(@j.N Context context, String str, int i12) {
        try {
            return context.getPackageManager().getApplicationInfo(str, i12);
        } catch (Throwable unused) {
            return null;
        }
    }

    @j.P
    public PackageInfo b(Context context, String str, int i12) {
        try {
            return context.getPackageManager().getPackageInfo(str, i12);
        } catch (Throwable unused) {
            return null;
        }
    }

    public boolean a(@j.N Context context, @j.N String str) {
        try {
            return context.getPackageManager().hasSystemFeature(str);
        } catch (Throwable unused) {
            return false;
        }
    }
}
