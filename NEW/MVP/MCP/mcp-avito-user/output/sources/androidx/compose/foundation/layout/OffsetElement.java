package androidx.compose.foundation.layout;

import androidx.compose.ui.node.AbstractC22430p0;
import androidx.compose.ui.node.C22421l;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.C22547y1;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Offset.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B8\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/compose/foundation/layout/OffsetElement;", "Landroidx/compose/ui/node/p0;", "Landroidx/compose/foundation/layout/N1;", "Landroidx/compose/ui/unit/h;", "x", "y", "", "rtlAware", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/y1;", "Lkotlin/G0;", "Lkotlin/w;", "inspectorInfo", "<init>", "(FFZLY41/l;Lkotlin/jvm/internal/w;)V", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class OffsetElement extends AbstractC22430p0<N1> {

    /* renamed from: b, reason: collision with root package name */
    public final float f28451b;

    /* renamed from: c, reason: collision with root package name */
    public final float f28452c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f28453d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Y41.l<C22547y1, kotlin.G0> f28454e;

    public OffsetElement() {
        throw null;
    }

    public OffsetElement(float f12, float f13, boolean z12, Y41.l lVar, C42822w c42822w) {
        this.f28451b = f12;
        this.f28452c = f13;
        this.f28453d = z12;
        this.f28454e = lVar;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final v.d a() {
        return new N1(this.f28451b, this.f28452c, this.f28453d, null);
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final void b(v.d dVar) {
        N1 n12 = (N1) dVar;
        float f12 = n12.f28434p;
        float f13 = this.f28451b;
        boolean zB2 = androidx.compose.ui.unit.h.b(f12, f13);
        float f14 = this.f28452c;
        boolean z12 = this.f28453d;
        if (!zB2 || !androidx.compose.ui.unit.h.b(n12.f28435q, f14) || n12.f28436r != z12) {
            LayoutNode layoutNodeG = C22421l.g(n12);
            LayoutNode.d dVar2 = LayoutNode.f40602T;
            layoutNodeG.n0(false);
        }
        n12.f28434p = f13;
        n12.f28435q = f14;
        n12.f28436r = z12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        OffsetElement offsetElement = obj instanceof OffsetElement ? (OffsetElement) obj : null;
        if (offsetElement == null) {
            return false;
        }
        return androidx.compose.ui.unit.h.b(this.f28451b, offsetElement.f28451b) && androidx.compose.ui.unit.h.b(this.f28452c, offsetElement.f28452c) && this.f28453d == offsetElement.f28453d;
    }

    public final int hashCode() {
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        return Boolean.hashCode(this.f28453d) + androidx.appcompat.app.r.d(this.f28452c, Float.hashCode(this.f28451b) * 31, 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OffsetModifierElement(x=");
        androidx.compose.foundation.H.u(this.f28451b, ", y=", sb2);
        androidx.compose.foundation.H.u(this.f28452c, ", rtlAware=", sb2);
        return androidx.appcompat.app.r.x(sb2, this.f28453d, ')');
    }
}
