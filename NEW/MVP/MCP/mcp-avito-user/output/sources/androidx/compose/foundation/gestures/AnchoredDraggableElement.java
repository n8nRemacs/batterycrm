package androidx.compose.foundation.gestures;

import androidx.compose.ui.node.AbstractC22430p0;
import androidx.compose.ui.v;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AnchoredDraggable.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/gestures/AnchoredDraggableElement;", "T", "Landroidx/compose/ui/node/p0;", "Landroidx/compose/foundation/gestures/p;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class AnchoredDraggableElement<T> extends AbstractC22430p0<C20490p<T>> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C20501s<T> f27184b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Orientation f27185c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f27186d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Boolean f27187e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final androidx.compose.foundation.interaction.m f27188f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final Boolean f27189g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final androidx.compose.foundation.M1 f27190h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final InterfaceC20432a1 f27191i;

    public AnchoredDraggableElement() {
        throw null;
    }

    public AnchoredDraggableElement(C20501s c20501s, Orientation orientation, boolean z12, Boolean bool, androidx.compose.foundation.interaction.m mVar, Boolean bool2, androidx.compose.foundation.M1 m12, InterfaceC20432a1 interfaceC20432a1, int i12, C42822w c42822w) {
        bool2 = (i12 & 32) != 0 ? null : bool2;
        interfaceC20432a1 = (i12 & 128) != 0 ? null : interfaceC20432a1;
        this.f27184b = c20501s;
        this.f27185c = orientation;
        this.f27186d = z12;
        this.f27187e = bool;
        this.f27188f = mVar;
        this.f27189g = bool2;
        this.f27190h = m12;
        this.f27191i = interfaceC20432a1;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final v.d a() {
        Y41.l<androidx.compose.ui.input.pointer.C, Boolean> lVar = C20438c.f27581a;
        boolean z12 = this.f27186d;
        androidx.compose.foundation.interaction.m mVar = this.f27188f;
        Orientation orientation = this.f27185c;
        C20490p c20490p = new C20490p(lVar, z12, mVar, orientation);
        c20490p.f27894z = this.f27184b;
        c20490p.f27887A = orientation;
        c20490p.f27888B = this.f27187e;
        c20490p.f27889C = this.f27190h;
        c20490p.f27890D = this.f27189g;
        c20490p.f27891E = this.f27191i;
        return c20490p;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final void b(v.d dVar) {
        boolean z12;
        boolean z13;
        C20490p c20490p = (C20490p) dVar;
        InterfaceC20432a1 interfaceC20432a1 = this.f27191i;
        c20490p.f27891E = interfaceC20432a1;
        C20501s<T> c20501s = c20490p.f27894z;
        C20501s<T> c20501s2 = this.f27184b;
        if (kotlin.jvm.internal.L.f(c20501s, c20501s2)) {
            z12 = false;
        } else {
            c20490p.f27894z = c20501s2;
            c20490p.y2(interfaceC20432a1);
            z12 = true;
        }
        Orientation orientation = c20490p.f27887A;
        Orientation orientation2 = this.f27185c;
        if (orientation != orientation2) {
            c20490p.f27887A = orientation2;
            z12 = true;
        }
        Boolean bool = c20490p.f27888B;
        Boolean bool2 = this.f27187e;
        if (kotlin.jvm.internal.L.f(bool, bool2)) {
            z13 = z12;
        } else {
            c20490p.f27888B = bool2;
            z13 = true;
        }
        c20490p.f27890D = this.f27189g;
        c20490p.f27889C = this.f27190h;
        c20490p.v2(c20490p.f27269s, this.f27186d, this.f27188f, orientation2, z13);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnchoredDraggableElement)) {
            return false;
        }
        AnchoredDraggableElement anchoredDraggableElement = (AnchoredDraggableElement) obj;
        return kotlin.jvm.internal.L.f(this.f27184b, anchoredDraggableElement.f27184b) && this.f27185c == anchoredDraggableElement.f27185c && this.f27186d == anchoredDraggableElement.f27186d && kotlin.jvm.internal.L.f(this.f27187e, anchoredDraggableElement.f27187e) && kotlin.jvm.internal.L.f(this.f27188f, anchoredDraggableElement.f27188f) && kotlin.jvm.internal.L.f(this.f27189g, anchoredDraggableElement.f27189g) && kotlin.jvm.internal.L.f(this.f27190h, anchoredDraggableElement.f27190h) && kotlin.jvm.internal.L.f(this.f27191i, anchoredDraggableElement.f27191i);
    }

    public final int hashCode() {
        int i12 = androidx.appcompat.app.r.i((this.f27185c.hashCode() + (this.f27184b.hashCode() * 31)) * 31, 31, this.f27186d);
        Boolean bool = this.f27187e;
        int iHashCode = (i12 + (bool != null ? bool.hashCode() : 0)) * 31;
        androidx.compose.foundation.interaction.m mVar = this.f27188f;
        int iHashCode2 = (iHashCode + (mVar != null ? mVar.hashCode() : 0)) * 31;
        Boolean bool2 = this.f27189g;
        int iHashCode3 = (iHashCode2 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        androidx.compose.foundation.M1 m12 = this.f27190h;
        int iHashCode4 = (iHashCode3 + (m12 != null ? m12.hashCode() : 0)) * 31;
        InterfaceC20432a1 interfaceC20432a1 = this.f27191i;
        return iHashCode4 + (interfaceC20432a1 != null ? interfaceC20432a1.hashCode() : 0);
    }
}
