package androidx.compose.runtime.snapshots;

import androidx.collection.S0;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: Snapshot.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/snapshots/a0;", "Landroidx/compose/runtime/snapshots/e;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a0 extends C22160e {

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public final C22160e f38687p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f38688q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f38689r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.l
    public Y41.l<Object, G0> f38690s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.l
    public Y41.l<Object, G0> f38691t;

    /* renamed from: u, reason: collision with root package name */
    public final long f38692u;

    /* JADX WARN: Illegal instructions before constructor call */
    public a0(@Y61.l C22160e c22160e, @Y61.l Y41.l<Object, G0> lVar, @Y61.l Y41.l<Object, G0> lVar2, boolean z12, boolean z13) {
        Y41.l<Object, G0> lVarI;
        Y41.l<Object, G0> lVarY;
        Y41.l<C22174t, G0> lVar3 = C22176v.f38748a;
        C22174t.f38734f.getClass();
        super(0L, C22174t.f38735g, C22176v.k(lVar, (c22160e == null || (lVarY = c22160e.getF38696h()) == null) ? C22176v.f38757j.f38702f : lVarY, z12), C22176v.a(lVar2, (c22160e == null || (lVarI = c22160e.i()) == null) ? C22176v.f38757j.f38703g : lVarI));
        this.f38687p = c22160e;
        this.f38688q = z12;
        this.f38689r = z13;
        this.f38690s = this.f38702f;
        this.f38691t = this.f38703g;
        this.f38692u = androidx.compose.runtime.internal.T.a();
    }

    @Override // androidx.compose.runtime.snapshots.C22160e
    public final void B(@Y61.l S0<V> s02) {
        G.a();
        throw null;
    }

    @Override // androidx.compose.runtime.snapshots.C22160e
    @Y61.k
    public final C22160e C(@Y61.l Y41.l<Object, G0> lVar, @Y61.l Y41.l<Object, G0> lVar2) {
        Y41.l<Object, G0> lVarK = C22176v.k(lVar, this.f38690s, true);
        Y41.l<Object, G0> lVarA = C22176v.a(lVar2, this.f38691t);
        return !this.f38688q ? new a0(D().C(null, lVarA), lVarK, lVarA, false, true) : D().C(lVarK, lVarA);
    }

    public final C22160e D() {
        C22160e c22160e = this.f38687p;
        return c22160e == null ? C22176v.f38757j : c22160e;
    }

    @Override // androidx.compose.runtime.snapshots.C22160e, androidx.compose.runtime.snapshots.AbstractC22167l
    public final void c() {
        C22160e c22160e;
        this.f38723c = true;
        if (!this.f38689r || (c22160e = this.f38687p) == null) {
            return;
        }
        c22160e.c();
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC22167l
    @Y61.k
    /* renamed from: d */
    public final C22174t getF38721a() {
        return D().getF38721a();
    }

    @Override // androidx.compose.runtime.snapshots.C22160e, androidx.compose.runtime.snapshots.AbstractC22167l
    /* renamed from: e, reason: from getter */
    public final Y41.l getF38713f() {
        return this.f38690s;
    }

    @Override // androidx.compose.runtime.snapshots.C22160e, androidx.compose.runtime.snapshots.AbstractC22167l
    public final boolean f() {
        return D().f();
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC22167l
    /* renamed from: g */
    public final long getF38722b() {
        return D().getF38722b();
    }

    @Override // androidx.compose.runtime.snapshots.C22160e, androidx.compose.runtime.snapshots.AbstractC22167l
    /* renamed from: h */
    public final int getF38704h() {
        return D().getF38704h();
    }

    @Override // androidx.compose.runtime.snapshots.C22160e, androidx.compose.runtime.snapshots.AbstractC22167l
    @Y61.l
    public final Y41.l<Object, G0> i() {
        return this.f38691t;
    }

    @Override // androidx.compose.runtime.snapshots.C22160e, androidx.compose.runtime.snapshots.AbstractC22167l
    public final void k() {
        G.a();
        throw null;
    }

    @Override // androidx.compose.runtime.snapshots.C22160e, androidx.compose.runtime.snapshots.AbstractC22167l
    public final void l() {
        G.a();
        throw null;
    }

    @Override // androidx.compose.runtime.snapshots.C22160e, androidx.compose.runtime.snapshots.AbstractC22167l
    public final void m() {
        D().m();
    }

    @Override // androidx.compose.runtime.snapshots.C22160e, androidx.compose.runtime.snapshots.AbstractC22167l
    public final void n(@Y61.k V v12) {
        D().n(v12);
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC22167l
    public final void r(@Y61.k C22174t c22174t) {
        G.a();
        throw null;
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC22167l
    public final void s(long j12) {
        G.a();
        throw null;
    }

    @Override // androidx.compose.runtime.snapshots.C22160e, androidx.compose.runtime.snapshots.AbstractC22167l
    public final void t(int i12) {
        D().t(i12);
    }

    @Override // androidx.compose.runtime.snapshots.C22160e, androidx.compose.runtime.snapshots.AbstractC22167l
    @Y61.k
    public final AbstractC22167l u(@Y61.l Y41.l<Object, G0> lVar) {
        Y41.l<Object, G0> lVarK = C22176v.k(lVar, this.f38690s, true);
        return !this.f38688q ? C22176v.g(D().u(null), lVarK, true) : D().u(lVarK);
    }

    @Override // androidx.compose.runtime.snapshots.C22160e
    @Y61.k
    public final AbstractC22168m w() {
        return D().w();
    }

    @Override // androidx.compose.runtime.snapshots.C22160e
    @Y61.l
    public final S0<V> x() {
        return D().x();
    }

    @Override // androidx.compose.runtime.snapshots.C22160e
    @Y61.l
    /* renamed from: y */
    public final Y41.l<Object, G0> getF38696h() {
        return this.f38690s;
    }
}
