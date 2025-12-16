package androidx.compose.runtime.snapshots;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: Snapshot.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/snapshots/g;", "Landroidx/compose/runtime/snapshots/l;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.runtime.snapshots.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22162g extends AbstractC22167l {

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Y41.l<Object, G0> f38713f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final AbstractC22167l f38714g;

    public C22162g(long j12, @Y61.k C22174t c22174t, @Y61.l Y41.l<Object, G0> lVar, @Y61.k AbstractC22167l abstractC22167l) {
        super(j12, c22174t, (C42822w) null);
        this.f38713f = lVar;
        this.f38714g = abstractC22167l;
        abstractC22167l.k();
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC22167l
    public final void c() {
        if (this.f38723c) {
            return;
        }
        long j12 = this.f38722b;
        AbstractC22167l abstractC22167l = this.f38714g;
        if (j12 != abstractC22167l.getF38722b()) {
            a();
        }
        abstractC22167l.l();
        super.c();
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC22167l
    /* renamed from: e, reason: from getter */
    public final Y41.l getF38713f() {
        return this.f38713f;
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC22167l
    public final boolean f() {
        return true;
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC22167l
    @Y61.l
    public final Y41.l<Object, G0> i() {
        return null;
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC22167l
    public final void k() {
        G.a();
        throw null;
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC22167l
    public final void l() {
        G.a();
        throw null;
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC22167l
    public final void n(V v12) {
        Y41.l<C22174t, G0> lVar = C22176v.f38748a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC22167l
    public final AbstractC22167l u(Y41.l lVar) {
        return new C22162g(this.f38722b, this.f38721a, C22176v.k(lVar, this.f38713f, true), this.f38714g);
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC22167l
    public final void m() {
    }
}
