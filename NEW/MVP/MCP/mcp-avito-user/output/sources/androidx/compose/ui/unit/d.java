package androidx.compose.ui.unit;

import androidx.compose.runtime.F3;
import androidx.compose.runtime.H0;
import androidx.compose.ui.unit.h;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import l0.n;

/* compiled from: Density.kt */
@H0
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/unit/d;", "Landroidx/compose/ui/unit/n;", "ui-unit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface d extends n {

    /* compiled from: Density.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @F3
    default float A0(long j12) {
        long jC2 = y.c(j12);
        A.f42832b.getClass();
        if (!A.b(jC2, A.f42833c)) {
            p.b("Only Sp can convert to Px");
        }
        return M0(E(j12));
    }

    @F3
    default float J(int i12) {
        float density = i12 / getDensity();
        h.a aVar = h.f42849c;
        return density;
    }

    @F3
    default float K(float f12) {
        float density = f12 / getDensity();
        h.a aVar = h.f42849c;
        return density;
    }

    @F3
    default long L(long j12) {
        if (j12 == 9205357640488583168L) {
            l0.n.f413402b.getClass();
            return l0.n.f413403c;
        }
        float fM02 = M0(l.d(j12));
        float fM03 = M0(l.c(j12));
        long jFloatToRawIntBits = (Float.floatToRawIntBits(fM03) & 4294967295L) | (Float.floatToRawIntBits(fM02) << 32);
        n.a aVar = l0.n.f413402b;
        return jFloatToRawIntBits;
    }

    @F3
    default float M0(float f12) {
        return getDensity() * f12;
    }

    @F3
    default int O0(long j12) {
        return Math.round(A0(j12));
    }

    float getDensity();

    @F3
    default long n(long j12) {
        if (j12 != 9205357640488583168L) {
            return i.a(K(Float.intBitsToFloat((int) (j12 >> 32))), K(Float.intBitsToFloat((int) (j12 & 4294967295L))));
        }
        l.f42859b.getClass();
        return l.f42860c;
    }

    @F3
    default long o(float f12) {
        return s(K(f12));
    }

    @F3
    default int y0(float f12) {
        float fM02 = M0(f12);
        if (Float.isInfinite(fM02)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(fM02);
    }
}
