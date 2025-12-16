package l0;

import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import l0.C43522a;

/* compiled from: RoundRect.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-geometry_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class m {
    @Y61.k
    public static final l a(float f12, float f13, float f14, float f15, float f16, float f17) {
        long jFloatToRawIntBits = (Float.floatToRawIntBits(f16) << 32) | (Float.floatToRawIntBits(f17) & 4294967295L);
        C43522a.C11768a c11768a = C43522a.f413378b;
        return new l(f12, f13, f14, f15, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits, null);
    }

    @Y61.k
    public static final l b(float f12, float f13, float f14, float f15, long j12) {
        return a(f12, f13, f14, f15, Float.intBitsToFloat((int) (j12 >> 32)), Float.intBitsToFloat((int) (j12 & 4294967295L)));
    }

    public static final boolean c(@Y61.k l lVar) {
        long j12 = lVar.f413398e;
        return (j12 >>> 32) == (4294967295L & j12) && j12 == lVar.f413399f && j12 == lVar.f413400g && j12 == lVar.f413401h;
    }
}
