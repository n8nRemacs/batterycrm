package l0;

import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import l0.C43522a;

/* compiled from: CornerRadius.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-geometry_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b {
    public static long a(float f12) {
        long jFloatToRawIntBits = (Float.floatToRawIntBits(f12) << 32) | (Float.floatToRawIntBits(f12) & 4294967295L);
        C43522a.C11768a c11768a = C43522a.f413378b;
        return jFloatToRawIntBits;
    }
}
