package androidx.compose.foundation.gestures;

import androidx.compose.ui.node.AbstractC22430p0;
import androidx.compose.ui.v;
import kotlin.Metadata;

/* compiled from: Scrollable.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollableElement;", "Landroidx/compose/ui/node/p0;", "Landroidx/compose/foundation/gestures/O1;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class ScrollableElement extends AbstractC22430p0<O1> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final U1 f27462b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Orientation f27463c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f27464d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f27465e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final androidx.compose.foundation.interaction.m f27466f;

    public ScrollableElement(@Y61.k U1 u12, @Y61.k Orientation orientation, boolean z12, boolean z13, @Y61.l androidx.compose.foundation.interaction.m mVar) {
        this.f27462b = u12;
        this.f27463c = orientation;
        this.f27464d = z12;
        this.f27465e = z13;
        this.f27466f = mVar;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final v.d a() {
        androidx.compose.foundation.interaction.m mVar = this.f27466f;
        return new O1(null, null, null, this.f27463c, this.f27462b, mVar, this.f27464d, this.f27465e);
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final void b(v.d dVar) {
        androidx.compose.foundation.interaction.m mVar = this.f27466f;
        ((O1) dVar).w2(null, null, null, this.f27463c, this.f27462b, mVar, this.f27464d, this.f27465e);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScrollableElement)) {
            return false;
        }
        ScrollableElement scrollableElement = (ScrollableElement) obj;
        return kotlin.jvm.internal.L.f(this.f27462b, scrollableElement.f27462b) && this.f27463c == scrollableElement.f27463c && kotlin.jvm.internal.L.f(null, null) && this.f27464d == scrollableElement.f27464d && this.f27465e == scrollableElement.f27465e && kotlin.jvm.internal.L.f(null, null) && kotlin.jvm.internal.L.f(this.f27466f, scrollableElement.f27466f) && kotlin.jvm.internal.L.f(null, null);
    }

    public final int hashCode() {
        int i12 = androidx.appcompat.app.r.i(androidx.appcompat.app.r.i((this.f27463c.hashCode() + (this.f27462b.hashCode() * 31)) * 961, 31, this.f27464d), 961, this.f27465e);
        androidx.compose.foundation.interaction.m mVar = this.f27466f;
        return (i12 + (mVar != null ? mVar.hashCode() : 0)) * 31;
    }
}
