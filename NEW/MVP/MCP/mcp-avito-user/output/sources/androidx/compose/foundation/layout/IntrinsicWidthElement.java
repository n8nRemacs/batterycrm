package androidx.compose.foundation.layout;

import androidx.compose.ui.node.AbstractC22430p0;
import androidx.compose.ui.platform.C22547y1;
import androidx.compose.ui.v;
import kotlin.Metadata;

/* compiled from: Intrinsic.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/IntrinsicWidthElement;", "Landroidx/compose/ui/node/p0;", "Landroidx/compose/foundation/layout/E1;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class IntrinsicWidthElement extends AbstractC22430p0<E1> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final IntrinsicSize f28337b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f28338c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Y41.l<C22547y1, kotlin.G0> f28339d;

    /* JADX WARN: Multi-variable type inference failed */
    public IntrinsicWidthElement(@Y61.k IntrinsicSize intrinsicSize, boolean z12, @Y61.k Y41.l<? super C22547y1, kotlin.G0> lVar) {
        this.f28337b = intrinsicSize;
        this.f28338c = z12;
        this.f28339d = lVar;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final v.d a() {
        E1 e12 = new E1();
        e12.f28238p = this.f28337b;
        e12.f28239q = this.f28338c;
        return e12;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final void b(v.d dVar) {
        E1 e12 = (E1) dVar;
        e12.f28238p = this.f28337b;
        e12.f28239q = this.f28338c;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        IntrinsicWidthElement intrinsicWidthElement = obj instanceof IntrinsicWidthElement ? (IntrinsicWidthElement) obj : null;
        if (intrinsicWidthElement == null) {
            return false;
        }
        return this.f28337b == intrinsicWidthElement.f28337b && this.f28338c == intrinsicWidthElement.f28338c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f28338c) + (this.f28337b.hashCode() * 31);
    }
}
