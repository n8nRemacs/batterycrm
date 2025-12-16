package androidx.compose.foundation.lazy.grid;

import androidx.collection.C20247y0;
import androidx.compose.foundation.lazy.layout.C20710b0;
import androidx.compose.runtime.InterfaceC22132o;
import kotlin.Metadata;

/* compiled from: LazyGridItemProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/grid/S;", "Landroidx/compose/foundation/lazy/grid/P;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class S implements P {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final I0 f29072a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final H f29073b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.foundation.lazy.layout.D0 f29074c;

    public S(@Y61.k I0 i02, @Y61.k H h12, @Y61.k androidx.compose.foundation.lazy.layout.D0 d02) {
        this.f29072a = i02;
        this.f29073b = h12;
        this.f29074c = d02;
    }

    @Override // androidx.compose.foundation.lazy.layout.F
    public final int P() {
        return this.f29073b.getF28997b().f29258b;
    }

    @Override // androidx.compose.foundation.lazy.grid.P
    @Y61.k
    public final androidx.compose.foundation.lazy.layout.I a() {
        return this.f29074c;
    }

    @Override // androidx.compose.foundation.lazy.layout.F
    public final int b(@Y61.k Object obj) {
        return this.f29074c.b(obj);
    }

    @Override // androidx.compose.foundation.lazy.grid.P
    @Y61.k
    public final C20247y0 c() {
        this.f29073b.getClass();
        return androidx.collection.G.f25546a;
    }

    @Override // androidx.compose.foundation.lazy.layout.F
    @InterfaceC22132o
    public final void e(int i12, @Y61.l androidx.compose.runtime.A a12, @Y61.k Object obj) {
        a12.C(1493551140);
        C20710b0.a(obj, i12, this.f29072a.f29035q, androidx.compose.runtime.internal.r.c(726189336, new Q(this, i12), a12), a12, 3072);
        a12.h();
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S)) {
            return false;
        }
        return kotlin.jvm.internal.L.f(this.f29073b, ((S) obj).f29073b);
    }

    @Override // androidx.compose.foundation.lazy.layout.F
    @Y61.l
    public final Object g(int i12) {
        return this.f29073b.g(i12);
    }

    @Override // androidx.compose.foundation.lazy.layout.F
    @Y61.k
    public final Object getKey(int i12) {
        Object objA = this.f29074c.a(i12);
        return objA == null ? this.f29073b.i(i12) : objA;
    }

    @Override // androidx.compose.foundation.lazy.grid.P
    @Y61.k
    public final H0 h() {
        return this.f29073b.f28996a;
    }

    public final int hashCode() {
        return this.f29073b.hashCode();
    }
}
