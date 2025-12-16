package androidx.compose.runtime;

import kotlin.Metadata;

/* compiled from: Applier.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/F1;", "N", "Landroidx/compose/runtime/i;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class F1<N> implements InterfaceC22078i<N> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22078i<N> f37965a;

    /* renamed from: b, reason: collision with root package name */
    public final int f37966b;

    /* renamed from: c, reason: collision with root package name */
    public int f37967c;

    public F1(@Y61.k InterfaceC22078i<N> interfaceC22078i, int i12) {
        this.f37965a = interfaceC22078i;
        this.f37966b = i12;
    }

    @Override // androidx.compose.runtime.InterfaceC22078i
    public final void clear() {
        G.c("Clear is not valid on OffsetApplier");
    }

    @Override // androidx.compose.runtime.InterfaceC22078i
    public final void d(int i12, N n12) {
        this.f37965a.d(i12 + (this.f37967c == 0 ? this.f37966b : 0), n12);
    }

    @Override // androidx.compose.runtime.InterfaceC22078i
    public final void e(N n12) {
        this.f37967c++;
        this.f37965a.e(n12);
    }

    @Override // androidx.compose.runtime.InterfaceC22078i
    public final void f(int i12, int i13) {
        this.f37965a.f(i12 + (this.f37967c == 0 ? this.f37966b : 0), i13);
    }

    @Override // androidx.compose.runtime.InterfaceC22078i
    public final void g(int i12, int i13, int i14) {
        int i15 = this.f37967c == 0 ? this.f37966b : 0;
        this.f37965a.g(i12 + i15, i13 + i15, i14);
    }

    @Override // androidx.compose.runtime.InterfaceC22078i
    public final void h(int i12, N n12) {
        this.f37965a.h(i12 + (this.f37967c == 0 ? this.f37966b : 0), n12);
    }

    @Override // androidx.compose.runtime.InterfaceC22078i
    public final N i() {
        return this.f37965a.i();
    }

    @Override // androidx.compose.runtime.InterfaceC22078i
    public final void j() {
        if (!(this.f37967c > 0)) {
            G.c("OffsetApplier up called with no corresponding down");
        }
        this.f37967c--;
        this.f37965a.j();
    }
}
