package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.C20710b0;
import androidx.compose.runtime.InterfaceC22132o;
import kotlin.Metadata;

/* compiled from: LazyStaggeredGridItemProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/O;", "Landroidx/compose/foundation/lazy/staggeredgrid/M;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class O implements M {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final y0 f29578a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final K f29579b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.foundation.lazy.layout.D0 f29580c;

    public O(@Y61.k y0 y0Var, @Y61.k K k12, @Y61.k androidx.compose.foundation.lazy.layout.D0 d02) {
        this.f29578a = y0Var;
        this.f29579b = k12;
        this.f29580c = d02;
    }

    @Override // androidx.compose.foundation.lazy.layout.F
    public final int P() {
        return this.f29579b.getF29574a().f29258b;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.M
    @Y61.k
    public final androidx.compose.foundation.lazy.layout.I a() {
        return this.f29580c;
    }

    @Override // androidx.compose.foundation.lazy.layout.F
    public final int b(@Y61.k Object obj) {
        return this.f29580c.b(obj);
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.M
    @Y61.k
    public final x0 d() {
        return this.f29579b.f29575b;
    }

    @Override // androidx.compose.foundation.lazy.layout.F
    @InterfaceC22132o
    public final void e(int i12, @Y61.l androidx.compose.runtime.A a12, @Y61.k Object obj) {
        a12.C(89098518);
        C20710b0.a(obj, i12, this.f29578a.f29697r, androidx.compose.runtime.internal.r.c(608834466, new N(this, i12), a12), a12, 3072);
        a12.h();
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O)) {
            return false;
        }
        return kotlin.jvm.internal.L.f(this.f29579b, ((O) obj).f29579b);
    }

    @Override // androidx.compose.foundation.lazy.layout.F
    @Y61.l
    public final Object g(int i12) {
        return this.f29579b.g(i12);
    }

    @Override // androidx.compose.foundation.lazy.layout.F
    @Y61.k
    public final Object getKey(int i12) {
        Object objA = this.f29580c.a(i12);
        return objA == null ? this.f29579b.i(i12) : objA;
    }

    public final int hashCode() {
        return this.f29579b.hashCode();
    }
}
