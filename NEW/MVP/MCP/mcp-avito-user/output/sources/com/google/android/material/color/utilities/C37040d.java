package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

/* compiled from: Contrast.java */
@RestrictTo
/* renamed from: com.google.android.material.color.utilities.d, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C37040d {
    public static double a(double d12, double d13) {
        return b(C37039c.b(d12), C37039c.b(d13));
    }

    public static double b(double d12, double d13) {
        double dMax = Math.max(d12, d13);
        if (dMax != d13) {
            d12 = d13;
        }
        return (dMax + 5.0d) / (d12 + 5.0d);
    }
}
