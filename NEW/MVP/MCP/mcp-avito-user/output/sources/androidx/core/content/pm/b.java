package androidx.core.content.pm;

import android.content.pm.PackageInfo;
import android.os.Build;
import j.N;
import j.X;

/* compiled from: PackageInfoCompat.java */
/* loaded from: classes.dex */
public final class b {

    /* compiled from: PackageInfoCompat.java */
    @X
    public static class a {
        public static long a(PackageInfo packageInfo) {
            return packageInfo.getLongVersionCode();
        }
    }

    public static long a(@N PackageInfo packageInfo) {
        return Build.VERSION.SDK_INT >= 28 ? a.a(packageInfo) : packageInfo.versionCode;
    }
}
