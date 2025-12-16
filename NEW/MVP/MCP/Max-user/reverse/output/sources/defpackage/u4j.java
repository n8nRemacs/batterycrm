package defpackage;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;

/* loaded from: classes.dex */
public abstract class u4j {
    public static void a(int i, String str) {
        if (i < 0) {
            throw new IllegalArgumentException(xc0.e(i, str, " cannot be negative but was: "));
        }
    }

    public static final PackageInfo b(PackageManager packageManager, String str) {
        return Build.VERSION.SDK_INT >= 33 ? packageManager.getPackageInfo(str, PackageManager.PackageInfoFlags.of(0)) : packageManager.getPackageInfo(str, 0);
    }
}
