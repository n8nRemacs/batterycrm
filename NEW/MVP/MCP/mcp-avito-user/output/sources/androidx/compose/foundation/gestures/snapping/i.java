package androidx.compose.foundation.gestures.snapping;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.pager.InterfaceC20822p;
import androidx.compose.foundation.pager.K;
import androidx.compose.foundation.pager.Z;
import androidx.compose.foundation.pager.j0;
import androidx.compose.foundation.pager.m0;
import androidx.compose.runtime.C22082i3;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PagerSnapLayoutInfoProvider.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/gestures/snapping/i;", "Landroidx/compose/foundation/gestures/snapping/u;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class i implements u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m0 f28009a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Y41.q<Float, Float, Float, Float> f28010b;

    public i(m0 m0Var, Y41.q qVar, j0 j0Var) {
        this.f28009a = m0Var;
        this.f28010b = qVar;
    }

    @Override // androidx.compose.foundation.gestures.snapping.u
    public final float a(float f12) {
        m0 m0Var = this.f28009a;
        v f29880o = m0Var.l().getF29880o();
        List<InterfaceC20822p> listH = m0Var.l().h();
        int size = listH.size();
        float f13 = Float.NEGATIVE_INFINITY;
        float f14 = Float.POSITIVE_INFINITY;
        for (int i12 = 0; i12 < size; i12++) {
            InterfaceC20822p interfaceC20822p = listH.get(i12);
            K kL2 = m0Var.l();
            int iC2 = (int) (kL2.getF29870e() == Orientation.f27425b ? kL2.c() & 4294967295L : kL2.c() >> 32);
            int iD2 = m0Var.l().d();
            int f29869d = m0Var.l().getF29869d();
            int f29867b = m0Var.l().getF29867b();
            int f30013m = interfaceC20822p.getF30013m();
            m0Var.m();
            float fC2 = f30013m - f29880o.c(iC2, f29867b, iD2, f29869d);
            if (fC2 <= 0.0f && fC2 > f13) {
                f13 = fC2;
            }
            if (fC2 >= 0.0f && fC2 < f14) {
                f14 = fC2;
            }
        }
        if (f13 == Float.NEGATIVE_INFINITY) {
            f13 = f14;
        }
        if (f14 == Float.POSITIVE_INFINITY) {
            f14 = f13;
        }
        if (!m0Var.b()) {
            if (j.b(m0Var, f12)) {
                f13 = 0.0f;
                f14 = 0.0f;
            } else {
                f14 = 0.0f;
            }
        }
        if (!m0Var.d()) {
            f13 = 0.0f;
            if (!j.b(m0Var, f12)) {
                f14 = 0.0f;
            }
        }
        Float fValueOf = Float.valueOf(f13);
        Float fValueOf2 = Float.valueOf(f14);
        float fFloatValue = fValueOf.floatValue();
        float fFloatValue2 = fValueOf2.floatValue();
        float fFloatValue3 = this.f28010b.invoke(Float.valueOf(f12), Float.valueOf(fFloatValue), Float.valueOf(fFloatValue2)).floatValue();
        if (fFloatValue3 != fFloatValue && fFloatValue3 != fFloatValue2 && fFloatValue3 != 0.0f) {
            androidx.compose.foundation.internal.e.c("Final Snapping Offset Should Be one of " + fFloatValue + ", " + fFloatValue2 + " or 0.0");
        }
        if (fFloatValue3 == Float.POSITIVE_INFINITY || fFloatValue3 == Float.NEGATIVE_INFINITY) {
            return 0.0f;
        }
        return fFloatValue3;
    }

    @Override // androidx.compose.foundation.gestures.snapping.u
    public final float b(float f12, float f13) {
        m0 m0Var = this.f28009a;
        int iN2 = ((Z) ((C22082i3) m0Var.f29979p).getF42167b()).f29868c + m0Var.n();
        if (iN2 == 0) {
            return 0.0f;
        }
        int i12 = f12 < 0.0f ? m0Var.f29968e + 1 : m0Var.f29968e;
        int iG2 = kotlin.ranges.s.g(((int) (f13 / iN2)) + i12, 0, m0Var.m());
        m0Var.n();
        int i13 = ((Z) ((C22082i3) m0Var.f29979p).getF42167b()).f29868c;
        long j12 = i12;
        long j13 = 1;
        int iAbs = Math.abs((kotlin.ranges.s.g(kotlin.ranges.s.g(iG2, (int) kotlin.ranges.s.b(j12 - j13, 0L), (int) kotlin.ranges.s.d(j12 + j13, 2147483647L)), 0, m0Var.m()) - i12) * iN2) - iN2;
        int i14 = iAbs >= 0 ? iAbs : 0;
        if (i14 == 0) {
            return i14;
        }
        return Math.signum(f12) * i14;
    }
}
