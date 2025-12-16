package defpackage;

import android.text.SpannableStringBuilder;

/* loaded from: classes.dex */
public abstract class hbj {
    public static final float a(float f, long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        return ((Float.intBitsToFloat((int) (j & 4294967295L)) - fIntBitsToFloat) * f) + fIntBitsToFloat;
    }

    public static void b(SpannableStringBuilder spannableStringBuilder, Object obj, int i, int i2) {
        for (Object obj2 : spannableStringBuilder.getSpans(i, i2, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i && spannableStringBuilder.getSpanEnd(obj2) == i2 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i, i2, 33);
    }

    public static long c(long j, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = Float.intBitsToFloat((int) (j >> 32));
        }
        if ((i & 2) != 0) {
            f2 = Float.intBitsToFloat((int) (j & 4294967295L));
        }
        return m26.a(f, f2);
    }

    public static final boolean d(float f, float f2, float f3) {
        return Math.abs(f - f2) < f3;
    }
}
