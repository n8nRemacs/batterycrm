package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.G1;
import androidx.compose.foundation.lazy.layout.InterfaceC20722h0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: PagerScrollScope.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/pager/e0;", "Landroidx/compose/foundation/lazy/layout/h0;", "Landroidx/compose/foundation/gestures/G1;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class e0 implements InterfaceC20722h0, G1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ G1 f29921a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m0 f29922b;

    public e0(G1 g12, m0 m0Var) {
        this.f29922b = m0Var;
        this.f29921a = g12;
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC20722h0
    public final int P() {
        return this.f29922b.m();
    }

    @Override // androidx.compose.foundation.gestures.G1
    public final float a(float f12) {
        return this.f29921a.a(f12);
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC20722h0
    public final int b() {
        return this.f29922b.f29969f;
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC20722h0
    public final int c() {
        return this.f29922b.f29968e;
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC20722h0
    public final int d() {
        return ((InterfaceC20822p) C42745f0.Q(this.f29922b.l().h())).getIndex();
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC20722h0
    public final void e(int i12, int i13) {
        this.f29922b.t(i12, i13 / r0.o(), true);
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC20722h0
    public final int f(int i12) {
        m0 m0Var = this.f29922b;
        return (int) (kotlin.ranges.s.i(d0.a(m0Var) + kotlin.math.b.b(((m0Var.o() * (i12 - m0Var.j())) - (m0Var.k() * m0Var.o())) + 0), m0Var.f29971h, m0Var.f29970g) - d0.a(m0Var));
    }
}
