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

/* compiled from: Selectable.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BC\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/compose/foundation/selection/SelectableElement;", "Landroidx/compose/ui/node/p0;", "Landroidx/compose/foundation/selection/e;", "", "selected", "Landroidx/compose/foundation/interaction/m;", "interactionSource", "Landroidx/compose/foundation/v1;", "indicationNodeFactory", "enabled", "Landroidx/compose/ui/semantics/i;", "role", "Lkotlin/Function0;", "Lkotlin/G0;", "onClick", "<init>", "(ZLandroidx/compose/foundation/interaction/m;Landroidx/compose/foundation/v1;ZLandroidx/compose/ui/semantics/i;LY41/a;Lkotlin/jvm/internal/w;)V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class SelectableElement extends AbstractC22430p0<e> {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f30102b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final androidx.compose.foundation.interaction.m f30103c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final InterfaceC21084v1 f30104d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f30105e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final androidx.compose.ui.semantics.i f30106f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Y41.a<G0> f30107g;

    public SelectableElement() {
        throw null;
    }

    public SelectableElement(boolean z12, androidx.compose.foundation.interaction.m mVar, InterfaceC21084v1 interfaceC21084v1, boolean z13, androidx.compose.ui.semantics.i iVar, Y41.a aVar, C42822w c42822w) {
        this.f30102b = z12;
        this.f30103c = mVar;
        this.f30104d = interfaceC21084v1;
        this.f30105e = z13;
        this.f30106f = iVar;
        this.f30107g = aVar;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final v.d a() {
        return new e(this.f30102b, this.f30103c, this.f30104d, this.f30105e, this.f30106f, this.f30107g, null);
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final void b(v.d dVar) {
        e eVar = (e) dVar;
        boolean z12 = eVar.f30126I;
        boolean z13 = this.f30102b;
        if (z12 != z13) {
            eVar.f30126I = z13;
            C22421l.g(eVar).Z();
        }
        eVar.u2(this.f30103c, this.f30104d, this.f30105e, null, this.f30106f, this.f30107g);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SelectableElement.class != obj.getClass()) {
            return false;
        }
        SelectableElement selectableElement = (SelectableElement) obj;
        return this.f30102b == selectableElement.f30102b && L.f(this.f30103c, selectableElement.f30103c) && L.f(this.f30104d, selectableElement.f30104d) && this.f30105e == selectableElement.f30105e && L.f(this.f30106f, selectableElement.f30106f) && this.f30107g == selectableElement.f30107g;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f30102b) * 31;
        androidx.compose.foundation.interaction.m mVar = this.f30103c;
        int iHashCode2 = (iHashCode + (mVar != null ? mVar.hashCode() : 0)) * 31;
        InterfaceC21084v1 interfaceC21084v1 = this.f30104d;
        int i12 = r.i((iHashCode2 + (interfaceC21084v1 != null ? interfaceC21084v1.hashCode() : 0)) * 31, 31, this.f30105e);
        androidx.compose.ui.semantics.i iVar = this.f30106f;
        return this.f30107g.hashCode() + ((i12 + (iVar != null ? Integer.hashCode(iVar.f41753a) : 0)) * 31);
    }
}
