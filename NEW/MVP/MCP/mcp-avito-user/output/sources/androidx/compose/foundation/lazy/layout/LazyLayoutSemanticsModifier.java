package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.node.AbstractC22430p0;
import androidx.compose.ui.node.C22421l;
import androidx.compose.ui.v;
import kotlin.Metadata;

/* compiled from: LazyLayoutSemantics.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifier;", "Landroidx/compose/ui/node/p0;", "Landroidx/compose/foundation/lazy/layout/o0;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class LazyLayoutSemanticsModifier extends AbstractC22430p0<C20736o0> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.o f29339b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC20732m0 f29340c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Orientation f29341d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f29342e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f29343f;

    public LazyLayoutSemanticsModifier(@Y61.k kotlin.reflect.o oVar, @Y61.k InterfaceC20732m0 interfaceC20732m0, @Y61.k Orientation orientation, boolean z12, boolean z13) {
        this.f29339b = oVar;
        this.f29340c = interfaceC20732m0;
        this.f29341d = orientation;
        this.f29342e = z12;
        this.f29343f = z13;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final v.d a() {
        return new C20736o0(this.f29339b, this.f29340c, this.f29341d, this.f29342e, this.f29343f);
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final void b(v.d dVar) {
        C20736o0 c20736o0 = (C20736o0) dVar;
        c20736o0.f29468p = this.f29339b;
        c20736o0.f29469q = this.f29340c;
        Orientation orientation = c20736o0.f29470r;
        Orientation orientation2 = this.f29341d;
        if (orientation != orientation2) {
            c20736o0.f29470r = orientation2;
            C22421l.g(c20736o0).Z();
        }
        boolean z12 = c20736o0.f29471s;
        boolean z13 = this.f29342e;
        boolean z14 = this.f29343f;
        if (z12 == z13 && c20736o0.f29472t == z14) {
            return;
        }
        c20736o0.f29471s = z13;
        c20736o0.f29472t = z14;
        c20736o0.k2();
        C22421l.g(c20736o0).Z();
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyLayoutSemanticsModifier)) {
            return false;
        }
        LazyLayoutSemanticsModifier lazyLayoutSemanticsModifier = (LazyLayoutSemanticsModifier) obj;
        return this.f29339b == lazyLayoutSemanticsModifier.f29339b && kotlin.jvm.internal.L.f(this.f29340c, lazyLayoutSemanticsModifier.f29340c) && this.f29341d == lazyLayoutSemanticsModifier.f29341d && this.f29342e == lazyLayoutSemanticsModifier.f29342e && this.f29343f == lazyLayoutSemanticsModifier.f29343f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f29343f) + androidx.appcompat.app.r.i((this.f29341d.hashCode() + ((this.f29340c.hashCode() + (this.f29339b.hashCode() * 31)) * 31)) * 31, 31, this.f29342e);
    }
}
