package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.InterfaceC20731m;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: PagerBeyondBoundsModifier.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/pager/s;", "Landroidx/compose/foundation/lazy/layout/m;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.pager.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20824s implements InterfaceC20731m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final m0 f30029a;

    /* renamed from: b, reason: collision with root package name */
    public final int f30030b;

    public C20824s(@Y61.k m0 m0Var, int i12) {
        this.f30029a = m0Var;
        this.f30030b = i12;
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC20731m
    public final int P() {
        return this.f30029a.m();
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC20731m
    public final int Q() {
        return Math.max(0, this.f30029a.f29968e - this.f30030b);
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC20731m
    public final int R() {
        int i12;
        m0 m0Var = this.f30029a;
        if (m0Var.l().h().size() == 0) {
            return 0;
        }
        K kL2 = m0Var.l();
        int iC2 = (int) (kL2.getF29870e() == Orientation.f27425b ? kL2.c() & 4294967295L : kL2.c() >> 32);
        int f29868c = m0Var.l().getF29868c() + m0Var.l().getF29867b();
        if (f29868c != 0 && (i12 = iC2 / f29868c) >= 1) {
            return i12;
        }
        return 1;
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC20731m
    public final boolean S() {
        return !this.f30029a.l().h().isEmpty();
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC20731m
    public final int T() {
        return Math.min(r0.m() - 1, ((InterfaceC20822p) C42745f0.Q(this.f30029a.l().h())).getF30001a() + this.f30030b);
    }
}
