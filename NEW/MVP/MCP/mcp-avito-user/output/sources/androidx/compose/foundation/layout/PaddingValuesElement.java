package androidx.compose.foundation.layout;

import androidx.compose.ui.node.AbstractC22430p0;
import androidx.compose.ui.platform.C22547y1;
import androidx.compose.ui.v;
import kotlin.Metadata;

/* compiled from: Padding.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/PaddingValuesElement;", "Landroidx/compose/ui/node/p0;", "Landroidx/compose/foundation/layout/X1;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class PaddingValuesElement extends AbstractC22430p0<X1> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final T1 f28473b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y41.l<C22547y1, kotlin.G0> f28474c;

    /* JADX WARN: Multi-variable type inference failed */
    public PaddingValuesElement(@Y61.k T1 t12, @Y61.k Y41.l<? super C22547y1, kotlin.G0> lVar) {
        this.f28473b = t12;
        this.f28474c = lVar;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final v.d a() {
        X1 x12 = new X1();
        x12.f28548p = this.f28473b;
        return x12;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final void b(v.d dVar) {
        ((X1) dVar).f28548p = this.f28473b;
    }

    public final boolean equals(@Y61.l Object obj) {
        PaddingValuesElement paddingValuesElement = obj instanceof PaddingValuesElement ? (PaddingValuesElement) obj : null;
        if (paddingValuesElement == null) {
            return false;
        }
        return kotlin.jvm.internal.L.f(this.f28473b, paddingValuesElement.f28473b);
    }

    public final int hashCode() {
        return this.f28473b.hashCode();
    }
}
