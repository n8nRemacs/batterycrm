package androidx.compose.runtime;

import kotlin.Metadata;

/* compiled from: Effects.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/k0;", "Landroidx/compose/runtime/B2;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.runtime.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C22113k0 implements B2 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<C22128n0, InterfaceC22118l0> f38482b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public InterfaceC22118l0 f38483c;

    /* JADX WARN: Multi-variable type inference failed */
    public C22113k0(@Y61.k Y41.l<? super C22128n0, ? extends InterfaceC22118l0> lVar) {
        this.f38482b = lVar;
    }

    @Override // androidx.compose.runtime.B2
    public final void c() {
        this.f38483c = this.f38482b.invoke(C22187u0.f38775a);
    }

    @Override // androidx.compose.runtime.B2
    public final void e() {
        InterfaceC22118l0 interfaceC22118l0 = this.f38483c;
        if (interfaceC22118l0 != null) {
            interfaceC22118l0.dispose();
        }
        this.f38483c = null;
    }

    @Override // androidx.compose.runtime.B2
    public final void b() {
    }
}
