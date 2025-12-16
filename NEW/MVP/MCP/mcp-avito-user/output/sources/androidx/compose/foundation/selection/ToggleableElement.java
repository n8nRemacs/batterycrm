package androidx.compose.foundation.selection;

import androidx.appcompat.app.r;
import androidx.compose.foundation.InterfaceC21084v1;
import androidx.compose.ui.node.AbstractC22430p0;
import androidx.compose.ui.node.C22421l;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: Toggleable.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BI\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/compose/foundation/selection/ToggleableElement;", "Landroidx/compose/ui/node/p0;", "Landroidx/compose/foundation/selection/m;", "", "value", "Landroidx/compose/foundation/interaction/m;", "interactionSource", "Landroidx/compose/foundation/v1;", "indicationNodeFactory", "enabled", "Landroidx/compose/ui/semantics/i;", "role", "Lkotlin/Function1;", "Lkotlin/G0;", "onValueChange", "<init>", "(ZLandroidx/compose/foundation/interaction/m;Landroidx/compose/foundation/v1;ZLandroidx/compose/ui/semantics/i;LY41/l;Lkotlin/jvm/internal/w;)V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class ToggleableElement extends AbstractC22430p0<m> {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f30108b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final androidx.compose.foundation.interaction.m f30109c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final InterfaceC21084v1 f30110d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f30111e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final androidx.compose.ui.semantics.i f30112f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Y41.l<Boolean, G0> f30113g;

    public ToggleableElement() {
        throw null;
    }

    public ToggleableElement(boolean z12, androidx.compose.foundation.interaction.m mVar, InterfaceC21084v1 interfaceC21084v1, boolean z13, androidx.compose.ui.semantics.i iVar, Y41.l lVar, C42822w c42822w) {
        this.f30108b = z12;
        this.f30109c = mVar;
        this.f30110d = interfaceC21084v1;
        this.f30111e = z13;
        this.f30112f = iVar;
        this.f30113g = lVar;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final v.d a() {
        return new m(this.f30108b, this.f30109c, this.f30110d, this.f30111e, this.f30112f, this.f30113g, null);
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final void b(v.d dVar) {
        m mVar = (m) dVar;
        boolean z12 = mVar.f30143I;
        boolean z13 = this.f30108b;
        if (z12 != z13) {
            mVar.f30143I = z13;
            C22421l.g(mVar).Z();
        }
        mVar.f30144J = this.f30113g;
        Y41.a<G0> aVar = mVar.f30145K;
        mVar.u2(this.f30109c, this.f30110d, this.f30111e, null, this.f30112f, aVar);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ToggleableElement.class != obj.getClass()) {
            return false;
        }
        ToggleableElement toggleableElement = (ToggleableElement) obj;
        return this.f30108b == toggleableElement.f30108b && L.f(this.f30109c, toggleableElement.f30109c) && L.f(this.f30110d, toggleableElement.f30110d) && this.f30111e == toggleableElement.f30111e && L.f(this.f30112f, toggleableElement.f30112f) && this.f30113g == toggleableElement.f30113g;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f30108b) * 31;
        androidx.compose.foundation.interaction.m mVar = this.f30109c;
        int iHashCode2 = (iHashCode + (mVar != null ? mVar.hashCode() : 0)) * 31;
        InterfaceC21084v1 interfaceC21084v1 = this.f30110d;
        int i12 = r.i((iHashCode2 + (interfaceC21084v1 != null ? interfaceC21084v1.hashCode() : 0)) * 31, 31, this.f30111e);
        androidx.compose.ui.semantics.i iVar = this.f30112f;
        return this.f30113g.hashCode() + ((i12 + (iVar != null ? Integer.hashCode(iVar.f41753a) : 0)) * 31);
    }
}
