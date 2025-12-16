package com.akita.compose.component.docking_badge;

import androidx.compose.ui.node.AbstractC22430p0;
import androidx.compose.ui.v;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: EdgePadding.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/akita/compose/component/docking_badge/EdgePaddingElement;", "Landroidx/compose/ui/node/p0;", "Lcom/akita/compose/component/docking_badge/k;", "docking-badge_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class EdgePaddingElement extends AbstractC22430p0<k> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final m f61502b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final m f61503c;

    public EdgePaddingElement(@Y61.k m mVar, @Y61.k m mVar2) {
        this.f61502b = mVar;
        this.f61503c = mVar2;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final v.d a() {
        k kVar = new k();
        kVar.f61546p = this.f61502b;
        kVar.f61547q = this.f61503c;
        return kVar;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final void b(v.d dVar) {
        k kVar = (k) dVar;
        kVar.f61546p = this.f61502b;
        kVar.f61547q = this.f61503c;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!EdgePaddingElement.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        EdgePaddingElement edgePaddingElement = (EdgePaddingElement) obj;
        return L.f(this.f61502b, edgePaddingElement.f61502b) && L.f(this.f61503c, edgePaddingElement.f61503c);
    }

    public final int hashCode() {
        return this.f61503c.hashCode() + (this.f61502b.hashCode() * 31);
    }
}
