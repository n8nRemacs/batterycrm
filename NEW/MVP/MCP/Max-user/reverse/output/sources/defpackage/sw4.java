package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.TypedValue;

/* loaded from: classes2.dex */
public final class sw4 {
    public final long a;

    public /* synthetic */ sw4(long j) {
        this.a = j;
    }

    public static long a(int i, float f) {
        return Float.floatToIntBits(f) + (i << 32);
    }

    public static final float b(long j, Context context) {
        return c(j, context.getResources().getDisplayMetrics());
    }

    public static final float c(long j, DisplayMetrics displayMetrics) {
        return TypedValue.applyDimension((int) (j >> 32), d(j), displayMetrics);
    }

    public static final float d(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof sw4) {
            return this.a == ((sw4) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return a9h.d(this.a, "Dimension(encodedValue=", ")");
    }
}
