package com.avito.android.util;

import android.content.res.Resources;
import kotlin.Metadata;

/* compiled from: ViewSize.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_common-discouraged_utils_android"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class y6 {
    @j.U
    public static final int a(float f12) {
        return (int) (f12 * Resources.getSystem().getDisplayMetrics().density);
    }

    @j.U
    public static final int b(int i12) {
        return (int) (i12 * Resources.getSystem().getDisplayMetrics().density);
    }

    @j.U
    public static final int c(double d12) {
        double d13 = d12 * Resources.getSystem().getDisplayMetrics().density;
        return d13 % ((double) 1) == 0.0d ? (int) d13 : d13 > 0.0d ? kotlin.math.b.a(d13 + 0.5d) : kotlin.math.b.a(d13 - 0.5d);
    }

    @j.U
    public static final int d(int i12) {
        return g(i12 * Resources.getSystem().getDisplayMetrics().density);
    }

    @j.r
    public static final int e(int i12) {
        return (int) (i12 / Resources.getSystem().getDisplayMetrics().density);
    }

    @j.U
    public static final int f(int i12) {
        return (int) (i12 * Resources.getSystem().getDisplayMetrics().scaledDensity);
    }

    public static final int g(float f12) {
        return f12 % 1.0f == 0.0f ? (int) f12 : f12 > 0.0f ? kotlin.math.b.b(f12 + 0.5f) : kotlin.math.b.b(f12 - 0.5f);
    }
}
