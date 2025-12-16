package androidx.compose.foundation.layout;

import androidx.compose.ui.node.AbstractC22430p0;
import androidx.compose.ui.platform.C22547y1;
import androidx.compose.ui.v;
import kotlin.Metadata;

/* compiled from: Intrinsic.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/IntrinsicHeightElement;", "Landroidx/compose/ui/node/p0;", "Landroidx/compose/foundation/layout/y1;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class IntrinsicHeightElement extends AbstractC22430p0<C20642y1> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final IntrinsicSize f28330b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f28331c = true;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Y41.l<C22547y1, kotlin.G0> f28332d;

    public IntrinsicHeightElement(@Y61.k IntrinsicSize intrinsicSize, @Y61.k Y41.l lVar) {
        this.f28330b = intrinsicSize;
        this.f28332d = lVar;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final v.d a() {
        C20642y1 c20642y1 = new C20642y1();
        c20642y1.f28802p = this.f28330b;
        c20642y1.f28803q = this.f28331c;
        return c20642y1;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final void b(v.d dVar) {
        C20642y1 c20642y1 = (C20642y1) dVar;
        c20642y1.f28802p = this.f28330b;
        c20642y1.f28803q = this.f28331c;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        IntrinsicHeightElement intrinsicHeightElement = obj instanceof IntrinsicHeightElement ? (IntrinsicHeightElement) obj : null;
        if (intrinsicHeightElement == null) {
            return false;
        }
        return this.f28330b == intrinsicHeightElement.f28330b && this.f28331c == intrinsicHeightElement.f28331c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f28331c) + (this.f28330b.hashCode() * 31);
    }
}
