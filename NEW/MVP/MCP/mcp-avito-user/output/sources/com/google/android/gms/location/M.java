package com.google.android.gms.location;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes6.dex */
public final class M {
    public static String a(int i12) {
        if (i12 == 0) {
            return "GRANULARITY_PERMISSION_LEVEL";
        }
        if (i12 == 1) {
            return "GRANULARITY_COARSE";
        }
        if (i12 == 2) {
            return "GRANULARITY_FINE";
        }
        throw new IllegalArgumentException();
    }
}
