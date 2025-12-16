package androidx.compose.runtime.snapshots;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Snapshot.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/snapshots/b0;", "Landroidx/compose/runtime/snapshots/l;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b0 extends AbstractC22167l {

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final AbstractC22167l f38694f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f38695g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public Y41.l<Object, G0> f38696h;

    /* renamed from: i, reason: collision with root package name */
    public final long f38697i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(@Y61.l AbstractC22167l abstractC22167l, @Y61.l Y41.l lVar, boolean z12) {
        Y41.l<Object, G0> f38696h;
        super(0L, C22174t.f38735g, (C42822w) null);
        Y41.l<C22174t, G0> lVar2 = C22176v.f38748a;
        C22174t.f38734f.getClass();
        this.f38694f = abstractC22167l;
        this.f38695g = z12;
        this.f38696h = C22176v.k(lVar, (abstractC22167l == null || (f38696h = abstractC22167l.getF38713f()) == null) ? C22176v.f38757j.f38702f : f38696h, false);
        this.f38697i = androidx.compose.runtime.internal.T.a();
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC22167l
    public final void c() {
        AbstractC22167l abstractC22167l;
        this.f38723c = true;
        if (!this.f38695g || (abstractC22167l = this.f38694f) == null) {
            return;
        }
        abstractC22167l.c();
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC22167l
    @Y61.k
    /* renamed from: d */
    public final C22174t getF38721a() {
        return v().getF38721a();
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC22167l
    /* renamed from: e, reason: from getter */
    public final Y41.l getF38713f() {
        return this.f38696h;
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC22167l
    public final boolean f() {
        return v().f();
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC22167l
    /* renamed from: g */
    public final long getF38722b() {
        return v().getF38722b();
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
    public final void m() {
        v().m();
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC22167l
    public final void n(@Y61.k V v12) {
        v().n(v12);
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC22167l
    @Y61.k
    public final AbstractC22167l u(@Y61.l Y41.l<Object, G0> lVar) {
        return C22176v.g(v().u(null), C22176v.k(lVar, this.f38696h, true), true);
    }

    public final AbstractC22167l v() {
        AbstractC22167l abstractC22167l = this.f38694f;
        return abstractC22167l == null ? C22176v.f38757j : abstractC22167l;
    }
}
