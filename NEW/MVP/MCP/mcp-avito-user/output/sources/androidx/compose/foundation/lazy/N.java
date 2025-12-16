package androidx.compose.foundation.lazy;

import androidx.collection.C20247y0;
import androidx.compose.foundation.lazy.layout.C20710b0;
import androidx.compose.runtime.InterfaceC22132o;
import kotlin.Metadata;

/* compiled from: LazyListItemProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/N;", "Landroidx/compose/foundation/lazy/L;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class N implements L {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final w0 f28826a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final J f28827b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C20794z f28828c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.foundation.lazy.layout.D0 f28829d;

    public N(@Y61.k w0 w0Var, @Y61.k J j12, @Y61.k C20794z c20794z, @Y61.k androidx.compose.foundation.lazy.layout.D0 d02) {
        this.f28826a = w0Var;
        this.f28827b = j12;
        this.f28828c = c20794z;
        this.f28829d = d02;
    }

    @Override // androidx.compose.foundation.lazy.layout.F
    public final int P() {
        return this.f28827b.getF28997b().f29258b;
    }

    @Override // androidx.compose.foundation.lazy.L
    @Y61.k
    public final androidx.compose.foundation.lazy.layout.I a() {
        return this.f28829d;
    }

    @Override // androidx.compose.foundation.lazy.layout.F
    public final int b(@Y61.k Object obj) {
        return this.f28829d.b(obj);
    }

    @Override // androidx.compose.foundation.lazy.L
    @Y61.k
    public final C20247y0 c() {
        this.f28827b.getClass();
        return androidx.collection.G.f25546a;
    }

    @Override // androidx.compose.foundation.lazy.layout.F
    @InterfaceC22132o
    public final void e(int i12, @Y61.l androidx.compose.runtime.A a12, @Y61.k Object obj) {
        a12.C(-462424778);
        C20710b0.a(obj, i12, this.f28826a.f29730q, androidx.compose.runtime.internal.r.c(-824725566, new M(this, i12), a12), a12, 3072);
        a12.h();
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N)) {
            return false;
        }
        return kotlin.jvm.internal.L.f(this.f28827b, ((N) obj).f28827b);
    }

    @Override // androidx.compose.foundation.lazy.L
    @Y61.k
    /* renamed from: f, reason: from getter */
    public final C20794z getF28828c() {
        return this.f28828c;
    }

    @Override // androidx.compose.foundation.lazy.layout.F
    @Y61.l
    public final Object g(int i12) {
        return this.f28827b.g(i12);
    }

    @Override // androidx.compose.foundation.lazy.layout.F
    @Y61.k
    public final Object getKey(int i12) {
        Object objA = this.f28829d.a(i12);
        return objA == null ? this.f28827b.i(i12) : objA;
    }

    public final int hashCode() {
        return this.f28827b.hashCode();
    }
}
