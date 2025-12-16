package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import defpackage.cuc;

/* loaded from: classes.dex */
public class ExcludedSupportedSizesQuirk implements cuc {
    public static boolean e() {
        return "SAMSUNG".equalsIgnoreCase(Build.BRAND) && "J7XELTE".equalsIgnoreCase(Build.DEVICE) && Build.VERSION.SDK_INT >= 27;
    }

    public static boolean f() {
        return "SAMSUNG".equalsIgnoreCase(Build.BRAND) && "ON7XELTE".equalsIgnoreCase(Build.DEVICE) && Build.VERSION.SDK_INT >= 27;
    }
}
