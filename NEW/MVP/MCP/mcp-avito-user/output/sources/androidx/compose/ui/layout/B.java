package androidx.compose.ui.layout;

import androidx.compose.ui.node.AbstractC22443w0;
import kotlin.Metadata;
import l0.g;

/* compiled from: LayoutCoordinates.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class B {
    @Y61.k
    public static final l0.j a(@Y61.k A a12) {
        l0.j jVarP;
        A aX2 = a12.x();
        return (aX2 == null || (jVarP = aX2.P(a12, true)) == null) ? new l0.j(0.0f, 0.0f, (int) (a12.a() >> 32), (int) (a12.a() & 4294967295L)) : jVarP;
    }

    @Y61.k
    public static final l0.j b(@Y61.k A a12) {
        A aC2 = c(a12);
        float fA2 = (int) (aC2.a() >> 32);
        float fA3 = (int) (aC2.a() & 4294967295L);
        l0.j jVarP = aC2.P(a12, true);
        float f12 = jVarP.f413390a;
        if (f12 < 0.0f) {
            f12 = 0.0f;
        }
        if (f12 > fA2) {
            f12 = fA2;
        }
        float f13 = jVarP.f413391b;
        if (f13 < 0.0f) {
            f13 = 0.0f;
        }
        if (f13 > fA3) {
            f13 = fA3;
        }
        float f14 = jVarP.f413392c;
        if (f14 < 0.0f) {
            f14 = 0.0f;
        }
        if (f14 <= fA2) {
            fA2 = f14;
        }
        float f15 = jVarP.f413393d;
        float f16 = f15 >= 0.0f ? f15 : 0.0f;
        if (f16 <= fA3) {
            fA3 = f16;
        }
        if (f12 == fA2 || f13 == fA3) {
            l0.j.f413388e.getClass();
            return l0.j.f413389f;
        }
        g.a aVar = l0.g.f413384b;
        long jO2 = aC2.O((Float.floatToRawIntBits(f12) << 32) | (Float.floatToRawIntBits(f13) & 4294967295L));
        long jO3 = aC2.O((Float.floatToRawIntBits(f13) & 4294967295L) | (Float.floatToRawIntBits(fA2) << 32));
        long jO4 = aC2.O((Float.floatToRawIntBits(fA2) << 32) | (Float.floatToRawIntBits(fA3) & 4294967295L));
        long jO5 = aC2.O((Float.floatToRawIntBits(fA3) & 4294967295L) | (Float.floatToRawIntBits(f12) << 32));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jO2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jO3 >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jO5 >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jO4 >> 32));
        float fMin = Math.min(fIntBitsToFloat, Math.min(fIntBitsToFloat2, Math.min(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fMax = Math.max(fIntBitsToFloat, Math.max(fIntBitsToFloat2, Math.max(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jO2 & 4294967295L));
        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jO3 & 4294967295L));
        float fIntBitsToFloat7 = Float.intBitsToFloat((int) (jO5 & 4294967295L));
        float fIntBitsToFloat8 = Float.intBitsToFloat((int) (jO4 & 4294967295L));
        return new l0.j(fMin, Math.min(fIntBitsToFloat5, Math.min(fIntBitsToFloat6, Math.min(fIntBitsToFloat7, fIntBitsToFloat8))), fMax, Math.max(fIntBitsToFloat5, Math.max(fIntBitsToFloat6, Math.max(fIntBitsToFloat7, fIntBitsToFloat8))));
    }

    @Y61.k
    public static final A c(@Y61.k A a12) {
        A a13;
        A aX2 = a12.x();
        while (true) {
            A a14 = aX2;
            a13 = a12;
            a12 = a14;
            if (a12 == null) {
                break;
            }
            aX2 = a12.x();
        }
        AbstractC22443w0 abstractC22443w0 = a13 instanceof AbstractC22443w0 ? (AbstractC22443w0) a13 : null;
        if (abstractC22443w0 == null) {
            return a13;
        }
        AbstractC22443w0 abstractC22443w02 = abstractC22443w0.f40913r;
        while (true) {
            AbstractC22443w0 abstractC22443w03 = abstractC22443w02;
            AbstractC22443w0 abstractC22443w04 = abstractC22443w0;
            abstractC22443w0 = abstractC22443w03;
            if (abstractC22443w0 == null) {
                return abstractC22443w04;
            }
            abstractC22443w02 = abstractC22443w0.f40913r;
        }
    }

    public static final long d(@Y61.k A a12) {
        A aX2 = a12.x();
        if (aX2 != null) {
            l0.g.f413384b.getClass();
            return aX2.z(a12, 0L);
        }
        l0.g.f413384b.getClass();
        return 0L;
    }

    public static final long e(@Y61.k A a12) {
        l0.g.f413384b.getClass();
        return a12.y(0L);
    }

    public static final long f(@Y61.k A a12) {
        l0.g.f413384b.getClass();
        return a12.O(0L);
    }
}
