package androidx.compose.foundation.pager;

import androidx.compose.runtime.C22082i3;
import kotlin.Metadata;

/* compiled from: LazyLayoutPager.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/pager/t;", "Landroidx/compose/foundation/gestures/J;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.pager.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20825t implements androidx.compose.foundation.gestures.J {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final m0 f30039b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.foundation.gestures.J f30040c;

    public C20825t(@Y61.k m0 m0Var, @Y61.k androidx.compose.foundation.gestures.J j12) {
        this.f30039b = m0Var;
        this.f30040c = j12;
    }

    @Override // androidx.compose.foundation.gestures.J
    public final float a(float f12, float f13, float f14) {
        float fA2 = this.f30040c.a(f12, f13, f14);
        boolean z12 = false;
        if (f12 <= 0.0f ? f12 + f13 <= 0.0f : f12 + f13 > f14) {
            z12 = true;
        }
        float fAbs = Math.abs(fA2);
        m0 m0Var = this.f30039b;
        if (fAbs == 0.0f || !z12) {
            if (Math.abs(m0Var.f29969f) < 1.0E-6d) {
                return 0.0f;
            }
            float fO2 = m0Var.f29969f * (-1.0f);
            if (((Boolean) ((C22082i3) m0Var.f29962H).getF42167b()).booleanValue()) {
                fO2 += m0Var.o();
            }
            return kotlin.ranges.s.f(fO2, -f14, f14);
        }
        float fO3 = m0Var.f29969f * (-1);
        while (fA2 > 0.0f && fO3 < fA2) {
            fO3 += m0Var.o();
        }
        while (fA2 < 0.0f && fO3 > fA2) {
            fO3 -= m0Var.o();
        }
        return fO3;
    }
}
