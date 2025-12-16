package androidx.compose.foundation.layout;

import androidx.compose.ui.node.AbstractC22430p0;
import androidx.compose.ui.node.C22421l;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.C22547y1;
import androidx.compose.ui.v;
import kotlin.Metadata;

/* compiled from: Offset.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/OffsetPxElement;", "Landroidx/compose/ui/node/p0;", "Landroidx/compose/foundation/layout/O1;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class OffsetPxElement extends AbstractC22430p0<O1> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<androidx.compose.ui.unit.d, androidx.compose.ui.unit.q> f28455b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f28456c = true;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Y41.l<C22547y1, kotlin.G0> f28457d;

    public OffsetPxElement(@Y61.k Y41.l lVar, @Y61.k Y41.l lVar2) {
        this.f28455b = lVar;
        this.f28457d = lVar2;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final v.d a() {
        O1 o12 = new O1();
        o12.f28446p = this.f28455b;
        o12.f28447q = this.f28456c;
        return o12;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final void b(v.d dVar) {
        O1 o12 = (O1) dVar;
        Y41.l<? super androidx.compose.ui.unit.d, androidx.compose.ui.unit.q> lVar = o12.f28446p;
        Y41.l<androidx.compose.ui.unit.d, androidx.compose.ui.unit.q> lVar2 = this.f28455b;
        boolean z12 = this.f28456c;
        if (lVar != lVar2 || o12.f28447q != z12) {
            LayoutNode layoutNodeG = C22421l.g(o12);
            LayoutNode.d dVar2 = LayoutNode.f40602T;
            layoutNodeG.n0(false);
        }
        o12.f28446p = lVar2;
        o12.f28447q = z12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        OffsetPxElement offsetPxElement = obj instanceof OffsetPxElement ? (OffsetPxElement) obj : null;
        if (offsetPxElement == null) {
            return false;
        }
        return this.f28455b == offsetPxElement.f28455b && this.f28456c == offsetPxElement.f28456c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f28456c) + (this.f28455b.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OffsetPxModifier(offset=");
        sb2.append(this.f28455b);
        sb2.append(", rtlAware=");
        return androidx.appcompat.app.r.x(sb2, this.f28456c, ')');
    }
}
