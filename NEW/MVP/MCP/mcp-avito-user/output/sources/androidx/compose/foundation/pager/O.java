package androidx.compose.foundation.pager;

import androidx.compose.foundation.lazy.layout.AbstractC20735o;
import androidx.compose.foundation.lazy.layout.C20710b0;
import androidx.compose.foundation.lazy.layout.D0;
import androidx.compose.runtime.InterfaceC22132o;
import kotlin.Metadata;

/* compiled from: LazyLayoutPager.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/pager/O;", "Landroidx/compose/foundation/lazy/layout/F;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class O implements androidx.compose.foundation.lazy.layout.F {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final m0 f29823a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final AbstractC20735o<C20829x> f29824b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final D0 f29825c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final b0 f29826d = b0.f29893a;

    public O(@Y61.k m0 m0Var, @Y61.k AbstractC20735o abstractC20735o, @Y61.k D0 d02) {
        this.f29823a = m0Var;
        this.f29824b = abstractC20735o;
        this.f29825c = d02;
    }

    @Override // androidx.compose.foundation.lazy.layout.F
    public final int P() {
        return this.f29824b.getF28997b().f29258b;
    }

    @Override // androidx.compose.foundation.lazy.layout.F
    public final int b(@Y61.k Object obj) {
        return this.f29825c.b(obj);
    }

    @Override // androidx.compose.foundation.lazy.layout.F
    @InterfaceC22132o
    public final void e(int i12, @Y61.l androidx.compose.runtime.A a12, @Y61.k Object obj) {
        a12.C(-1201380429);
        m0 m0Var = this.f29823a;
        C20710b0.a(obj, i12, m0Var.f29957C, androidx.compose.runtime.internal.r.c(1142237095, new N(this, i12), a12), a12, 3072);
        a12.h();
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O)) {
            return false;
        }
        return kotlin.jvm.internal.L.f(this.f29824b, ((O) obj).f29824b);
    }

    @Override // androidx.compose.foundation.lazy.layout.F
    @Y61.k
    public final Object getKey(int i12) {
        Object objA = this.f29825c.a(i12);
        return objA == null ? this.f29824b.i(i12) : objA;
    }

    public final int hashCode() {
        return this.f29824b.hashCode();
    }
}
