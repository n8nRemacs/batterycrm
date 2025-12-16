package E0;

import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: MathHelpers.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-util_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class e {
    public static final float a(float f12) {
        float fIntBitsToFloat = Float.intBitsToFloat(((int) ((Float.floatToRawIntBits(f12) & 8589934591L) / 3)) + 709952852);
        float f13 = fIntBitsToFloat - ((fIntBitsToFloat - (f12 / (fIntBitsToFloat * fIntBitsToFloat))) * 0.33333334f);
        return f13 - ((f13 - (f12 / (f13 * f13))) * 0.33333334f);
    }

    public static final float b(float f12, float f13, float f14) {
        return (f14 * f13) + ((1 - f14) * f12);
    }

    public static final int c(float f12, int i12, int i13) {
        return i12 + ((int) Math.round((i13 - i12) * f12));
    }
}
