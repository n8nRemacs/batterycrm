package androidx.compose.ui.layout;

import androidx.compose.ui.layout.K0;
import androidx.compose.ui.node.AbstractC22430p0;
import androidx.compose.ui.unit.C22712b;
import androidx.compose.ui.v;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: LookaheadScope.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/ApproachLayoutElement;", "Landroidx/compose/ui/node/p0;", "Landroidx/compose/ui/layout/g;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class ApproachLayoutElement extends AbstractC22430p0<C22360g> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.q<InterfaceC22362h, InterfaceC22363h0, C22712b, InterfaceC22367j0> f40324b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y41.l<androidx.compose.ui.unit.u, Boolean> f40325c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Y41.p<K0.a, A, Boolean> f40326d;

    public ApproachLayoutElement() {
        throw null;
    }

    public ApproachLayoutElement(Y41.q qVar, Y41.l lVar, Y41.p pVar, int i12, C42822w c42822w) {
        pVar = (i12 & 4) != 0 ? C22361g0.f40462a : pVar;
        this.f40324b = qVar;
        this.f40325c = lVar;
        this.f40326d = pVar;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final v.d a() {
        C22360g c22360g = new C22360g();
        c22360g.f40459p = this.f40324b;
        c22360g.f40460q = this.f40325c;
        c22360g.f40461r = this.f40326d;
        return c22360g;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final void b(v.d dVar) {
        C22360g c22360g = (C22360g) dVar;
        c22360g.f40459p = this.f40324b;
        c22360g.f40460q = this.f40325c;
        c22360g.f40461r = this.f40326d;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApproachLayoutElement)) {
            return false;
        }
        ApproachLayoutElement approachLayoutElement = (ApproachLayoutElement) obj;
        return kotlin.jvm.internal.L.f(this.f40324b, approachLayoutElement.f40324b) && kotlin.jvm.internal.L.f(this.f40325c, approachLayoutElement.f40325c) && kotlin.jvm.internal.L.f(this.f40326d, approachLayoutElement.f40326d);
    }

    public final int hashCode() {
        return this.f40326d.hashCode() + ((this.f40325c.hashCode() + (this.f40324b.hashCode() * 31)) * 31);
    }

    @Y61.k
    public final String toString() {
        return "ApproachLayoutElement(approachMeasure=" + this.f40324b + ", isMeasurementApproachInProgress=" + this.f40325c + ", isPlacementApproachInProgress=" + this.f40326d + ')';
    }
}
