package l0;

import kotlin.Metadata;

/* compiled from: GeometryUtils.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-geometry_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class c {
    @Y61.k
    public static final String a(float f12) {
        if (Float.isNaN(f12)) {
            return "NaN";
        }
        if (Float.isInfinite(f12)) {
            return f12 < 0.0f ? "-Infinity" : "Infinity";
        }
        int iMax = Math.max(1, 0);
        float fPow = (float) Math.pow(10.0f, iMax);
        float f13 = f12 * fPow;
        int i12 = (int) f13;
        if (f13 - i12 >= 0.5f) {
            i12++;
        }
        float f14 = i12 / fPow;
        return iMax > 0 ? String.valueOf(f14) : String.valueOf((int) f14);
    }
}
