package defpackage;

import android.content.pm.PackageManager;

/* loaded from: classes.dex */
public abstract class mlb {
    public static boolean a(PackageManager packageManager) {
        return packageManager.hasSystemFeature("android.hardware.fingerprint");
    }
}
