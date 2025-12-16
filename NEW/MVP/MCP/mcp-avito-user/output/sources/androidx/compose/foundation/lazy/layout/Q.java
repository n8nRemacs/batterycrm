package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.W0;
import androidx.compose.runtime.F3;
import androidx.compose.ui.layout.InterfaceC22369k0;
import androidx.compose.ui.unit.h;
import java.util.List;
import kotlin.Metadata;
import l0.n;

/* compiled from: LazyLayoutMeasureScope.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001\u0082\u0001\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/layout/Q;", "Landroidx/compose/ui/layout/k0;", "Landroidx/compose/foundation/lazy/layout/S;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@W0
@F3
/* loaded from: classes.dex */
public interface Q extends InterfaceC22369k0 {
    @Override // androidx.compose.ui.unit.n
    @F3
    default float E(long j12) {
        long jC2 = androidx.compose.ui.unit.y.c(j12);
        androidx.compose.ui.unit.A.f42832b.getClass();
        if (!androidx.compose.ui.unit.A.b(jC2, androidx.compose.ui.unit.A.f42833c)) {
            androidx.compose.foundation.internal.e.c("Only Sp can convert to Px");
        }
        float f42845c = getF42845c() * androidx.compose.ui.unit.y.d(j12);
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        return f42845c;
    }

    @Override // androidx.compose.ui.unit.d
    @F3
    default float J(int i12) {
        float f42844b = i12 / getF42844b();
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        return f42844b;
    }

    @Override // androidx.compose.ui.unit.d
    @F3
    default float K(float f12) {
        float f42844b = f12 / getF42844b();
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        return f42844b;
    }

    @Override // androidx.compose.ui.unit.d
    @F3
    default long L(long j12) {
        if (j12 == 9205357640488583168L) {
            l0.n.f413402b.getClass();
            return l0.n.f413403c;
        }
        float fM02 = M0(androidx.compose.ui.unit.l.d(j12));
        float fM03 = M0(androidx.compose.ui.unit.l.c(j12));
        long jFloatToRawIntBits = (Float.floatToRawIntBits(fM03) & 4294967295L) | (Float.floatToRawIntBits(fM02) << 32);
        n.a aVar = l0.n.f413402b;
        return jFloatToRawIntBits;
    }

    @Y61.k
    List<androidx.compose.ui.layout.K0> W(int i12, long j12);

    @Override // androidx.compose.ui.unit.d
    @F3
    default long n(long j12) {
        if (j12 != 9205357640488583168L) {
            return androidx.compose.ui.unit.i.a(K(Float.intBitsToFloat((int) (j12 >> 32))), K(Float.intBitsToFloat((int) (j12 & 4294967295L))));
        }
        androidx.compose.ui.unit.l.f42859b.getClass();
        return androidx.compose.ui.unit.l.f42860c;
    }

    @Override // androidx.compose.ui.unit.d
    @F3
    default long o(float f12) {
        return androidx.compose.ui.unit.z.f(4294967296L, f12 / (getF42844b() * getF42845c()));
    }

    @Override // androidx.compose.ui.unit.n
    @F3
    default long s(float f12) {
        return androidx.compose.ui.unit.z.f(4294967296L, f12 / getF42845c());
    }
}
