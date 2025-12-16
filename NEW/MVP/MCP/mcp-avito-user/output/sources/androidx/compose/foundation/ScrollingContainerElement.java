package androidx.compose.foundation;

import androidx.compose.foundation.gestures.InterfaceC20432a1;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.node.AbstractC22430p0;
import androidx.compose.ui.v;
import kotlin.Metadata;

/* compiled from: ScrollingContainer.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/ScrollingContainerElement;", "Landroidx/compose/ui/node/p0;", "Landroidx/compose/foundation/f2;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class ScrollingContainerElement extends AbstractC22430p0<f2> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.foundation.gestures.U1 f26843b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Orientation f26844c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f26845d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f26846e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final InterfaceC20432a1 f26847f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final androidx.compose.foundation.interaction.m f26848g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final androidx.compose.foundation.gestures.J f26849h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f26850i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final M1 f26851j;

    public ScrollingContainerElement(@Y61.l M1 m12, @Y61.l androidx.compose.foundation.gestures.J j12, @Y61.l InterfaceC20432a1 interfaceC20432a1, @Y61.k Orientation orientation, @Y61.k androidx.compose.foundation.gestures.U1 u12, @Y61.l androidx.compose.foundation.interaction.m mVar, boolean z12, boolean z13, boolean z14) {
        this.f26843b = u12;
        this.f26844c = orientation;
        this.f26845d = z12;
        this.f26846e = z13;
        this.f26847f = interfaceC20432a1;
        this.f26848g = mVar;
        this.f26849h = j12;
        this.f26850i = z14;
        this.f26851j = m12;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final v.d a() {
        f2 f2Var = new f2();
        f2Var.f27148r = this.f26843b;
        f2Var.f27149s = this.f26844c;
        f2Var.f27150t = this.f26845d;
        f2Var.f27151u = this.f26846e;
        f2Var.f27152v = this.f26847f;
        f2Var.f27153w = this.f26848g;
        f2Var.f27154x = this.f26849h;
        f2Var.f27155y = this.f26850i;
        f2Var.f27156z = this.f26851j;
        return f2Var;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final void b(v.d dVar) {
        androidx.compose.foundation.interaction.m mVar = this.f26848g;
        androidx.compose.foundation.gestures.J j12 = this.f26849h;
        androidx.compose.foundation.gestures.U1 u12 = this.f26843b;
        Orientation orientation = this.f26844c;
        boolean z12 = this.f26850i;
        ((f2) dVar).q2(this.f26851j, j12, this.f26847f, orientation, u12, mVar, z12, this.f26845d, this.f26846e);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ScrollingContainerElement.class != obj.getClass()) {
            return false;
        }
        ScrollingContainerElement scrollingContainerElement = (ScrollingContainerElement) obj;
        return kotlin.jvm.internal.L.f(this.f26843b, scrollingContainerElement.f26843b) && this.f26844c == scrollingContainerElement.f26844c && this.f26845d == scrollingContainerElement.f26845d && this.f26846e == scrollingContainerElement.f26846e && kotlin.jvm.internal.L.f(this.f26847f, scrollingContainerElement.f26847f) && kotlin.jvm.internal.L.f(this.f26848g, scrollingContainerElement.f26848g) && kotlin.jvm.internal.L.f(this.f26849h, scrollingContainerElement.f26849h) && this.f26850i == scrollingContainerElement.f26850i && kotlin.jvm.internal.L.f(this.f26851j, scrollingContainerElement.f26851j);
    }

    public final int hashCode() {
        int i12 = androidx.appcompat.app.r.i(androidx.appcompat.app.r.i((this.f26844c.hashCode() + (this.f26843b.hashCode() * 31)) * 31, 31, this.f26845d), 31, this.f26846e);
        InterfaceC20432a1 interfaceC20432a1 = this.f26847f;
        int iHashCode = (i12 + (interfaceC20432a1 != null ? interfaceC20432a1.hashCode() : 0)) * 31;
        androidx.compose.foundation.interaction.m mVar = this.f26848g;
        int iHashCode2 = (iHashCode + (mVar != null ? mVar.hashCode() : 0)) * 31;
        androidx.compose.foundation.gestures.J j12 = this.f26849h;
        int i13 = androidx.appcompat.app.r.i((iHashCode2 + (j12 != null ? j12.hashCode() : 0)) * 31, 31, this.f26850i);
        M1 m12 = this.f26851j;
        return i13 + (m12 != null ? m12.hashCode() : 0);
    }
}
