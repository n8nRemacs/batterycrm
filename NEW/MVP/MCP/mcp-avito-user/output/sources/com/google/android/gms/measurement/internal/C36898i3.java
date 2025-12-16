package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import androidx.media3.common.C23088b;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* renamed from: com.google.android.gms.measurement.internal.i3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36898i3 {
    public static <T> T a(@j.N Bundle bundle, String str, Class<T> cls, T t12) {
        T t13 = (T) bundle.get(str);
        if (t13 == null) {
            return t12;
        }
        if (cls.isAssignableFrom(t13.getClass())) {
            return t13;
        }
        String canonicalName = cls.getCanonicalName();
        throw new IllegalStateException(AK.c.s(C23088b.b("Invalid conditional user property field type. '", str, "' expected [", canonicalName, "] but was ["), t13.getClass().getCanonicalName(), "]"));
    }

    public static void b(@j.N Bundle bundle, @j.N Object obj) {
        if (obj instanceof Double) {
            bundle.putDouble("value", ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            bundle.putLong("value", ((Long) obj).longValue());
        } else {
            bundle.putString("value", obj.toString());
        }
    }
}
