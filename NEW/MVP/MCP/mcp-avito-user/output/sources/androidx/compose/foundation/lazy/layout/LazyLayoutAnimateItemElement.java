package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.R0;
import androidx.compose.ui.node.AbstractC22430p0;
import androidx.compose.ui.v;
import kotlin.Metadata;

/* compiled from: LazyLayoutItemAnimation.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateItemElement;", "Landroidx/compose/ui/node/p0;", "Landroidx/compose/foundation/lazy/layout/i;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class LazyLayoutAnimateItemElement extends AbstractC22430p0<C20723i> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final R0 f29310b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final R0 f29311c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final R0 f29312d;

    public LazyLayoutAnimateItemElement(@Y61.l R0 r02, @Y61.l R0 r03, @Y61.l R0 r04) {
        this.f29310b = r02;
        this.f29311c = r03;
        this.f29312d = r04;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final v.d a() {
        C20723i c20723i = new C20723i();
        c20723i.f29422p = this.f29310b;
        c20723i.f29423q = this.f29311c;
        c20723i.f29424r = this.f29312d;
        return c20723i;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final void b(v.d dVar) {
        C20723i c20723i = (C20723i) dVar;
        c20723i.f29422p = this.f29310b;
        c20723i.f29423q = this.f29311c;
        c20723i.f29424r = this.f29312d;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyLayoutAnimateItemElement)) {
            return false;
        }
        LazyLayoutAnimateItemElement lazyLayoutAnimateItemElement = (LazyLayoutAnimateItemElement) obj;
        return kotlin.jvm.internal.L.f(this.f29310b, lazyLayoutAnimateItemElement.f29310b) && kotlin.jvm.internal.L.f(this.f29311c, lazyLayoutAnimateItemElement.f29311c) && kotlin.jvm.internal.L.f(this.f29312d, lazyLayoutAnimateItemElement.f29312d);
    }

    public final int hashCode() {
        R0 r02 = this.f29310b;
        int iHashCode = (r02 == null ? 0 : r02.hashCode()) * 31;
        R0 r03 = this.f29311c;
        int iHashCode2 = (iHashCode + (r03 == null ? 0 : r03.hashCode())) * 31;
        R0 r04 = this.f29312d;
        return iHashCode2 + (r04 != null ? r04.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "LazyLayoutAnimateItemElement(fadeInSpec=" + this.f29310b + ", placementSpec=" + this.f29311c + ", fadeOutSpec=" + this.f29312d + ')';
    }
}
