package com.google.android.gms.location;

import com.google.android.gms.common.internal.C36729v;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* renamed from: com.google.android.gms.location.u, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36799u {
    public static void a(int i12) {
        boolean z12 = true;
        if (i12 != 100 && i12 != 102 && i12 != 104) {
            if (i12 == 105) {
                i12 = 105;
            } else {
                z12 = false;
            }
        }
        C36729v.c(z12, "priority %d must be a Priority.PRIORITY_* constant", Integer.valueOf(i12));
    }

    public static String b(int i12) {
        if (i12 == 100) {
            return "HIGH_ACCURACY";
        }
        if (i12 == 102) {
            return "BALANCED_POWER_ACCURACY";
        }
        if (i12 == 104) {
            return "LOW_POWER";
        }
        if (i12 == 105) {
            return "PASSIVE";
        }
        throw new IllegalArgumentException();
    }
}
