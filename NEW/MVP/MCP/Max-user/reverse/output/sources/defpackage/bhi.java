package defpackage;

import android.os.Bundle;
import android.os.Parcelable;

/* loaded from: classes.dex */
public abstract class bhi {
    public static final kc3 a = new kc3(29);

    public static long a(int i, int i2) {
        return (i2 & 4294967295L) | (i << 32);
    }

    public static long b(qyg qygVar, int i, int i2) {
        qygVar.E(i);
        if (qygVar.c() < 5) {
            return -9223372036854775807L;
        }
        int iF = qygVar.f();
        if ((8388608 & iF) != 0 || ((2096896 & iF) >> 8) != i2 || (iF & 32) == 0 || qygVar.s() < 7 || qygVar.c() < 7 || (qygVar.s() & 16) != 16) {
            return -9223372036854775807L;
        }
        qygVar.e(0, new byte[6], 6);
        return ((r0[0] & 255) << 25) | ((r0[1] & 255) << 17) | ((r0[2] & 255) << 9) | ((r0[3] & 255) << 1) | ((r0[4] & 255) >> 7);
    }

    public static Parcelable c(String str, Bundle bundle) {
        ClassLoader classLoader = bhi.class.getClassLoader();
        s5j.g(classLoader);
        bundle.setClassLoader(classLoader);
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            return null;
        }
        bundle2.setClassLoader(classLoader);
        return bundle2.getParcelable(str);
    }

    public static void d(Bundle bundle, Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            return;
        }
        Parcelable parcelableC = c("MapOptions", bundle);
        if (parcelableC != null) {
            e(bundle2, "MapOptions", parcelableC);
        }
        Parcelable parcelableC2 = c("StreetViewPanoramaOptions", bundle);
        if (parcelableC2 != null) {
            e(bundle2, "StreetViewPanoramaOptions", parcelableC2);
        }
        Parcelable parcelableC3 = c("camera", bundle);
        if (parcelableC3 != null) {
            e(bundle2, "camera", parcelableC3);
        }
        if (bundle.containsKey("position")) {
            bundle2.putString("position", bundle.getString("position"));
        }
        if (bundle.containsKey("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT")) {
            bundle2.putBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", bundle.getBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", false));
        }
    }

    public static void e(Bundle bundle, String str, Parcelable parcelable) {
        ClassLoader classLoader = bhi.class.getClassLoader();
        s5j.g(classLoader);
        bundle.setClassLoader(classLoader);
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        bundle2.setClassLoader(classLoader);
        bundle2.putParcelable(str, parcelable);
        bundle.putBundle("map_state", bundle2);
    }
}
